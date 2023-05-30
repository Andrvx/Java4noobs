/*
 Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package ejercicios;

import java.util.Scanner;

/**
 *
 * @author andre
 */
public class ej10 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        
        int num1=0;
        int num2=0;
        int num3=0;
        int num4=0;
        int aux;
        
        System.out.println("Ingrese 4 números entre 1 y 20");
        
        for (int i = 1; i < 5; i++) {
            
            aux =leer.nextInt();
            
            while (aux<1 || aux>20){
                System.out.println("Entre 1 y 20, salamín, probá de nuevo.");
                aux=leer.nextInt();            
            }
            switch (i) {
                case 1:
                    num1=aux;
                break;
                case 2:
                    num2=aux;
                break;
                case 3:
                    num3=aux;
                break;
                case 4:
                    num4=aux;
                break;
            }
        }
        
        System.out.println("");
        
        for (int i = 0; i < num1; i++) {
            if (i == 0) {
                System.out.print(num1);
                System.out.print(" ");
            }
            System.out.print("* ");
        }
        System.out.println("");
        
        for (int i = 0; i < num2; i++) {
            if (i == 0) {
                System.out.print(num2);
                System.out.print(" ");
            }
            System.out.print("* ");
        }
        System.out.println("");
        
        for (int i = 0; i < num3; i++) {
            if (i == 0) {
                System.out.print(num3);
                System.out.print(" ");
            }
            System.out.print("* ");
        }
        System.out.println("");
        
        for (int i = 0; i < num4; i++) {
            if (i == 0) {
                System.out.print(num4);
                System.out.print(" ");
            }
            System.out.print("* ");
        }
        System.out.println("");
        System.out.println("");
        System.out.println("Ya está. chaucha.");
    }
}
