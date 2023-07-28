package utilidades;

import entidades.Pelicula;

import java.util.Comparator;

public class Comparadores {
//• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
//pantalla.
    public static Comparator<Pelicula> ordenarPorDuracionDesc=new Comparator<Pelicula>() {
    @Override
    public int compare(Pelicula pelicula1, Pelicula pelicula2) {
        return pelicula2.getDuracionDecimal().compareTo(pelicula1.getDuracionDecimal());
    }
};
//• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
//pantalla.
    
//• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
//• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.

}
