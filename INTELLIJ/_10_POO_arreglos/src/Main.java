import java.util.Arrays;
import java.util.Scanner;

//10. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
//de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
//programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
//Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
//ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
//0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
//20.
public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);

        double[] A=new double[50];
        double[] B=new double[20];

        System.out.println("** Inicializando arreglo A **");
        for (int i=0;i<50;i++){
            A[i]= (double) (Math.round((Math.random()) * 4500)) /100;
        }
        System.out.println("");

        System.out.println("** Arreglo A **");
        System.out.println(Arrays.toString(A));
        System.out.println("");
        /*
        for (int i=0;i<50;i++){
            System.out.println("["+A[i]+"] ");
        }
        */
        System.out.println("** Ordenando A de menor a mayor **");
        Arrays.sort(A);
        System.out.println("");
        System.out.println("** Arreglo A ordenado **");
        System.out.println(Arrays.toString(A));
        System.out.println("");

        System.out.println("** Copiando 10 primeros elementos de A a B **");
        for (int i=0;i<10;i++) {
            Arrays.fill(B,i,i+1,A[i]);
        }
        System.out.println("");
        System.out.println("** Rellenando 10 últimos elementos de B con 0,5 **");
        Arrays.fill(B,10,19,0.5);
        System.out.println("");

        System.out.println("*** Mostrando arreglos resultantes ***");
        System.out.println("- A -");
        System.out.println(Arrays.toString(A));
        System.out.println("- B -");
        System.out.println(Arrays.toString(B));
        System.out.println("");
        System.out.println("Listo");
    }
}