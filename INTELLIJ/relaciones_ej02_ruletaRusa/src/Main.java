import entidades.Juego;
import entidades.Jugador;
import entidades.Revolver;
import java.util.ArrayList;
import java.util.Scanner;

// 2. Realizar el juego de la ruleta rusa de agua en Java. Como muchos saben, el juego se trata de
//un número de jugadores, que, con un revolver de agua, el cual posee una sola carga de agua,
//se dispara y se moja. Las clases por hacer del juego son las siguientes:
//Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
//del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
//tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
//Métodos:
//• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
//deben ser aleatorios.
//• mojar(): devuelve true si la posición del agua coincide con la posición actual
//• siguienteChorro(): cambia a la siguiente posición del tambor
//• toString(): muestra información del revolver (posición actual y donde está el agua)
//Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
//jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
//si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
//debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
//Métodos:
//• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
//mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
//revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
//devuelve true, sino false.
//Clase llenarJuego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
//Revolver
//Métodos:
//• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
//y el revolver para guardarlos en los atributos del juego.
//• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
//aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
//moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
//mojar. Al final del juego, se debe mostrar que jugador se mojó.
//Pensar la lógica necesaria para realizar esto, usando los atributos de la clase llenarJuego.
public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in).useDelimiter("\n");

        System.out.println("               *** Ruleta Rusa de Agua ***");
        System.out.println("          (en mi vida ví un revolver de agua...)");

        boolean salir=false;
        do {
            System.out.println("");
            System.out.println("1- Insert Coin");
            System.out.println("2- Salir");
            String opcion= leer.next();
            leer.nextLine();
            switch (opcion) {
                case "1":
                    System.out.println("");
                    Revolver revolver = new Revolver();
                    Juego juego = new Juego();
                    ArrayList<Jugador> jugadores = new ArrayList<>();
                    int i = 1;
                    boolean valid;
                    boolean valid2=true;
                    do {
                        System.out.println("Ingrese el nombre del jugador n°" + i + ":");
                        String auxNombre = leer.nextLine();
                        //leer.nextLine();
                        Jugador auxJug = new Jugador(i, auxNombre, false);
                        jugadores.add(auxJug);
                        valid = true;
                        valid2=true;
                        while (i > 1 && i < 6 && valid2) {
                            System.out.println("Desea ingresar otro jugador?(s/n)");
                            opcion = leer.next();
                            leer.nextLine();
                            if (opcion.equalsIgnoreCase("n")) {
                                System.out.println("Ok, aivamo.");
                                valid2 = false;
                            } else if (opcion.equalsIgnoreCase("s")) {
                                System.out.println("Dale.");
                                i++;
                                valid2 = false;
                            } else {
                                System.out.println("Es 's' o 'n' la cosa...");
                                valid2 = true;
                            }
                        }
                        if (i==1){
                            i++;
                        }
                    } while (valid);

                    System.out.println("");
                    System.out.println(jugadores.toString());
                    System.out.println("");

                    juego.ronda();

                    break;
                case "2":
                    salir=true;
                    break;
                default:
                    System.out.println("Eso no es una opción, queride!");
                    salir=false;
            }
        } while (!salir);
        System.out.println("");
        System.out.println("Ok, que te garúe finito!");
    }
}