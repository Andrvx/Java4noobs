import java.util.ArrayList;
import java.util.Scanner;

// 1- Diseñar un programa que lea una serie de valores numéricos enteros desde el teclado y
//los guarde en un ArrayList de tipo Integer. La lectura de números termina cuando se
//introduzca el valor -99. Este valor no se guarda en el ArrayList. A continuación, el
//programa mostrará por pantalla el número de valores que se han leído, su suma y su
//media (promedio).
public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in).useDelimiter("\n");

        ArrayList<Integer> listaNumeros=new ArrayList<>();

        boolean salir=false;

        System.out.println("Ingresemos números en una lista así después te saco unas cuentas. Mandá -99 para terminar.");

        do {
            System.out.print("Decime un número:");
            int numeroAux= leer.nextInt();

            if (!(numeroAux==-99)){
                listaNumeros.add(numeroAux);
            } else {
                salir=true;
                System.out.println("Ok, basta.");
            }
        }while (!salir);

        System.out.println("");
        System.out.println("La lista de números es:");

        Integer suma=0;

        for (Integer num:listaNumeros){
            suma+=num;
            System.out.println("- "+num);
        }
        System.out.println("");
        System.out.println("La suma de todos ellos es:");
        System.out.println("- "+suma);
        System.out.println("");
        System.out.println("La media de todos ellos es:");
        System.out.println("- "+(suma/ listaNumeros.size()));
        System.out.println("");
        System.out.println("Ya está. Chau.");
    }
}