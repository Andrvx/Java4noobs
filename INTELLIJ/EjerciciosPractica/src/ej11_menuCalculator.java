/*
11. Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
del programa, caso contrario se vuelve a mostrar el menú.
 */
import com.sun.deploy.security.SelectableSecurityManager;

import java.util.Scanner;

public class ej11_menuCalculator {
    public static void main(String[] args){
    Scanner leer = new Scanner(System.in);

        System.out.println("Decime dos números para sacar cuentas y eso:");
        int num1= leer.nextInt();
        int num2= leer.nextInt();

        menu(num1,num2);

        System.out.println("Lo vemon!");
    }

    public static void menu(int num1,int num2){
        Scanner leer = new Scanner(System.in);

        boolean preg;
        boolean exit=false;

    do {

        System.out.println("Elija una opción:");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");

        int opc=leer.nextInt();



        switch (opc) {
            case 1:
                System.out.println("La suma de "+num1+" y "+num2+" es "+(num1+num2));
                break;
            case 2:
                System.out.println("La resta de "+num1+" y "+num2+" es "+(num1-num2));
                break;
            case 3:
                System.out.println(num1+" multiplicado por "+num2+" es "+(num1*num2));
                break;
            case 4:
                System.out.println(num1+" dividido por "+num2+" es "+(num1/num2));
                break;
            case 5:
                do {
                    System.out.println("Está seguro que desea salir? (S/N)");
                    String salir= leer.next();

                        if (salir.equals("S") || salir.equals("s")){
                            exit = true;
                            break;
                        } else if (salir.equals("N") || salir.equals("n")) {
                                exit =false;
                                preg =true;
                                } else {
                            System.out.println("Eso no es S o N...");
                                preg = false;
                                    }
                } while (preg==false);

        }
    } while (exit==false);
}
}