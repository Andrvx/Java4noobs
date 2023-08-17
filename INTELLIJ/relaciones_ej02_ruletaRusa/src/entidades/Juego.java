package entidades;

import java.util.ArrayList;
import java.util.Scanner;

//Clase llenarJuego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
//Revolver

public class Juego {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Jugador> jugadores;
    private Revolver revolver;

    public Juego() {
    }

    public Juego(ArrayList<Jugador> jugadores, Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }

    //Métodos:
//• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
//y el revolver para guardarlos en los atributos del juego.
    public void llenarJuego(ArrayList<Jugador> jugadores, Revolver revolver) {
        this.jugadores = jugadores;
        this.revolver = revolver;
    }
//• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
//aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
//moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
//mojar. Al final del juego, se debe mostrar que jugador se mojó.

    public void ronda(){
        int i=0;
        do {
            System.out.println(this.revolver.toString());
            System.out.println("");
            System.out.println(this.jugadores.get(i).getNombre()+", presiona enter para el tirito");
            String auxTirito=leer.nextLine();
            //leer.nextLine();
            if (this.jugadores.get(i).disparo(this.revolver)){
                this.jugadores.get(i).setMojado(true);
                System.out.println("Aiii te mojaste "+this.jugadores.get(i).getNombre());
                System.out.println("GAME OVER");
                break;
            } else {
                System.out.println("Zafaste "+this.jugadores.get(i).getNombre()+". Que pase el que sigue.");
                System.out.println("");
                i++;
                if ((i)==(this.jugadores.size())){
                    i=0;
                }
            }

        } while (!this.jugadores.get(i).isMojado());
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Revolver getRevolver() {
        return revolver;
    }

    public void setRevolver(Revolver revolver) {
        this.revolver = revolver;
    }
}
