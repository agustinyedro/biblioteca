package biblioteca.AccesoData;

import biblioteca75.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author luzel
 */
public class PrestamoData {

    private Connection connection;
    private LectorData lectorData;
    private EjemplarData ejemplarData;
    private Prestamo prestamo;

    public PrestamoData() {
        connection = Conexion.getConexion();
        ejemplarData = new EjemplarData();
        lectorData = new LectorData();
        prestamo = new Prestamo();
    }

    private boolean existePrestamo(Prestamo prestamo) throws SQLException {

        String sql = "SELECT COUNT(*) FROM prestamo WHERE fechaInicio = ? AND fechaFin = ? AND idEjemplar = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setDate(1, prestamo.getFechaInicio());
            ps.setDate(2, prestamo.getFechaFin());
            ps.setInt(3, prestamo.getEjemplar().getCodigo());
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    int count = rs.getInt(1);
                    return count > 0;
                }
            }
        }
        return false;
    }

    public void guardarPrestamo(Prestamo prestamo) {
        String sql = "INSERT INTO prestamo (fechaInicio, fechaFin, idEjemplar, idLector, estado) VALUES (?, ?, ?, ?, ?)";
        try {

            if (existePrestamo(prestamo)) {
                JOptionPane.showMessageDialog(null, "El préstamo ya existe.");
                return;
            }

            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDate(1, prestamo.getFechaInicio());
            ps.setDate(2, prestamo.getFechaFin());

            ps.setInt(3, prestamo.getEjemplar().getCodigo());
            if (ejemplarData.buscarEjemplar(prestamo.getEjemplar().getCodigo()).getCantidadDeEjemplares() == 0) {
                JOptionPane.showMessageDialog(null, "No hay suficientes ejemplares para prestar");
                throw new NullPointerException();
            }

            if (!ejemplarData.buscarEjemplar(prestamo.getEjemplar().getCodigo()).isEstado()) {
                JOptionPane.showMessageDialog(null, "El ejemplar no se encuentra activo");
                throw new NullPointerException();
            } else {
                if (ejemplarData.buscarEjemplar(prestamo.getEjemplar().getCodigo()) == null) {
                    throw new NullPointerException();
                }
            }

            ps.setInt(4, prestamo.getLector().getNroSocio());
            if (!lectorData.buscarLector(prestamo.getLector().getNroSocio()).isEstado()) {
                JOptionPane.showMessageDialog(null, "El lector no se encuentra activo");
                throw new NullPointerException();
            } else {
                if (lectorData.buscarLector(prestamo.getLector().getNroSocio()) == null) {
                    throw new NullPointerException("el usuaraio vlalva");
                }
            }
            ps.setBoolean(5, prestamo.isEstado());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                prestamo.setIdPrestamo(rs.getInt(1));
                prestamo.solicitarLibro(ejemplarData.buscarEjemplar(prestamo.getEjemplar().getCodigo()), lectorData.buscarLector(prestamo.getLector().getNroSocio()));
                Ejemplar ejemplar = ejemplarData.buscarEjemplar(prestamo.getEjemplar().getCodigo());
                ejemplar.setCantidadDeEjemplares(ejemplarData.buscarEjemplar(prestamo.getEjemplar().getCodigo()).getCantidadDeEjemplares() - 1);
                ejemplarData.modificarEjemplar(ejemplar);
//                System.out.println(ejemplar);

                JOptionPane.showMessageDialog(null, "Prestamo añadido con exito.");
            }

            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla prestamo" + ex.getMessage());

        } catch (NullPointerException e) {
//            JOptionPane.showMessageDialog(null, "No hay ejemplares disponibles.");
        }

    }

    public void modificarPrestamo(Prestamo prestamo) {

        String sql = "UPDATE prestamo SET fechaInicio = ?, fechaFin = ?, idEjemplar = ?, idLector = ?, estado = ? WHERE idPrestamo = ?";
        PreparedStatement ps = null;

        try {
            ps = connection.prepareStatement(sql);
            ps.setDate(1, prestamo.getFechaInicio());

            ps.setDate(2, prestamo.getFechaFin());
            ps.setInt(3, prestamo.getEjemplar().getCodigo());
            if (ejemplarData.buscarEjemplar(prestamo.getEjemplar().getCodigo()).getCantidadDeEjemplares() == 0) {
                JOptionPane.showMessageDialog(null, "No hay suficientes ejemplares para prestar");
                throw new NullPointerException();
            }

            if (!ejemplarData.buscarEjemplar(prestamo.getEjemplar().getCodigo()).isEstado()) {
                JOptionPane.showMessageDialog(null, "El ejemplar no se encuentra activo");
                throw new NullPointerException();
            } else {
                if (ejemplarData.buscarEjemplar(prestamo.getEjemplar().getCodigo()) == null) {
                    throw new NullPointerException();
                }
            }
            ps.setInt(4, prestamo.getLector().getNroSocio());
            if (!lectorData.buscarLector(prestamo.getLector().getNroSocio()).isEstado()) {
                JOptionPane.showMessageDialog(null, "El lector no se encuentra activo");
                throw new NullPointerException();
            } else {
                if (lectorData.buscarLector(prestamo.getLector().getNroSocio()) == null) {
                    throw new NullPointerException("el usuaraio vlalva");
                }
            }
            ps.setBoolean(5, prestamo.isEstado());
            ps.setInt(6, prestamo.getIdPrestamo());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El prestamo no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla prestamo " + ex.getMessage());
        } catch (NullPointerException ex) {

        }

    }

    public void devolverPrestamo(int id) {
        prestamo = buscarPrestamo(id);
        try {
            String sql = "UPDATE prestamo SET estado = 0 WHERE idPrestamo = ? ";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();
            System.out.println(fila);
            if (buscarPrestamo(id) == null) {
                throw new NullPointerException();
//                JOptionPane.showMessageDialog(null, " No existe el prestamo ingresado");
            }
            if (fila == 1) {
                prestamo.devolverLibro(ejemplarData.buscarEjemplar(prestamo.getEjemplar().getCodigo()), lectorData.buscarLector(prestamo.getLector().getNroSocio()));
                Ejemplar ejemplar = ejemplarData.buscarEjemplar(prestamo.getEjemplar().getCodigo());
                ejemplar.setCantidadDeEjemplares(ejemplarData.buscarEjemplar(prestamo.getEjemplar().getCodigo()).getCantidadDeEjemplares() + 1);
                ejemplarData.modificarEjemplar(ejemplar);
                JOptionPane.showMessageDialog(null, " Se eliminó el Prestamo.");
            }

            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Prestamo");
        } catch (NullPointerException e) {

        }
    }

    public List<Prestamo> obtenerPrestamos() {

        List<Prestamo> prestamos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM prestamo";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Prestamo prestamo = new Prestamo();

                prestamo.setIdPrestamo(rs.getInt(6));
                prestamo.setFechaInicio(rs.getDate(1));
                prestamo.setFechaFin(rs.getDate(2));
//                Ejemplar ejemplar = ));
//                ejemplar.setCodigo(ejemplar.getCodigo());
                prestamo.setEjemplar(ejemplarData.buscarEjemplar(rs.getInt(3)));
//                Lector lector = lectorData.buscarLector(rs.getInt(4));
//                lector.setNroSocio(lector.getNroSocio());
                prestamo.setLector(lectorData.buscarLector(rs.getInt(4)));
                prestamos.add(prestamo);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Prestamo " + ex.getMessage());
        }
        return prestamos;
    }

    public List<Prestamo> obtenerPrestamosPorLector(int id) {
        ejemplarData = new EjemplarData();
        lectorData = new LectorData();
        List<Prestamo> prestamos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM prestamo WHERE idlector = ?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Prestamo prestamo = new Prestamo();

                prestamo.setIdPrestamo(rs.getInt(6));
                prestamo.setFechaInicio(rs.getDate(1));
                prestamo.setFechaFin(rs.getDate(2));
//                Ejemplar ejemplar = ));
//                ejemplar.setCodigo(ejemplar.getCodigo());
                prestamo.setEjemplar(ejemplarData.buscarEjemplar(rs.getInt(3)));
//                Lector lector = lectorData.buscarLector(rs.getInt(4));
//                lector.setNroSocio(lector.getNroSocio());
                prestamo.setLector(lectorData.buscarLector(rs.getInt(4)));
                prestamos.add(prestamo);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Prestamos" + ex.getMessage());
        }
        return prestamos;
    }

    public List<Prestamo> obtenerPrestamosPorFecha(Date date) {
        ejemplarData = new EjemplarData();
        lectorData = new LectorData();
        List<Prestamo> prestamos = new ArrayList<>();
        try {
            String sql = "SELECT * FROM prestamo WHERE fechaInicio = ? OR fechaFin =?";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setDate(1, date);
            ps.setDate(2, date);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Prestamo prestamo = new Prestamo();

                prestamo.setIdPrestamo(rs.getInt(6));
                prestamo.setFechaInicio(rs.getDate(1));
                prestamo.setFechaFin(rs.getDate(2));
//                Ejemplar ejemplar = ));
//                ejemplar.setCodigo(ejemplar.getCodigo());
                prestamo.setEjemplar(ejemplarData.buscarEjemplar(rs.getInt(3)));
//                Lector lector = lectorData.buscarLector(rs.getInt(4));
//                lector.setNroSocio(lector.getNroSocio());
                prestamo.setLector(lectorData.buscarLector(rs.getInt(4)));
                prestamos.add(prestamo);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Prestamos" + ex.getMessage());
        }
        return prestamos;
    }

    public List<Lector> obtenerLectores() {

        List<Lector> lectores = new ArrayList<>();
        try {
            String sql = "SELECT lector.nrSocio, nombre, domicilio, mail, lector.estado, telefono FROM prestamo, lector"
                    + " WHERE prestamo.idLector = lector.nrSocio";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Lector lector;
            int codigo=0;
            while (rs.next()) {
                lector = new Lector();
                lector.setNroSocio(rs.getInt("nrSocio"));
                lector.setNombre(rs.getString("nombre"));
                lector.setDomicilio(rs.getString("domicilio"));
                lector.setMail(rs.getString("mail"));
                lector.setEstado(rs.getBoolean("estado"));
                lector.setTelefono(rs.getInt("telefono"));
                
                if (lector.getNroSocio() != codigo) {
                    lectores.add(lector);
                    codigo= lector.getNroSocio();
                }
                
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al obtener lectores de los prestamos " + ex.getMessage());
        }
        return lectores;
    }

    public List<Libro> obtenerLibro() {

        List<Libro> libros = new ArrayList<>();
        try {
            String sql = "SELECT idEjemplar FROM prestamo";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Libro libro;
            int codigo = 0;
            while (rs.next()) {
                LibroData libroData = new LibroData();
                libro = libroData.buscarLibro(String.valueOf(ejemplarData.buscarEjemplar(rs.getInt("idEjemplar")).getLibro().getIdLibro()));
//                libro.setIdLibro(rs.getInt("idLibro"));
//                libro.setIsbn(rs.getInt("isbn"));
//                libro.setTitulo(rs.getString("Titulo"));
//                libro.setAnio(rs.getInt("autor"));
//                libro.setTipo(rs.getString("tipo"));
//                libro.setEditorial(rs.getString("editorial"));
//                libro.setEstado(rs.getBoolean("estado"));
                if (libro.getIdLibro() != codigo) {
                    libros.add(libro);
                    codigo= libro.getIdLibro();
                }
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al obtener lectores de los prestamos " + ex.getMessage());
        }
        return libros;
    }

    public Prestamo buscarPrestamo(int id) {
        ejemplarData = new EjemplarData();
        lectorData = new LectorData();
        Prestamo prestamo = null;
        String sql = "SELECT fechaInicio, fechaFin, idEjemplar, idLector , estado FROM prestamo WHERE idPrestamo = ? ";
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                prestamo = new Prestamo();
                prestamo.setIdPrestamo(id);
                prestamo.setFechaInicio(rs.getDate("fechaInicio"));
                prestamo.setFechaFin(rs.getDate("fechaFin"));
                Ejemplar ejemplar = ejemplarData.buscarEjemplar(rs.getInt("idEjemplar"));
                ejemplar.setCodigo(ejemplar.getCodigo());
                prestamo.setEjemplar(ejemplar);
                Lector lector = lectorData.buscarLector(rs.getInt("idLector"));
                lector.setNroSocio(lector.getNroSocio());
                prestamo.setLector(lector);
                prestamo.setEstado(rs.getBoolean("estado"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe prestamo");

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla prestamo " + ex.getMessage());

        }

        return prestamo;
    }

//    public static void main(String[] args) {
//        Lector lect = new Lector(1, "Juan", "Salta", "juanvolveporfavor@hotmail.com", false, 987123456);
//        Ejemplar ejemp = new Ejemplar(2, new Libro(33, 22, "2", "2", 3, "CienciaDelNumero", "numeral", true), 5, true);
//        PrestamoData prestamoData = new PrestamoData();
////        System.out.println(Date.valueOf("2023-10-01"));
////        System.out.println(Date.valueOf("2023-10-12"));
////        prestamoData.guardarPrestamo(new Prestamo(Date.valueOf("2023-10-08"), Date.valueOf("2023-10-14"), ejemp, lect, true));
//////        lectorData.guardarLector(new Lector("Juan", "Salta", "juanteextrañamos@hotmail.com", true, 123456789));
//////        lectorData.modificarLector(new Lector(1,"Juan", "Salta", "juanvolveporfavor@hotmail.com", true, 987123456));
//////        lectorData.eliminarLector(31);
//////        System.out.println(lectorData.buscarLector(31));
//////        System.out.println(lectorData.listarLectores());
//
////      prestamoData.obtenerPrestamos().forEach(Prestamo->{
////          System.out.println(Prestamo);
////      });
////      prestamoData.obtenerPrestamosPorLector(1).forEach(Prestamo->{
////          System.out.println(Prestamo);
////      });
////      prestamoData.obtenerPrestamosPorFecha(Date.valueOf("2023-10-13")).forEach(Prestamo->{
////          System.out.println(Prestamo);
////      });
//prestamoData.obtenerLectores().forEach(lectores ->{
//    System.out.println(lectores);
//});
////        prestamoData.obtenerLibro().forEach(lectores -> {
////            System.out.println(lectores);
////        });
//
//// prestamoData.modificarPrestamo(new Prestamo(15,Date.valueOf("2023-10-09"), Date.valueOf("2023-10-13"), ejemp, lect, true));
////        prestamoData.devolverPrestamo(10);
//    }

}
