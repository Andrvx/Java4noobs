import java.util.Scanner;

/*
11. Escribir un programa que lea un número entero y devuelva el número de dígitos que
componen ese número. Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el
operador de división. Nota: recordar que las variables de tipo entero truncan los
números o resultados.
 */
public class ejEx11_cuentaDigitos {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);

        System.out.println("Estoy aburrido... Vamos a contar los digitos de un número.");
        System.out.println("Decime un numerote entero.");
        int num=leer.nextInt();
        int digi=0;
        int aux=num;

        if (num<10){
            digi=1;
        } else {
            do {
               aux=aux/10;
               digi++;
            } while (aux!=0);
        }
        System.out.println(num+" tiene "+digi+" dígito/s. Qué divertido!");
    }
}
