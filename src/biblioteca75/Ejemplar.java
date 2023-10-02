package biblioteca75;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author luzel
 */
public class Ejemplar {
    private int codigo ;
    private Libro libro;
    private boolean estado;

    public Ejemplar(int codigo, Libro libro, boolean estado) {
        this.codigo = codigo;
        this.libro = libro;
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

    @Override
    public String toString() {
        return "Ejemplar{" + "codigo=" + codigo + ", libro=" + libro + ", estado=" + estado + '}';
    }
    
    
    
}
