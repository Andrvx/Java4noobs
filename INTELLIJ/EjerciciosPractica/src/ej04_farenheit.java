/*
4. Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */

import java.util.Scanner;
public class ej04_farenheit {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        System.out.println("Qué temperatura anda haciendo?");
        int tempC=leer.nextInt();

        System.out.println("Míra tú, te lo paso a Farenheit. Porque sí.");
        System.out.println(tempC+"°C = "+(32 + (9 * tempC / 5))+"° F");
        System.out.println("");
        System.out.println("Ya está.");

    }
}
