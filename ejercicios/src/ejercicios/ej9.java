/*
do {
<sentencias>
} while (<condición>);

EJERCICIO 9
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar
el resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class ej9 {
public static void main(String[] args){
    Scanner leer = new Scanner(System.in);
    
    int suma1 = 0;
    int numero;
    int contador = 0;
    
    System.out.println("Ingrese 20 números");
    
    do {
        numero = leer.nextInt();
        
        contador = (contador + 1);
                
        if (numero>0) {
            suma1 = (suma1 + numero);
        }else{
        break;
        }
    } while (numero != 0) && (contador < 21);
    
            
    System.out.println("Se capturó el número cero. Y la suma de los números positivos ingresados es " + suma1);
}
        
}
