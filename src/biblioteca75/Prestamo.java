package biblioteca75;

import java.sql.Date;
import java.time.LocalDate;

public class Prestamo {

    private int idPrestamo;
    private Date fechaInicio;
    private Date fechaFin;
    private Ejemplar ejemplar;
    private Lector lector;
    private boolean estado;

    public Prestamo() {
    }

    public Prestamo(int idPrestamo, Date fechaInicio, Date fechaFin, Ejemplar ejemplar, Lector lector, boolean estado) {
        this.idPrestamo = idPrestamo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.ejemplar = ejemplar;
        this.lector = lector;
        this.estado = estado;
    }

    public Prestamo(Date fechaInicio, Date fechaFin, Ejemplar ejemplar, Lector lector, boolean estado) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.ejemplar = ejemplar;
        this.lector = lector;
        this.estado = estado;
    }

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Ejemplar getEjemplar() {
        return ejemplar;
    }

    public void setEjemplar(Ejemplar ejemplar) {
        this.ejemplar = ejemplar;
    }

    public Lector getLector() {
        return lector;
    }

    public void setLector(Lector lector) {
        this.lector = lector;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void solicitarLibro(Ejemplar e, Lector l) {

        if (e.getCantidadDeEjemplares() > 0 && l.isEstado()) {
//            this.fechaInicio= fechaInicio;
//            this.fechaFin= fechaFin;
            this.ejemplar = e;
            this.lector = l;
            this.estado = true;
            e.setCantidadDeEjemplares(e.getCantidadDeEjemplares() - 1);
        }
    }

    public void devolverLibro(Ejemplar e, Lector l) {
        if (l.isEstado() && ejemplar.equals(e)) {
//            this.fechaFin= Date.valueOf(LocalDate.now());
            this.ejemplar = e;
            this.lector = l;
            this.estado = false;
            e.setCantidadDeEjemplares(e.getCantidadDeEjemplares() + 1);
        }
    }

    @Override
    public String toString() {
        return "Prestamo{" + "idPrestamo=" + idPrestamo + ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", ejemplar=" + ejemplar + ", lector=" + lector + ", estado=" + estado + '}';
    }
    
}
