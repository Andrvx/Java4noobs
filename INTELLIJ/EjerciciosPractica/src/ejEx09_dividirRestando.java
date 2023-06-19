/*
9. Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas.
Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor,
este resultado es el residuo, y el número de restas realizadas es el cociente.

Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas

dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.

¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
 */
import java.util.Scanner;

public class ejEx09_dividirRestando {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);

        System.out.println("Vamos a hacer una división, decime dos enteros positivos:");
        int num1= leer.nextInt();
        int num2= leer.nextInt();
        int cociente=0;
        int resto=num1;

        if (num1>=num2) {
            do {
                resto = resto - num2;
                cociente++;
            } while (resto >= num2);
        } else {
            cociente=0;
            resto=num1;
        }

        System.out.println("El cociente entero de "+num1+" dividido por "+num2+" es "+cociente+" con resto de "+resto+".");
    }
}
