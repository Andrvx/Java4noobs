package servicio;

import entidades.Pelicula;

import java.util.Scanner;

public class servicioPelicula {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    //crearPelicula
    public Pelicula crearPelicula(){
        Pelicula pelicula=new Pelicula();
        System.out.println("-- Cargando película nueva --");
        System.out.println("Ingrese el título:");
        pelicula.setTitulo(leer.next());
        System.out.println("Ingrese el director:");
        pelicula.setDirector(leer.next());
        System.out.println("Ingrese el año de estreno:");
        pelicula.setAnio(leer.nextInt());

        boolean valid=false;
        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1- Acción");


        } while (!valid);



    }
    //listarPeliculas
    //buscarTitulo
    //buscarGenero

}
