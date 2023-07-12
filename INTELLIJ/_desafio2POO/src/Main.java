import entidades.Alquiler;
import entidades.Pelicula;
import javafx.util.converter.LocalDateStringConverter;
import servicio.servicioAlquiler;
import servicio.servicioPelicula;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Pelicula[] vectorPeliculas=new Pelicula[10];
        Alquiler[] vectorAlquileres=new Alquiler[10];
        servicioPelicula SP=new servicioPelicula();
        servicioAlquiler SA=new servicioAlquiler();

        System.out.println("*** Programa Videoclub de los '90 ***");

        boolean exit=false;
        int opcion;
        do {
            System.out.println("  - Menú -");
            System.out.println("   1- Ingresar Película");
            System.out.println("   2- Listar Películas");
            System.out.println("   3- Buscar Películas por Título");
            System.out.println("   4- Buscar Películas por Género");
            System.out.println("   5- Crear Alquiler");
            System.out.println("   6- Listar Alquileres");
            System.out.println("   7- Buscar Alquileres por Fecha");
            System.out.println("   8- Cerrar Alquiler");
            System.out.println("   9- Salir");
            System.out.println("");
            opcion=leer.nextInt();

            switch (opcion){
                case 1:

                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
            }

        } while (!exit);
    }
}