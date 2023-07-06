package service;

import entidades.Ahorcado;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ServiceAhorcado {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    // Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
//Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
//vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
//de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
//máximas, el valor que ingresó el usuario y encontradas en 0.
    public void crearJuego(Ahorcado ahorcado){
        System.out.println("--- Crear Juego ---");
        System.out.println("Ingrese una palabra");
        String palabra=leer.next();

        ahorcado.setLargoPalabra(palabra.length());

        ahorcado.setVectorPalabra(palabra.toCharArray());

        ahorcado.setVectorBuscando();

        boolean valid= false;
        do {
            System.out.println("Cuántas jugadas se pueden hacer?");
            try {
                ahorcado.setCantJugadas(leer.nextInt());
                valid=true;
            }catch (InputMismatchException error){
                System.out.println("Tenés que ingresar un número, tontuelo!");
            }
        } while (!valid);

        System.out.println("");
    }
    // Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
//buscar como se usa el vector.length.
    public void longitud(Ahorcado ahorcado){
        System.out.println("La palabra tiene "+ahorcado.getVectorPalabra().length+" letras.");
        System.out.println("");
    }
    // Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
//letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
    public void buscar(Ahorcado ahorcado,char letra){
        int contador=0;

        ahorcado.setLetrasYaBuscadas(letra);

        for (int i=0;i< ahorcado.getLargoPalabra();i++) {
            if (ahorcado.getVectorPalabra()[i]==letra){
                ahorcado.setVectorBuscando(i,letra);
                contador++;
            }
        }
        if (contador!=0){
            ahorcado.setCantEncontradas(ahorcado.getCantEncontradas()+contador);
            System.out.println("La letra "+letra+" se encuentra "+contador+" veces en la palabra!");
            System.out.println(Arrays.toString(ahorcado.getVectorBuscando()));
        } else {
            System.out.println("Esa letra no está, mal ahí!");
            System.out.println("Ya probaste con: "+ahorcado.getLetrasYaBuscadas());
        }
        ahorcado.setCantJugadas(ahorcado.getCantJugadas()-1);
        System.out.println("Te quedan "+ahorcado.getCantJugadas()+" jugadas.");
    }

// Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
//cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
//devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
//busque una letra que no esté, se le restará uno a sus oportunidades.
//No los hice por redundantes

// Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
    public boolean intentos(Ahorcado ahorcado){
        return (ahorcado.getCantJugadas()>0);
    }

// Método juego(): el método juego se encargará de llamar todos los métodos
//previamente mencionados e informará cuando el usuario descubra toda la palabra o
//se quede sin intentos. Este método se llamará en el main.
    public void juego(Ahorcado ahorcado){
        System.out.println("--- Arrancamos!! ---");
        crearJuego(ahorcado);

        longitud(ahorcado);
        System.out.println(Arrays.toString(ahorcado.getVectorBuscando()));
        System.out.println("");

        String aux;
        char letra;
        boolean ganar=false;

        while (intentos(ahorcado) && !ganar){
            System.out.println("Decime una letra");
            aux=leer.next();
            letra=aux.charAt(0);
            buscar(ahorcado,letra);

            if (Arrays.equals(ahorcado.getVectorPalabra(), ahorcado.getVectorBuscando())){
                ganar=true;
            }
        }

        if (ganar){
            System.out.println("Ganasteeeee!!!!");
            System.out.println(Arrays.toString(ahorcado.getVectorPalabra()));
            System.out.println("");
        }
        if (!intentos(ahorcado)){
            System.out.println("Se te terminaron las oportunidades, sorry :(");
            System.out.println("");
        }

    }
}
