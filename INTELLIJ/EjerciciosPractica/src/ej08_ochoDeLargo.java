/*
8. Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si
el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje
por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la funció n Lenght() en Java.
<>
 */
import java.util.Scanner;
public class ej08_ochoDeLargo {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);

        System.out.println("Sólo podés escribir frases o palabras de 8 caracteres de largo. Tirá una:");
        String frase = leer.nextLine();

        if (frase.length()<=8){
            System.out.println("Correcto! Así que sabés contar, Einstein!");
        } else {
            System.out.println("Incorrecto! "+frase.length()+" es más que 8. Te aviso.");
        }
    }
}
