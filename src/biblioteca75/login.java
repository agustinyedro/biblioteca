
package biblioteca75;


public class login {
    
    
    private int idLogin;
    private String usuario;
    private String contrasenia;
    private String nombre;
    private String apellido;
    private String mail;
    private String pregunta;
    private String respueta;

    public login() {
    }

    public login(int idLogin, String usuario, String contrasenia, String nombre, String apellido, String mail, String pregunta, String respueta) {
        this.idLogin = idLogin;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.pregunta = pregunta;
        this.respueta = respueta;
    }

    public login(String usuario, String contrasenia, String nombre, String apellido, String mail, String pregunta, String respueta) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.pregunta = pregunta;
        this.respueta = respueta;
    }
    
    

    public int getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(int idLogin) {
        this.idLogin = idLogin;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespueta() {
        return respueta;
    }

    public void setRespueta(String respueta) {
        this.respueta = respueta;
    }

    @Override
    public String toString() {
        return "login{" + "idLogin=" + idLogin + ", usuario=" + usuario + ", contrasenia=" + contrasenia + ", nombre=" + nombre + ", apellido=" + apellido + ", mail=" + mail + ", pregunta=" + pregunta + ", respueta=" + respueta + '}';
    }
    
    

    
}
