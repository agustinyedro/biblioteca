
package biblioteca.AccesoData;


import biblioteca75.*;
import java.awt.Button;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author luzel
 */

public class LibroData {

    private Connection connection;

    public LibroData() {

        connection = Conexion.getConexion();
    }

    public void guardarAlumno(Libro libro) {

        String sql = "INSERT INTO Libro (isbn, titulo, autor, año, tipo, editorial, estado) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, libro.getIsbn());
            ps.setString(2, libro.getTitulo());
            ps.setString(3, libro.getAutor());
            ps.setInt(4, libro.getAnio());
            ps.setString(5, libro.getTipo());
            ps.setString(6, libro.getEditorial());
            ps.setBoolean(7, libro.isEstado());
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                libro.setIdLibro(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Libro añadido con exito.");

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Libro" + ex.getMessage());

        }
    }

    public void modificarAlumno(Libro libro) {

        String sql = "UPDATE libro SET isbn = ? , titulo = ?, autor = ?, año = ?, tipo = ?,editorial=?, estado=? WHERE idLibro = ?";
        PreparedStatement ps = null;

        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, libro.getIsbn());
            ps.setString(2, libro.getTitulo());
            ps.setString(3, libro.getAutor());
            ps.setInt(4, libro.getAnio());
            ps.setString(5, libro.getTipo());
            ps.setString(6, libro.getEditorial());
            ps.setBoolean(7, libro.isEstado());
            ps.setInt(7, libro.getIdLibro());

            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El Libro no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Libro " + ex.getMessage());
        }

    }

    public void eliminarLibro(int id) {

        try {
            String sql = "UPDATE libro SET estado = 0 WHERE idLibro = ? ";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();

            if (fila == 1) {
                JOptionPane.showMessageDialog(null, " Se eliminó el Libro.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Libro");
        }
    }

    public List<Libro> listarLibros() {

        List<Libro> libros = new ArrayList<>();
        try {
            String sql = "SELECT * FROM libro WHERE estado = 1 ";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Libro libro = new Libro();

                libro.setIdLibro(rs.getInt("idLibro"));
                libro.setIsbn(rs.getInt("isbn"));
                libro.setTitulo(rs.getString("titulo"));
                libro.setAutor(rs.getString("autor"));
                libro.setAnio(rs.getInt("año"));
                libro.setTipo(rs.getString("tipo"));
                libro.setEditorial(rs.getString("editorial"));
                libro.setEstado(rs.getBoolean("estado"));
                libros.add(libro);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Libro " + ex.getMessage());
        }
        return libros;
    }

    public Libro buscarLibro(String buscado) {
        Libro libro = null;
        PreparedStatement ps = null;
        try {
//            String[] titulos = {"isbn", "titulo", "autor", "año", "tipo", "editorial"};
            String filtro="%"+buscado+"%";
            String sql = "SELECT * FROM libro WHERE isbn LIKE"+'"'+filtro+'"'+"OR titulo LIKE"+'"'+filtro+'"'
                    +" OR autor LIKE"+'"'+filtro+'"'+"OR año LIKE"+'"'+filtro+'"'+"OR tipo LIKE"+'"'+filtro+'"'+ "OR editorial LIKE"+'"'+filtro+'"';

            ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                libro = new Libro();
                libro.setIdLibro(rs.getInt(1));
                libro.setIsbn(rs.getInt(2));
                libro.setTitulo(rs.getString(3));
                libro.setAutor(rs.getString(4));
                libro.setAnio(rs.getInt(5));
                libro.setTipo(rs.getString(6));
                libro.setEditorial(rs.getString(7));
                libro.setEstado(rs.getBoolean(8));

            } else {
                JOptionPane.showMessageDialog(null, "No existe el Libro");

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Libro " + ex.getMessage());

        }

        return libro;
    }
    

//public List<Libro> buscarLibros(String buscado) {
//    List<Libro> librosEncontrados = new ArrayList<>();
//    PreparedStatement ps = null;
//    ResultSet rs = null;
//
//    try {
//        String filtro = "%" + buscado + "%";
//        String sql = "SELECT * FROM libro WHERE isbn LIKE ? OR titulo LIKE ? OR autor LIKE ? OR año LIKE ? OR tipo LIKE ? OR editorial LIKE ?";
//        ps = connection.prepareStatement(sql);
//        for (int i = 1; i <= 6; i++) {
//            ps.setString(i, filtro);
//        }
//
//        rs = ps.executeQuery();
//
//        while (rs.next()) {
//            Libro libro = new Libro();
//            libro.setIdLibro(rs.getInt("idLibro"));
//            libro.setIsbn(rs.getInt("isbn"));
//            libro.setTitulo(rs.getString("titulo"));
//            libro.setAutor(rs.getString("autor"));
//            libro.setAnio(rs.getInt("año"));
//            libro.setTipo(rs.getString("tipo"));
//            libro.setEditorial(rs.getString("editorial"));
//            libro.setEstado(rs.getBoolean("estado"));
//            librosEncontrados.add(libro);
//        }
//
//        if (librosEncontrados.isEmpty()) {
//            JOptionPane.showMessageDialog(null, "No se encontraron libros.");
//        }
//
//    } catch (SQLException ex) {
//        JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Libro: " + ex.getMessage());
//    } finally {
//        try {
//            if (rs != null) {
//                rs.close();
//            }
//            if (ps != null) {
//                ps.close();
//            }
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, "Error al cerrar recursos: " + e.getMessage());
//        }
//    }
//
//    return librosEncontrados;
//}
    

}
