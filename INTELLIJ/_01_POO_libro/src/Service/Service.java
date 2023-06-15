//Crear un método para cargar un libro pidiendo los datos al usuario y
//luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
//numero de páginas
package Service;

import entidades.Libro;

import java.util.Scanner;

public class Service {
    private Scanner leer=new Scanner(System.in).useDelimiter("\n");

    public Libro CargarLibro(){
        System.out.println("***Cargando nuevo Libro***");

        Libro nuevoLibro=new Libro();

        System.out.println("Ingrese el número de ISBN");
        nuevoLibro.setISBN(leer.next());

        System.out.println("Ingrese el Nombre de autor");
        nuevoLibro.setAutor(leer.next());

        System.out.println("Ingrese el titulo");
        nuevoLibro.setTitulo(leer.next());

        System.out.println("Ingrese el número de páginas");
        nuevoLibro.setPags(leer.nextInt());

        System.out.println("***Libro cargado***");

        return nuevoLibro;
    }

    public void MostrarLibro(Libro L){
        System.out.println("- Datos ingresados -");
        System.out.println("ISBN: "+L.getISBN());
        System.out.println("Autor: "+L.getAutor());
        System.out.println("Título: "+L.getTitulo());
        System.out.println("Cantidad de páginas: "+L.getPags());
        System.out.println("***");
    }


}
