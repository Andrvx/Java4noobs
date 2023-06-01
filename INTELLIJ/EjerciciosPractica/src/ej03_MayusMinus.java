/*
3. Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en
Java
 */
import java.util.Scanner;

public class ej03_MayusMinus {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);

        System.out.println("Decime una frase:");

        String frase = leer.nextLine();

        System.out.println(frase+", si lo pongo todo en mayúsculas queda así: "+frase.toUpperCase()+". Y si la pasamos a minúsculas queda así: "+frase.toLowerCase());
    }
}
