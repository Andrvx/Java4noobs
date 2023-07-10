package entidades;

import java.time.LocalDate;

public class Alquiler {
    private Pelicula pelicula;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private boolean enProgreso;

    public Alquiler() {
    }

    public Alquiler(Pelicula pelicula, LocalDate fechaInicio, LocalDate fechaFin, boolean enProgreso) {
        this.pelicula = pelicula;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.enProgreso = enProgreso;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public boolean isEnProgreso() {
        return enProgreso;
    }

    public void setEnProgreso(boolean enProgreso) {
        this.enProgreso = enProgreso;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "película=" + pelicula +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", enProgreso=" + enProgreso +
                '}';
    }
}
