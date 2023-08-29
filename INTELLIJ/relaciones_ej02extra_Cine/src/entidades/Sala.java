package entidades;
//De Cine nos interesa conocer la película que se está reproduciendo, la
////sala con los espectadores y el precio de la entrada

import java.util.Arrays;

//Para representar la sala con los espectadores vamos a utilizar una matriz. Los asientos son
//etiquetados por una letra y un número la fila A1 empieza al final del mapa como se muestra en
//la tabla. También deberemos saber si el asiento está ocupado por un espectador o no, si esta
//ocupado se muestra una X, sino un espacio vacío.
public class Sala {
    private Asiento[][] platea=new Asiento[8][6];
    private Pelicula pelicula;
    private double precio;

    public Sala() {
    }

    public Sala(Asiento[][] platea, Pelicula pelicula, double precio) {
        this.platea = platea;
        this.pelicula = pelicula;
        this.precio = precio;
    }

    public Asiento[][] getPlatea() {
        return platea;
    }

    public void setPlatea(Asiento[][] platea) {
        this.platea = platea;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "platea=" + Arrays.toString(platea) +
                ", pelicula=" + pelicula +
                ", precio=" + precio +
                '}';
    }
}
