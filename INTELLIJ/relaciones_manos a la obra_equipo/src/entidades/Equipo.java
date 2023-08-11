package entidades;

import java.util.ArrayList;
import java.util.TreeSet;

public class Equipo {
    private String nombre;
    private ArrayList<Jugador> listaJugadores;

    public Equipo() {
    }

    public Equipo(String nombre, ArrayList<Jugador> listaJugadores) {
        this.nombre = nombre;
        this.listaJugadores = listaJugadores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", listaJugadores=" + listaJugadores +
                '}';
    }
}
