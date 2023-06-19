import java.util.Scanner;

import static java.lang.Math.random;

/*
10. Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
public class ejEx10_adivinarMultip {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);

        System.out.println("Adivina el resultado de multiplicar dos números enteros entre 0 y 10.");

        int multiNum= (((int)(random()*10))*((int)(random()*10)));

        System.out.println("Decime un número");
        int advNum=leer.nextInt();

        while (!(advNum==multiNum)) {
            System.out.println("No adivinaste, probá de nuevo");
            advNum=leer.nextInt();
        }

        System.out.println("Adivinaste!! "+advNum+" es igual a "+multiNum);
    }
}
