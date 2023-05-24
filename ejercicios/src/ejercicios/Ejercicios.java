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
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner read = new Scanner(System.in);
        /*
        System.out.println("ingresa nombre");
        String nombre = read.nextLine();
        
        System.out.println("ingresa edad");
        int edad = read.nextInt();
        */
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
    }
    
}
