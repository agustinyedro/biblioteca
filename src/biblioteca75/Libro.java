package biblioteca75;

public class Libro {

    
    private int idLibro;
    private int isbn;
    private String titulo;
    private String autor;
    private int anio;
    private String tipo;
    private String Editorial;
    private boolean estado;



    public Libro() {
    }

    public Libro(int idLibro, int isbn, String titulo, String autor, int anio, String tipo, String Editorial, boolean estado) {
        this.idLibro = idLibro;
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.tipo = tipo;
        this.Editorial = Editorial;
        this.estado = estado;
    }

    public Libro(int isbn, String titulo, String autor, int anio, String tipo, String Editorial, boolean estado) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.tipo = tipo;
        this.Editorial = Editorial;
        this.estado = estado;

    }

    public int getIdLibro() {
        return idLibro;
    }

    public void setIdLibro(int idLibro) {
        this.idLibro = idLibro;

    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    @Override
    public String toString() {
        return  titulo +", "+ autor ;
    }

    
    

}
