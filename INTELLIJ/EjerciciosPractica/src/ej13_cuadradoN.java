/*
13. Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 */

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class ej13_cuadradoN {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);

        System.out.println("Decime el tamaño del cuadrado a dibujar");
        int lado=leer.nextInt();

        System.out.println("");

        for (int i = 0;i<lado;i++){
            for (int j=0;j<(lado);j++){
                if (i==0){
                   System.out.print("*");
                }else if (i==(lado-1)){
                        System.out.print("*");
                        }else if (j==0){
                                System.out.print("*");
                                } else if (j==(lado-1)){
                                        System.out.print("*");
                                        } else {
                                        System.out.print(" ");
                                                }

            }
            System.out.println("");
        }
    }
}
