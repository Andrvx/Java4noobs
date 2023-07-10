package servicio;
import entidades.Pelicula;
import java.util.InputMismatchException;
import java.util.Scanner;

public class servicioPelicula {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    //crearPelicula
    public Pelicula crearPelicula() {
        Pelicula pelicula = new Pelicula();
        System.out.println("-- Cargando película nueva --");
        System.out.println("Ingrese el título:");
        pelicula.setTitulo(leer.next());
        System.out.println("Ingrese el director:");
        pelicula.setDirector(leer.next());
        System.out.println("Ingrese el año de estreno:");
        pelicula.setAnio(leer.nextInt());

        boolean valid = false;
        int opcion;
        do {
            System.out.println("Seleccione el género:");
            System.out.println("1- Acción");
            System.out.println("2- Aventura");
            System.out.println("3- Drama");
            System.out.println("4- Policial");
            System.out.println("5- Anime Hentai");
            try {
                opcion = leer.nextInt();
                if (!(opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4 || opcion == 5)) {
                    System.out.println("Opción Inválida!!!");
                } else {
                    pelicula.setGenero(opcion);
                    valid = true;
                }
            } catch (InputMismatchException error) {
                System.out.println("Opción Inválida!!!");
            }
        } while (!valid);

        System.out.println("Ingrese la duración en minutos:");
        pelicula.setDuracion(leer.nextInt());
        System.out.println("");

        pelicula.setAlquilada(true);

        System.out.println("*** Película cargada con éxito ***");
        System.out.println("");

        return pelicula;
    }

    //listarPeliculas
    public void listarPeliculas(Pelicula[] vectorPeliculas) {
        System.out.println("*** Listado se películas cargadas ***");
        for (int i = 0; i < 10; i++) {
            if (!vectorPeliculas[i].getTitulo().equals(null)) {
                System.out.println(vectorPeliculas[i].toString());
                System.out.println("");
            } else {
                System.out.println("Índice " + i + " vacío.");
                System.out.println("");
            }
        }
    }

    //buscarTitulo
    public int buscarTitulo(Pelicula[] vectorPeliculas, String titulo) {
        System.out.println("*** Buscando ***");
        int aux = 0;
        for (int i = 0; i < 10; i++) {
            if (vectorPeliculas[i].getTitulo().equals(titulo)) {
                aux = i;
                break;
            }
        }
        return aux;
    }

    //buscarGenero
    public void buscarGenero(Pelicula[] vectorPeliculas) {
        boolean valid = false;
        int opcion;
        String genero="";
        do {
            System.out.println("Seleccione el género:");
            System.out.println("1- Acción");
            System.out.println("2- Aventura");
            System.out.println("3- Drama");
            System.out.println("4- Policial");
            System.out.println("5- Anime Hentai");
            try {
                opcion = leer.nextInt();
                if (!(opcion == 1 || opcion == 2 || opcion == 3 || opcion == 4 || opcion == 5)) {
                    System.out.println("Opción Inválida!!!");
                } else {
                    switch (opcion) {
                        case 1:
                            genero = "Acción";
                            break;
                        case 2:
                            genero = "Aventura";
                            break;
                        case 3:
                            genero = "Drama";
                            break;
                        case 4:
                            genero = "Policial";
                            break;
                        case 5:
                            genero = "Anime Hentai";
                            break;
                    }
                    valid = true;
                }
            } catch (InputMismatchException error) {
                System.out.println("Opción Inválida!!!");
            }
        } while (!valid);

        int aux = 0;
        for (int i = 0; i < 10; i++) {
            if (vectorPeliculas[i].getGenero().equalsIgnoreCase(genero)) {
                vectorPeliculas[i].toString();
                aux++;
            }
        }
        if (aux == 0) {
            System.out.println("No tenemos películas de ese género, sorry gordi.");
        }
    }
}
