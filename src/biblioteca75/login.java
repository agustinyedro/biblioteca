
package biblioteca75;


public class Login {
    
    
    private int idLogin;
    private String usuario;
    private String contrasenia;
   private Lector lector;
    private String pregunta;
    private String respueta;

    public Login() {
    }

    public Login(int idLogin, String usuario, String contrasenia, Lector lector, String pregunta, String respueta) {
        this.idLogin = idLogin;
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.lector = lector;
        this.pregunta = pregunta;
        this.respueta = respueta;
    }

    public Login(String usuario, String contrasenia, Lector lector, String pregunta, String respueta) {
        this.usuario = usuario;
        this.contrasenia = contrasenia;
        this.lector = lector;
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

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
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
        return "login{" + "idLogin=" + idLogin + ", usuario=" + usuario + ", contrasenia=" + contrasenia + ", lector=" + lector + ", pregunta=" + pregunta + ", respueta=" + respueta + '}';
    }

   
    
    

    
}
