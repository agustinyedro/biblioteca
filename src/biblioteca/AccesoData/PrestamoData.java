
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

    public PrestamoData() {

        connection = Conexion.getConexion();
    }

    public void guardarPrestamo(Prestamo prestamo) {

        String sql = "INSERT INTO Prestamo (fechaInicio, fechaFin, idEjemplar, idLector, estado) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDate(1, prestamo.getFechaInicio());
            ps.setDate(2, prestamo.getFechaFin());
            ps.setInt(3, prestamo.getEjemplar().getCodigo());
            ps.setInt(4, prestamo.getLector().getNroSocio());
            ps.setBoolean(5, prestamo.isEstado());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                prestamo.setIdPrestamo(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Prestamo añadido con exito.");

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla prestamo" + ex.getMessage());

        }
    }

    public void modificarPrestamo(Prestamo prestamo) {

        String sql = "UPDATE prestamo SET fechaInicio=? fechaFin=? idEjemplar=? idLector=? estado=? WHERE idPrestamo = ?";
        PreparedStatement ps = null;

        try {
            ps = connection.prepareStatement(sql);
            ps.setDate(1, prestamo.getFechaInicio());
            ps.setDate(2, prestamo.getFechaFin());
            ps.setInt(3, prestamo.getEjemplar().getCodigo());
            ps.setInt(4, prestamo.getLector().getNroSocio());
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
        }

    }

    public void eliminarPrestamo(int id) {

        try {
            String sql = "UPDATE prestamo SET estado = 0 WHERE idPrestamo = ? ";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, " Se eliminó el Prestamo.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Prestamo");
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

                ps.setDate(1, prestamo.getFechaInicio());
                ps.setDate(2, prestamo.getFechaFin());
                ps.setInt(3, prestamo.getEjemplar().getCodigo());
                ps.setInt(4, prestamo.getLector().getNroSocio());
                ps.setBoolean(5, prestamo.isEstado());
                ps.setInt(6, prestamo.getIdPrestamo());

                prestamos.add(prestamo);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Prestamo " + ex.getMessage());
        }
        return prestamos;
    }

//    public List<Prestamo> obtenerPrestamosPorLector(int id) {
//        ejemplarData = new EjemplarData();
//        lectorData = new LectorData();
//        List<Prestamo> prestamos = new ArrayList<>();
//        try {
//            String sql = "SELECT * FROM prestamo WHERE idlector = ?";
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ps.setInt(1, id);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                Prestamo prestamo = new Prestamo();
//
//                prestamo.setIdPrestamo(rs.getInt(6));
//                prestamo.setFechaInicio(rs.getDate(1));
//                prestamo.setFechaFin(rs.getDate(2));
//                Ejemplar ejemplar = EjemplarData.buscarEjemplar(rs.getInt(3));
//                ejemplar.setCodigo(ejemplar.getCodigo());
//                prestamo.setEjemplar(ejemplar);
//                Lector lector = LectorData.buscarLector(rs.getInt(4));
//                lector.setNroSocio(lector.getNroSocio());
//                prestamo.setLector(lector);
//                prestamos.add(prestamo);
//            }
//            ps.close();
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Prestamos" + ex.getMessage());
//        }
//        return prestamos;
//    }
//
//    public List<Prestamo> obtenerPrestamosPorFecha(Date date) {
//        ejemplarData = new EjemplarData();
//        lectorData = new LectorData();
//        List<Prestamo> prestamos = new ArrayList<>();
//        try {
//            String sql = "SELECT * FROM prestamo WHERE fechaInicio = ?";
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ps.setDate(1, date);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()) {
//                Prestamo prestamo = new Prestamo();
//
//                prestamo.setIdPrestamo(rs.getInt(6));
//                prestamo.setFechaInicio(rs.getDate(1));
//                prestamo.setFechaFin(rs.getDate(2));
//                Ejemplar ejemplar = EjemplarData.buscarEjemplar(rs.getInt(3));
//                ejemplar.setCodigo(ejemplar.getCodigo());
//                prestamo.setEjemplar(ejemplar);
//                Lector lector = LectorData.buscarLector(rs.getInt(4));
//                lector.setNroSocio(lector.getNroSocio());
//                prestamo.setLector(lector);
//                prestamos.add(prestamo);
//            }
//            ps.close();
//
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Prestamos" + ex.getMessage());
//        }
//        return prestamos;
//    }
//    //
//    public List<Lector> obtenerLectores(int id) {
//
//        List<Lector> materias = new ArrayList<>();
//        try {
//            String sql = "SELECT prestamo.idLector, nombre, año FROM prestamo, lector"
//                    + " WHERE prestamo.idLector = lector.idLector AND inscripcion.idAlumno = ?";
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ps.setInt(1, id);
//            ResultSet rs = ps.executeQuery();
//            Lector lector;
//            while (rs.next()) {
//                lector = new Lector();
//                lector.setIdMateria(rs.getInt("idMateria"));
//                lector.setNombre(rs.getString("nombre"));
//                lector.setAnio(rs.getInt("año"));
//                materias.add(materia);
//            }
//            ps.close();
//
//        }
//        catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, " Error al obtener Incripciones " + ex.getMessage());
//        }
//        return materias;
//    }
//
//    public Prestamo buscarPrestamo(int id) {
//        ejemplarData = new EjemplarData();
//        lectorData = new LectorData();
//        Prestamo prestamo = null;
//        String sql = "SELECT fechaInicio, fechaFin, idEjemplar, idLector , estado FROM materia WHERE idPrestamo = ? ";
//        PreparedStatement ps = null;
//        try {
//            ps = connection.prepareStatement(sql);
//            ps.setInt(1, id);
//            ResultSet rs = ps.executeQuery();
//
//            if (rs.next()) {
//                prestamo = new Prestamo();
//                prestamo.setIdPrestamo(id);
//                prestamo.setFechaInicio(rs.getDate("fechaInicio"));
//                prestamo.setFechaFin(rs.getDate("fechaFin"));
//                Ejemplar ejemplar = EjemplarData.buscarEjemplar(rs.getInt("idEjemplar"));
//                ejemplar.setCodigo(ejemplar.getCodigo());
//                prestamo.setEjemplar(ejemplar);
//                Lector lector = LectorData.buscarLector(rs.getInt("idLector"));
//                lector.setNroSocio(lector.getNroSocio());
//                prestamo.setLector(lector);
//                prestamo.setEstado(rs.getBoolean("estado"));
//
//            } else {
//                JOptionPane.showMessageDialog(null, "No existe prestamo");
//
//            }
//            ps.close();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla prestamo " + ex.getMessage());
//
//        }
//
//        return prestamo;
//    }
}
