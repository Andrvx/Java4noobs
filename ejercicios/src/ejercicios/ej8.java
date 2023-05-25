/*
while (<condición>) {
<sentencias>
}
EJERCICIO 8
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
pedirá de nuevo hasta que la nota sea correcta.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class ej8 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Validando notas de 1 a 10.");
        
        System.out.println("Ingrese la nota");
        int nota = leer.nextInt();
        
        while (nota<0 || nota>10) {
            System.out.println("La nota está fuera de rango, ingrese una nota entre 0 y 10");
            nota = leer.nextInt();
        }
        
        System.out.println("La nota " + nota + " es válida.");
        
    }
    
}
