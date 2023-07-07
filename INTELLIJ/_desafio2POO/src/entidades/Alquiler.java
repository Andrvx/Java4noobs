package entidades;

import java.time.LocalDate;

public class Alquiler {
    private Pelicula película;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private boolean enProgreso;

    public Alquiler() {
    }

    public Alquiler(Pelicula película, LocalDate fechaInicio, LocalDate fechaFin, boolean enProgreso) {
        this.película = película;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.enProgreso = enProgreso;
    }

    public Pelicula getPelícula() {
        return película;
    }

    public void setPelícula(Pelicula película) {
        this.película = película;
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
                "película=" + película +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", enProgreso=" + enProgreso +
                '}';
    }
}
