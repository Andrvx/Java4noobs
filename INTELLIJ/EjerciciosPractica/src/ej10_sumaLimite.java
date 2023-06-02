import java.util.Scanner;

/*
10. Escriba un programa en el cual se ingrese un valor lí mite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere el
lí mite inicial.
<>
 */
public class ej10_sumaLimite {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);

        System.out.println("Qué número querés que sea el límite de la suma?");
        int max = leer.nextInt();
        int suma = 0;

        System.out.println("Decime números para ir sumando:");
        do {
        suma += leer.nextInt();
        } while (suma<=max);

        System.out.println("La suma de todos esos números es "+suma+" y superó el límite ("+max+") por "+(suma-max)+".");
    }
}
