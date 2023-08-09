package entidades;

import java.util.Date;

public class Alojamiento {
    private int id;
    private int numeroDeHabitacion;
    private int cantidadPersonas;
    private Date fechaEntrada;
    private Date fechaSalida;

    public Alojamiento() {
    }

    public Alojamiento(int id, int numeroDeHabitacion, int cantidadPersonas, Date fechaEntrada, Date fechaSalida) {
        this.id = id;
        this.numeroDeHabitacion = numeroDeHabitacion;
        this.cantidadPersonas = cantidadPersonas;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroDeHabitacion() {
        return numeroDeHabitacion;
    }

    public void setNumeroDeHabitacion(int numeroDeHabitacion) {
        this.numeroDeHabitacion = numeroDeHabitacion;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    @Override
    public String toString() {
        return "Alojamiento{" +
                "id=" + id +
                ", numeroDeHabitacion=" + numeroDeHabitacion +
                ", cantidadPersonas=" + cantidadPersonas +
                ", fechaEntrada=" + fechaEntrada +
                ", fechaSalida=" + fechaSalida +
                '}';
    }
}
