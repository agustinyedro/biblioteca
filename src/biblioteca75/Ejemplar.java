package biblioteca75;




public class Ejemplar {
    private int codigo ;
    private Libro libro;
    private int cantidadDeEjemplares;
    private boolean estado;

    public Ejemplar() {
    }

    public Ejemplar(int codigo, Libro libro, int cantidadDeEjemplares, boolean estado) {
        this.codigo = codigo;
        this.libro = libro;
        this.cantidadDeEjemplares = cantidadDeEjemplares;
        this.estado = estado;
        
    }

    public Ejemplar(int cantidadDeEjemplares) {
        this.cantidadDeEjemplares = cantidadDeEjemplares;
    }

    public Ejemplar(Libro libro, int cantidadDeEjemplares, boolean estado) {
        this.libro = libro;
        this.cantidadDeEjemplares = cantidadDeEjemplares;
        this.estado = estado;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getCantidadDeEjemplares() {
        return cantidadDeEjemplares;
    }

    public void setCantidadDeEjemplares(int cantidadDeEjemplares) {
        this.cantidadDeEjemplares = cantidadDeEjemplares;
    }

    @Override
    public String toString() {
        return "Ejemplar{" + "codigo=" + codigo + ", libro=" + libro + ", cantidadDeEjemplares=" + cantidadDeEjemplares + ", estado=" + estado + '}';
    }
    

  
    
    
}
