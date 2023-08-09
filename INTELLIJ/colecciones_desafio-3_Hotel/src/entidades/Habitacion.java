package entidades;
import java.util.Date;

public class Habitacion {
    private int numeroHabitacion;
    private Date fechaDeOcupacion;

    public Habitacion() {
    }

    public Habitacion(int numeroHabitacion, Date fechaDeOcupacion) {
        this.numeroHabitacion = numeroHabitacion;
        this.fechaDeOcupacion = fechaDeOcupacion;
    }

    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(int numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public Date getFechaDeOcupacion() {
        return fechaDeOcupacion;
    }

    public void setFechaDeOcupacion(Date fechaDeOcupacion) {
        this.fechaDeOcupacion = fechaDeOcupacion;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "numeroHabitacion=" + numeroHabitacion +
                ", fechaDeOcupacion=" + fechaDeOcupacion +
                '}';
    }
}
