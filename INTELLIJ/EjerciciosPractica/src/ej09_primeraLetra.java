/*
9. Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla
que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota:
investigar la función Substring y equals() de Java.
 */
import java.util.Scanner;
public class ej09_primeraLetra {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);

        System.out.println("Sólo podés escribir frases o palabras que empicen en 'A'. Tirá una:");
        String frase = leer.nextLine();

        String aux = frase.substring(0);

        if (aux.equals("A") || aux.equals("a")){
            System.out.println("Correcto!");
        } else {
            System.out.println("Incorrecto!");
        }
    }
}
