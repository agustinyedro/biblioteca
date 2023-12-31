package biblioteca.AccesoData;

import biblioteca75.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class EjemplarData {

    private Connection connection;
    private LibroData libroData;

    public EjemplarData() {
        this.connection = Conexion.getConexion();

    }
    
    private boolean existeEjemplar(Ejemplar ejemplar) throws SQLException {

        String sql = "SELECT COUNT(*) FROM ejemplar WHERE codigo = ? AND idLibro = ? AND cantidadDeEjemplares = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, ejemplar.getCodigo());
            ps.setInt(2, ejemplar.getLibro().getIdLibro());
            ps.setInt(3, ejemplar.getCantidadDeEjemplares());
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    int count = rs.getInt(1);
                    return count > 0;
                }
            }
        }
        return false;
    }

    public void guardarEjemplar(Ejemplar ejemplar) {

        String sql = "INSERT INTO ejemplar (IdLibro, estado, cantidadDeEjemplares ) VALUES (?, ?, ?)";
        try {
            
            if(existeEjemplar(ejemplar)){
                JOptionPane.showMessageDialog(null, "Este ejemplar ya existe.");
                return;
            }
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, ejemplar.getLibro().getIdLibro());
            ps.setBoolean(2, ejemplar.isEstado());
            ps.setInt(3, ejemplar.getCantidadDeEjemplares());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                ejemplar.setCodigo(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Ejemplar Añadido");

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ejemplar" + ex.getMessage());

        }
    }

    public void modificarEjemplar(Ejemplar ejemplar) {
        String sql = "UPDATE ejemplar SET idLibro = ?, estado = ?, cantidadDeEjemplares =? WHERE codigo= ?";
        PreparedStatement ps = null;

        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, ejemplar.getLibro().getIdLibro());
            ps.setBoolean(2, ejemplar.isEstado());
            ps.setInt(3, ejemplar.getCantidadDeEjemplares());
            ps.setInt(4, ejemplar.getCodigo());
            int exito = ps.executeUpdate();

            if (exito == 1) {
//                JOptionPane.showMessageDialog(null, "Ejemplar modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El ejemplar no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ejemplar " + ex.getMessage());
        }

    }

    public void eliminarEjemplar(int id) {

        try {
            String sql = "UPDATE ejemplar SET estado = 0 WHERE idEjemplar = ? ";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();

            if (fila == 1) {

                JOptionPane.showMessageDialog(null, " El Ejemplar ah sido eliminado.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Ejemplar.");
        }
    }

    public List<Ejemplar> listarEjemplar() {
        libroData = new LibroData();
        List<Ejemplar> ejemplares = new ArrayList<>();
        try {
            String sql = "SELECT * FROM ejemplar WHERE estado = 1 ";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Ejemplar ejemplar = new Ejemplar();
                Libro libro = libroData.buscarLibro(String.valueOf(rs.getInt(2)));
                ejemplar.setLibro(libro);
                ejemplar.setCodigo(rs.getInt(1));
                ejemplar.setEstado(rs.getBoolean(3));
                ejemplar.setCantidadDeEjemplares(rs.getInt(4));
                ejemplares.add(ejemplar);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Ejemplares " + ex.getMessage());
        }
        return ejemplares;
    }

    public Ejemplar buscarEjemplar(int id) {
        libroData = new LibroData();
        Ejemplar ejemplar = null;
        String sql = "SELECT codigo, idLibro, estado, cantidadDeEjemplares FROM ejemplar WHERE codigo = ? ";
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                ejemplar = new Ejemplar();
                ejemplar.setCodigo(rs.getInt(1));
                Libro libro = libroData.buscarLibro(String.valueOf(rs.getInt(2)));
                ejemplar.setLibro(libro);
                ejemplar.setEstado(rs.getBoolean(3));
                ejemplar.setCantidadDeEjemplares(rs.getInt(4));

            } else {
                JOptionPane.showMessageDialog(null, "No existe el ejemplar");

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Ejemplar " + ex.getMessage());

        }

        return ejemplar;
    }

//    public static void main(String[] args) {
//        EjemplarData ejemplarData = new EjemplarData();
////        ejemplarData.guardarEjemplar(new Ejemplar(new Libro(33,22, "2", "2", 3, "CienciaDelNumero", "numeral", true), 3, true));
////        ejemplarData.modificarEjemplar(new Ejemplar(2,new Libro(33,22, "2", "2", 3, "CienciaDelNumero", "numeral", true), 5, true));
//        System.out.println(ejemplarData.listarEjemplar());
////        System.out.println(ejemplarData.buscarEjemplar(2));
//    }
}
