package biblioteca75;




public class Lector {
    private int nroSocio;
    private String nombre;
    private String domicilio;
    private String mail;
    private boolean estado;
    private int telefono;

    public Lector() {
    }

    public Lector(int nroSocio, String nombre, String domicilio, String mail, boolean estado, int telefono) {
        this.nroSocio = nroSocio;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.mail = mail;
        this.estado = estado;
        this.telefono= telefono;
    }

    public Lector(String nombre, String domicilio, String mail, boolean estado, int telefono) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.mail = mail;
        this.estado = estado;
        this.telefono= telefono;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    

    public int getNroSocio() {
        return nroSocio;
    }

    public void setNroSocio(int nroSocio) {
        this.nroSocio = nroSocio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Lector{" + "nroSocio=" + nroSocio + ", nombre=" + nombre + ", domicilio=" + domicilio + ", mail=" + mail + ", estado=" + estado + ", telefono=" + telefono + '}';
    }
    
    public void activarLector(){
        estado=true;
    }
    
    public void desactivarLector(){
        estado=false;
    }
    
    
}
