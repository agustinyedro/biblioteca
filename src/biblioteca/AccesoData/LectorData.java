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

    private boolean
            existeLector(Lector lector) throws SQLException {

        String sql = "SELECT COUNT(*) FROM lector WHERE nrSocio = ? AND nombre = ? AND apellido = ? AND domicilio = ? AND mail = ? AND telefono = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, lector.getNroSocio());
            ps.setString(2, lector.getNombre());
            ps.setString(3, lector.getApellido());
            ps.setString(4, lector.getDomicilio());
            ps.setString(5, lector.getMail());
            ps.setLong(6, lector.getTelefono());
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    int count = rs.getInt(1);
                    return count > 0;
                }
            }
        }
        return false;
    }

    public void guardarLector(Lector lector) {

        String sql = "INSERT INTO lector ( nombre, apellido, domicilio, mail, estado, telefono ) VALUES (?, ?, ?, ?, ?, ?)";
        try {

            if (existeLector(lector)) {
                JOptionPane.showMessageDialog(null, "El lector ya existe.");
                return;
            }

            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            
            ps.setString(1, lector.getNombre());
            ps.setString(2, lector.getApellido());
            ps.setString(3, lector.getDomicilio());
            ps.setString(4, lector.getMail());
            ps.setBoolean(5, lector.isEstado());
            ps.setLong(6, lector.getTelefono());
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

    public void modificarLector(Lector lector) {
        String sql = "UPDATE lector SET  nombre = ?, apellido=?, domicilio =?, mail=?, estado=?, telefono=? WHERE nrSocio= ? ";
        PreparedStatement ps = null;

        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, lector.getNombre());
            ps.setString(2, lector.getApellido());
            ps.setString(3, lector.getDomicilio());
            ps.setString(4, lector.getMail());
            ps.setBoolean(5, true);
            ps.setLong(6, lector.getTelefono());
            ps.setInt(7, lector.getNroSocio());
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
            String sql = "UPDATE lector SET estado = 0 WHERE nrSocio = ? ";
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

    public List<Lector> listarLectores() {

        List<Lector> lectores = new ArrayList<>();
        try {
            String sql = "SELECT * FROM lector WHERE estado = 1 ";
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Lector lector = new Lector();
                lector.setNroSocio(rs.getInt(1));
                lector.setEstado(rs.getBoolean(6));
                lector.setDomicilio(rs.getString(4));
                lector.setMail(rs.getString(5));
                lector.setNombre(rs.getString(2));
                lector.setApellido(rs.getString(3));
                lector.setTelefono(rs.getLong(7));
                lectores.add(lector);
            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Lectores " + ex.getMessage());
        }
        return lectores;
    }

    public Lector buscarLector(int id) {
        Lector lector = null;
        String sql = "SELECT nrSocio, nombre, apellido, domicilio, mail, estado, telefono FROM lector WHERE nrSocio = ? ";
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                lector = new Lector();
                lector.setNroSocio(id);
                lector.setNombre(rs.getString("nombre"));
                lector.setApellido(rs.getString("apellido"));
                lector.setDomicilio(rs.getString("domicilio"));
                lector.setMail(rs.getString("mail"));
                lector.setEstado(rs.getBoolean("estado"));
                lector.setTelefono(rs.getLong("telefono"));

            } else {
                JOptionPane.showMessageDialog(null, "No existe el lector");

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Lector " + ex.getMessage());

        }

        return lector;
    }

    public static void main(String[] args) {
        LectorData lectorData = new LectorData();
        lectorData.guardarLector(new Lector("Juan","desaparecido", "Salta", "juanteextrañamos@hotmail.com", false, 123456789));
//        lectorData.modificarLector(new Lector(1,"Juan", "Salta", "juanvolveporfavor@hotmail.com", true, 987123456));
//        lectorData.eliminarLector(31);
//        System.out.println(lectorData.buscarLector(31));
//        System.out.println(lectorData.listarLectores());
    }
}
