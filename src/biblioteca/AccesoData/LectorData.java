package biblioteca.AccesoData;

import biblioteca75.Ejemplar;
import biblioteca75.Lector;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class LectorData {

    private Connection connection;

    public LectorData(Connection connection) {
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
    // BUSCAR POR ID
}
