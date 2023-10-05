package biblioteca.AccesoData;

import biblioteca75.Ejemplar;
import biblioteca75.Lector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class LectorData {

    private Connection connection;

    public LectorData() {
        this.connection = Conexion.getConexion();

    }

    //int nroSocio, String nombre, String domicilio, String mail, boolean estado, int telefono.
    public void guardarLector(Lector lector) {

        String sql = "INSERT INTO lector ( nombre, domicilio, mail, estado, telefono ) VALUES (?, ?, ?, ?,?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, lector.getNombre());
            ps.setString(2, lector.getDomicilio());
            ps.setString(3, lector.getMail());
            ps.setBoolean(4, lector.isEstado());
            ps.setInt(5, lector.getTelefono());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                lector.setNroSocio(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Lector Añadido");

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Lector" + ex.getMessage());

        }
    }
//int nroSocio, String nombre, String domicilio, String mail, boolean estado

    public void modificarLector(Lector lector) {
        String sql = "UPDATE lector SET  nombre = ?, domicilio =?, mail=?, estado=?, telefono=? WHERE nroSocio= ?, ";
        PreparedStatement ps = null;

        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, lector.getNroSocio());
            ps.setString(2, lector.getNombre());
            ps.setString(3, lector.getDomicilio());
            ps.setString(4, lector.getMail());
            ps.setBoolean(5, true);
            ps.setInt(6, lector.getTelefono());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Lector modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El lector no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla lector " + ex.getMessage());
        }

    }

    public void eliminarLector(int id) {

        try {
            String sql = "UPDATE lector SET estado = 0 WHERE nroSocio = ? ";
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            int fila = ps.executeUpdate();

            if (fila == 1) {

                JOptionPane.showMessageDialog(null, " El Lector ha sido eliminado.");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Lector.");
        }
    }
    
    // LISTAR LECTORES
    
    public List<Lector> listarLectores() {

        List<Lector> lectores = new ArrayList<>();
        try {
            String sql = "SELECT * FROM lector WHERE estado = 1 ";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Lector lector = new Lector();
                ps.setInt(1, lector.getNroSocio());
                ps.setString(2, lector.getNombre());
                ps.setString(3, lector.getDomicilio());
                ps.setString(4, lector.getMail());
                ps.setBoolean(5, true);
                ps.setInt(6, lector.getTelefono());
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Lectores " + ex.getMessage());
        }
        return lectores;
    }


    // BUSCAR POR ID
    
    public List<Lector> listarLectorPorID(int id) {

        List<Lector> lectores = new ArrayList<>();
        try {
            String sql = "UPDATE lector SET estado = 0 WHERE nroSocio = ? ";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Lector lector = new Lector();
                ps.setInt(1, lector.getNroSocio());
                ps.setString(2, lector.getNombre());
                ps.setString(3, lector.getDomicilio());
                ps.setString(4, lector.getMail());
                ps.setBoolean(5, true);
                ps.setInt(6, lector.getTelefono());
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Lector " + ex.getMessage());
        }
        return lectores;
    }
}

