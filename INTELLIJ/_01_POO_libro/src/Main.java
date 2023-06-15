import Service.Service;
import entidades.Libro;

import java.util.Scanner;

/*
1. Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas
 */
public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);

        System.out.println("***Bienvenido al sistema Biblioteca (eran las de antes)***");

        System.out.println("Desea cargar un libro?(S/N)");
        String resp=leer.next();
        if (resp.equals("S") || resp.equals("s")){
            System.out.println("Genial, vamos a cargarlo!");
        } else {
            System.out.println("Qué lástima, lo vas a cargar igual...");
        }

        Service LibroService=new Service();

        Libro libroNuevo=LibroService.CargarLibro();

        LibroService.MostrarLibro(libroNuevo);

    }
}