import java.util.Scanner;
/*
20. Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.

ejemplo
[2][7][6]
[9][5][1]
[4][3][8]
 */
public class ej20_matrizMagica {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);

        System.out.println("A ver si te escribís una matriz mágica, máquina");

        int[][] matriz=new int[3][3];

        MatrizManual(matriz,3,3);
        MostrarMatriz(matriz,3,3);

        boolean esMagic=MatrizMagica(matriz);

        if (esMagic){
            System.out.println("La matriz es mahike!");
        } else {
            System.out.println("La matriz no es mágica, qué aburrido...");
        }
    }
    public static boolean MatrizMagica(int[][] matriz){
        int verif=0;
        boolean magicM;

        int sumaCero=matriz[0][0]+matriz[0][1]+matriz[0][2];
        int sumaDP=0,sumaDS=0;

        for (int i=0;i<3;i++){
            int sumaCo=0,sumaFi=0;

            for (int j=0;j<3;j++){
                sumaCo=sumaCo+matriz[i][j];
                sumaFi=sumaFi+matriz[j][i];

                if (i==j){
                    sumaDP=sumaDP+matriz[i][j];
                }
            }

            sumaDS=sumaDS+matriz[i][2-i];

            if ((!(sumaCo==sumaFi)) || (!(sumaCero==sumaCo))) {
                verif = verif + 1;
            }
        }
        if (!(sumaDP==sumaDS)){
            verif=verif+1;
        }
        if (verif==0){
            magicM=true;
        } else {
            magicM=false;
        }
        return magicM;
    }

    public static void MatrizManual(int[][] matriz,int filas,int columnas){
        Scanner leer=new Scanner(System.in);
        System.out.println("* Ingrese el valor del índice:");
        for (int i=0;i<filas;i++){
            for (int j=0;j<columnas;j++){
                System.out.println("- ["+i+"]["+j+"]");
                matriz[i][j]=leer.nextInt();
            }
        }
    }
    public static void MostrarMatriz(int[][] matriz,int filas,int columnas){
        System.out.println("Te muestro la matriz:");
        for (int i=0;i<filas;i++){
            for (int j=0;j<columnas;j++){
                System.out.print(" ["+matriz[i][j]+"] ");
            }
            System.out.println("");
        }
    }
}
