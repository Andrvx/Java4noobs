package servicio;
import servicio.servicioPelicula;
import entidades.Alquiler;
import entidades.Pelicula;

import java.util.InputMismatchException;
import java.util.Scanner;

public class servicioAlquiler {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    //crearAlquiler
    public void crearAlquiler(Alquiler[] vectorAlquileres,Pelicula[] vectorPelicula){
        System.out.println("*** Abriendo alquiler ***");
        System.out.println("Películas disponibles:");

        boolean valid=false;
        int opcion=0;

        do {
            for (int i = 0; i < 10; i++) {
                if (!vectorPelicula[i].isAlquilada()) {
                    System.out.println((i+1) + "- " + vectorPelicula[i].toString());
                    System.out.println("");
                } else {
                    System.out.println((i+1) + "- " + vectorPelicula[i].getTitulo() + " - ALQUILADA.");
                }
            }
            System.out.println("Ingrese la opción:");
            try {
                opcion=leer.nextInt();
                opcion--;
                if (opcion<10 && opcion>1){
                    if (!vectorPelicula[opcion].isAlquilada()) {
                        System.out.println("Película Alquilada. Elija otra.");
                    } else {
                        for (int i=0;i<10;i++){
                            if (vectorAlquileres[i].getPelicula().equals("")){
                                System.out.println("Cargando alquiler");
                                vectorAlquileres[i].setPelicula(vectorPelicula[opcion]);
                                System.out.println("Fecha de inicio:");
                                //vectorAlquileres[i].setFechaInicio();
                            }
                        }
                    }
                } else {

                }
            } catch (InputMismatchException error){
                System.out.println("Opción inválida");
            }

        } while (!valid);
    }
    //listarAlquileres
    //buscarAlquilerFecha
    //calcularIngreso
}
