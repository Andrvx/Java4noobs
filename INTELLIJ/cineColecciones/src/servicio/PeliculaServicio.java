package servicio;
import entidades.Pelicula;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PeliculaServicio {
    //En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
//todos sus datos y guardándolos en el objeto Pelicula.
    //Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
//crear otra Pelicula o no.
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    public ArrayList<Pelicula> listaDePeliculas=new ArrayList<>();

    public void crearPelicula(){
        boolean salir=false;

        while (!salir){
            System.out.println("*** Cargar película ***");

            Pelicula peliculaAux=new Pelicula();

            System.out.println(" - Título:");
            String tituloAux= leer.next();
            leer.nextLine();
            System.out.println(" - Director:");
            String directorAux=leer.next();
            leer.nextLine();

            peliculaAux.setTitulo(tituloAux);
            peliculaAux.setDirector(directorAux);

            System.out.println(" - Duración:");

            boolean valid=false;
            int horasAux=0;
            int minutosAux=0;

            do {
                System.out.println("Horas:");
                try {
                    horasAux=leer.nextInt();
                    valid = true;
                } catch (InputMismatchException e) {
                    System.out.println("Formato inválido.");
                }
            } while (!valid);
            valid=false;
            do {
                System.out.println("Minutos:");
                try {
                    minutosAux=leer.nextInt();
                    valid = true;
                } catch (InputMismatchException e) {
                    System.out.println("Formato inválido.");
                }
            } while (!valid);

            peliculaAux.setDuracionConFormato(horasAux,minutosAux);

            listaDePeliculas.add(peliculaAux);

            System.out.println("Película cargada.");

            do {
                System.out.println("Desea cargar otra?(s/n)");
                String opcion=leer.next();
                leer.nextLine();
                if (!(opcion.equalsIgnoreCase("n"))&&!(opcion.equalsIgnoreCase("s"))){
                    System.out.println("Opción inválida.");
                    valid=false;
                } else {
                    opcion=opcion.toLowerCase();
                    switch (opcion){
                        case ("n"):
                            System.out.println("Ok, byesss");
                            valid=true;
                            salir=true;
                            break;
                        case ("s"):
                            System.out.println("Ok, aivamo");
                            valid=true;
                            salir=false;
                            break;
                    }
                }
            } while (!valid);
        }
    }
//Después de ese bucle realizaremos las siguientes acciones:
//• Mostrar en pantalla todas las películas.
    public void mostrarPeliculas(){
        for (Pelicula pelicula: listaDePeliculas) System.out.println(pelicula.toString());
    }
//• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
    public void mostrarLargometrajes(){

    }
//• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
//pantalla.
//• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
//pantalla.
//• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
//• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.

}
