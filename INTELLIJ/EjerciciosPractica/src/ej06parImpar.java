/*
6. Crear un programa que dado un numero determine si es par o impar.
 */
import java.util.Scanner;
public class ej06parImpar {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);

        System.out.println("Determinemos si el número que vas a ingresar es par o impar.");
        int num= leer.nextInt();

        if (num%2==0){
            System.out.println("Es par. Posta.");
        } else {
            System.out.println("Es impar.");
        }
        System.out.println("Nos vemos, máquina.");
    }
}
