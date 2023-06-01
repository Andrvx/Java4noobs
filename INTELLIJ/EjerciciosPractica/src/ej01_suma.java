/*
1. Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma

*/


import java.util.Scanner;

public class ej01_suma {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese dos números enteros:");

        int num1= leer.nextInt();
        int num2= leer.nextInt();

        System.out.println("La suma de "+num1+" y "+num2+" es "+(num1+num2));
    }
}