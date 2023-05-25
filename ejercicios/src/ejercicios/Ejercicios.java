/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

import java.util.Scanner;


/**
 *
 * @author andre
 */
public class Ejercicios {

    /**
     * @param args the command line arguments
     */
    /*
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner read = new Scanner(System.in);
        /*
        System.out.println("ingresa nombre");
        String nombre = read.nextLine();
        
        System.out.println("ingresa edad");
        int edad = read.nextInt();
        */
    /*
        System.out.println("");
        System.out.println("ejercicio5");
        
        System.out.println("");
        
        System.out.println("Ingresa true o false");
        boolean bandera = read.nextBoolean();
        
        System.out.println("ingresa un númerote");
        double num = read.nextDouble();
        
        System.out.println("ingresa una letra");
        char caracter = read.next().charAt(0);
        
        System.out.println("");
        System.out.println("ahí van las variables en pantalla:");
        System.out.println("bandera: " + bandera);
        System.out.println("num: " + num);
        System.out.println("caracter: " + caracter);
 */
    
//deteccion de errores
    
/*   public static void main(String[] args) {
Scanner leer = new Scanner(System.in);
System.out.println("Ingresa tu edad");
int edad = leer.nextInt();
System.out.println("Ingresa tu nombre");
String nombre = leer.next();
*/

    /*
        EJERCICIO 6
Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
alguno de ellos es mayor a 25.        
        
    
    public static void main(String[] args) {
        
    Scanner leer = new Scanner(System.in);
    
        System.out.println("Ingrese un número");
        int num1 = leer.nextInt();
        
        System.out.println("Ingrese otro número");
        int num2 = leer.nextInt();
        
        System.out.println("ahora sí, la maravilla de las matemáticas:");
        
        if (num1<25) {
            System.out.println(num1 + " es menor que 25.");
         }else if (num1==25){
                    System.out.println(num1 + " es igual a 25. ni einstein se animó a tanto.");
                    }else {
                    System.out.println(num1 + " es mayor que 25.");
                    }
        
                  
        if (num2<25) {
            System.out.println(num2 + " es menor que 25.");
         }else if (num2==25){
                    System.out.println(num2 + " es igual a 25. newton un poroto.");
                    }else {
                    System.out.println(num2 + " es mayor que 25.");
                    }
    }
*/
   /*
    EJERCICIO 7
Considera que estás desarrollando una web para una empresa que fabrica motores (suponemos
que se trata del tipo de motor de una bomba para mover fluidos). Definir una variable tipoMotor
y permitir que el usuario ingrese un valor entre 1 y 4. El programa debe mostrar lo siguiente:
o Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de
agua”.
o Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de
gasolina”.
o Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de
hormigón”.
o Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de
pasta alimenticia”.
o Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor
válido para tipo de bomba”
    */ 
    
    public static void main (String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el tipo de motor (1-2-3-4)");
        int tipoMotor = leer.nextInt();
        
        switch(tipoMotor) {
            case 1:
                System.out.println("La bomba es de agua.");
                break;                
            case 2:
                System.out.println("La bomba es de gasolina.");
                break;                
            case 3:
                System.out.println("La bomba es de hormigón.");
                break;
            case 4:
                System.out.println("La bomba es de pasta alimenticia, whatever that means.");
                break;
            default:
                System.out.println("Ese motor no existe, papu.");
        }
        
        
    }
    
    
}
