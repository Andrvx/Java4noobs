package servicio;
import servicio.servicioPelicula;
import entidades.Alquiler;
import entidades.Pelicula;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
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

                                System.out.println("Fecha de inicio (DDMMAAAA):");
                                String input = leer.next();
                                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                                LocalDate date = LocalDate.parse(input, formatter);

                                vectorAlquileres[i].setFechaInicio(date);

                                valid=true;
                            }
                        }
                    }
                } else {
                    System.out.println("Opción inválida");
                }
            } catch (InputMismatchException error){
                System.out.println("Opción inválida");
            }

        } while (!valid);
        System.out.println("");
    }
    //listarAlquileres
    public void listarAlquileres(Alquiler[] vectorAlquileres){
        System.out.println("*** Lista de alquileres ***");
        for (int i=0;i<10;i++){
            System.out.println(vectorAlquileres[i].toString());
        }
        System.out.println("");
    }
    //buscarAlquilerFecha
    public void buscarAlquilerFecha(Alquiler[] vectorAlquileres){
        System.out.println("*** Buscando alquileres por fecha ***");

        System.out.println("Ingrese la fecha de inicio (DDMMAAAA):");
        String input = leer.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(input, formatter);
        for (int i=0; i<10; i++){
            if (vectorAlquileres[i].getFechaInicio().isEqual(date)){
                System.out.println((i+1)+" - "+vectorAlquileres[i].toString());
            }
        }
        System.out.println("");
    }
    //calcularIngreso
    public void calcularIngreso(Alquiler[] vectorAlquileres){
        System.out.println("*** Cerrar Alquiler ***");
        System.out.println("Seleccione una opción");
        listarAlquileres(vectorAlquileres);
        int aux=leer.nextInt();
        aux--;

        LocalDate dateCierre=LocalDate.now();

        System.out.println("--- Calculando Precio Total ---");
        vectorAlquileres[aux].setFechaFin(LocalDate.now());

        long precioTot=10;
        long diasTot=vectorAlquileres[aux].getFechaInicio().until(vectorAlquileres[aux].getFechaFin(), ChronoUnit.DAYS);
        if (diasTot>3){
          precioTot= (long) (precioTot*(0.1*(diasTot-3)));
        }
        System.out.println("El precio total es $ "+precioTot);

        Alquiler auxAlq=new Alquiler();
        vectorAlquileres[aux]=auxAlq;

        System.out.println("--- Alquiler Cerrado ---");
        System.out.println("");


    }
}
