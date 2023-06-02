/*
7. Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.
 */
import java.util.Scanner;

public class ej07_eureka {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);

        System.out.println("A ver si sabés la frase??? Decime:");
        String frase = leer.nextLine();

        if (frase.equals("eureka")){
            System.out.println("Corrrrecto!!!");
        } else {
            System.out.println("Innnncorrecto!!!");
        }

        System.out.println("Ya está.");

    }
}
