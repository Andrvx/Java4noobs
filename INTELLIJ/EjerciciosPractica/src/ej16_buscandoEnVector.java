import java.util.Scanner;

import static java.lang.Math.floor;
import static java.lang.Math.random;

/*
16. Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida
al usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido.
 */
public class ej16_buscandoEnVector {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);

        System.out.println("De qué tamaño desea su vector?");
        int dim= leer.nextInt();

        System.out.println("Creando vector de enteros aleatorios.");
        int[] vector=new int[dim];
        CrearVectorRandom(dim,vector);

        MostrarVector(vector,dim);

        System.out.println("Decime un número entero para buscar en el vector entre 0 y 100.");
        int num= leer.nextInt();

        System.out.println("Buscando número en el arreglo");
        BuscaEnVector(dim,num,vector);

        System.out.println("Me aburrí, me voy.");
    }

    public static void MostrarVector(int[] vector,int dim){
        for (int i=0;i<dim;i++){
            System.out.print(" ["+vector[i]+"] ");
        }
        System.out.println("");
    }
    public static void BuscaEnVector(int dim,int num,int[] vector){
        int cont=0;
        for (int i=0;i<dim;i++){
            if (vector[i]==num){
                cont++;
            }
        }
        System.out.println("El número "+num+" está "+cont+" veces en el arreglo.");
        System.out.println("Te lo muestro para verificar.");
        MostrarVector(vector,dim);
    }

    public static void CrearVectorRandom(int dim,int[] vector){
        for(int i=0;i<dim;i++){
            vector[i]= (int) floor((random()*100));
        }

    }
}
