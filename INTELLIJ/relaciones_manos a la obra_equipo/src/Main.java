import entidades.Equipo;
import entidades.Jugador;

import java.util.ArrayList;
import java.util.TreeSet;

// Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
//y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
//esto, desde el main recorreremos el equipo mostrando la información de cada jugador
public class Main {
    public static void main(String[] args) {
        Jugador arquero=new Jugador("dibu","martinez",23,"arquero");
        Jugador mediocampo=new Jugador("leandro","paredes",5,"stopper?");
        Jugador enganche=new Jugador("lionel","messi",10,"loquetengaganas");
        Jugador punta=new Jugador("araña","alvarez",9,"puntamoderno");

        ArrayList<Jugador> jugadores=new ArrayList<>();

        jugadores.add(arquero);
        jugadores.add(mediocampo);
        jugadores.add(enganche);
        jugadores.add(punta);

        Equipo equipo=new Equipo("La scaloneta",jugadores);

        System.out.println(equipo.toString());


    }
}