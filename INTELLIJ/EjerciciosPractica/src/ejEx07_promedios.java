import java.util.Scanner;

/*
7. Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
promedio de n números (n>0). El valor de n se solicitará al principio del programa y los
números serán introducidos por el usuario. Realice dos versiones del programa, una
usando el bucle “while” y otra con el bucle “do - while”.
 */
public class ejEx07_promedios {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);

        System.out.println("Cuántos números vamos a comparar?");
        int dim= leer.nextInt();

        int[] vNum=new int[dim];
/*
//versión while

        int i=0;

            while (i<dim){
            System.out.println("Ingrese el "+(i+1)+"° número:");
            vNum[i]= leer.nextInt();
            i++;
            }

            int mayor=vNum[0];
            int menor=vNum[0];
            int suma=vNum[0];
            i=1;
            while (i<dim){
                if (vNum[i]>mayor){
                    mayor=vNum[i];
                }
                if (vNum[i]<menor) {
                    menor=vNum[i];
                }
                suma=suma+vNum[i];
                i++;
            }
            i=0;
            while (i<dim){
                System.out.print(" ["+vNum[i]+"] ");
                i++;
            }

 */
//versión do-while
        int i=0;

        do {
            System.out.println("Ingrese el "+(i+1)+"° número:");
            vNum[i]= leer.nextInt();
            i++;
        } while (i<dim);

        int mayor=vNum[0];
        int menor=vNum[0];
        int suma=vNum[0];
        i=1;
        do {
            if (vNum[i]>mayor){
                mayor=vNum[i];
            }
            if (vNum[i]<menor) {
                menor=vNum[i];
            }
            suma=suma+vNum[i];
            i++;
        } while (i<dim);

        i=0;
        do {
            System.out.print(" ["+vNum[i]+"] ");
            i++;
        } while (i<dim);
            System.out.println("");
        float prom=((float) suma /dim);
        System.out.println("El mayor número es "+mayor+", el menor es "+menor+", y el promedio es "+prom+".");

    }
}
