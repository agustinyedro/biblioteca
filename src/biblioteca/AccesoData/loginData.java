package biblioteca.AccesoData;

import biblioteca75.Lector;
import biblioteca75.Login;
import java.sql.*;
import javax.swing.JOptionPane;

public class LoginData {

    private Connection connection;
    private LectorData lectorData;
    private Lector lector;

    public LoginData() {
       connection = Conexion.getConexion();
        this.lector = new Lector();
        this.lectorData = new LectorData();
    }

    public void guardarLogin(Login login) {

        String sql = "INSERT INTO login ( usuario, contraseña, idLector, pregunta, respuesta) VALUES (?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, login.getUsuario());
            ps.setString(2, login.getContrasenia());
            if (!lectorData.buscarLector(login.getLector().getNroSocio()).isEstado()) {
                JOptionPane.showMessageDialog(null, "El lector no esta activo");
                throw new NullPointerException();
            }
            ps.setInt(3, login.getLector().getNroSocio());
            ps.setString(4, login.getPregunta());
            ps.setString(5, login.getRespueta());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                login.setIdLogin(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Usuario creado correctamente");

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Login " + ex.getMessage());

        } catch (NullPointerException e) {
            String si = "SI";
            String no = "NO";
            String cancelar = "Cancelar";
            Object[] opciones = {si, no};
            int confirmacion = JOptionPane.showOptionDialog(null, "¿Desea volver a activarlo?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, si);
            if (confirmacion == 0) {
                lector = lectorData.buscarLector(login.getLector().getNroSocio());
                lector.activarLector();
                lectorData.modificarLector(lector);
            }
        }
    }

    public void modificarLogin(Login login) {

        String sql = "UPDATE login SET usuario = ? , contraseña = ? , idLector=?, pregunta=? , respuesta = ? WHERE idLogin = ?";
        PreparedStatement ps = null;

        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, login.getUsuario());
            ps.setString(2, login.getContrasenia());
            ps.setInt(3, login.getLector().getNroSocio());
            ps.setString(4, login.getPregunta());
            ps.setString(5, login.getRespueta());
            ps.setInt(6, login.getIdLogin());
            int exito = ps.executeUpdate();

            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El usuario no existe");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Login " + ex.getMessage());
        }

    }

    public Login buscarLoginPorUsuario(String usuario) {
        Login login = null;
        String sql = "SELECT idLogin, usuario, contraseña, idLector , pregunta, respuesta FROM login WHERE usuario=?";
        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(sql);
            ps.setString(1, usuario);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                login = new Login();
                login.setIdLogin(rs.getInt(1));
                login.setUsuario(rs.getString(2));
                login.setContrasenia(rs.getString(3));
                login.setLector(lectorData.buscarLector(rs.getInt(4)));
                login.setPregunta(rs.getString(5));
                login.setRespueta(rs.getString(6));
            } else {
                JOptionPane.showMessageDialog(null, "No existe el usuario");

            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Login " + ex.getMessage());
        }

        return login;
    }
//    
//    public static void main(String[] args) {
//        LoginData loginData = new LoginData();
////        loginData.guardarLogin(new Login("grupo75", "grupo75", new Lector(1,"Juan", "Salta", "juanvolveporfavor@hotmail.com", true, 987123456), "grupo75", "grupo75"));
////        loginData.modificarLogin(new Login(3,"grupo75", "grupo75", new Lector(1,"Juan", "Salta", "juanvolveporfavor@hotmail.com", true, 987123456), "grupo75", "grupo74"));
//        System.out.println(loginData.buscarLoginPorUsuario("grupo75"));
//    }

}