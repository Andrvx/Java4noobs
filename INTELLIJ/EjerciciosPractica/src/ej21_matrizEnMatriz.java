import java.util.Scanner;

import static java.lang.Math.random;

/*
21. Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3
que se pueden formar en la matriz M, desplazándose por filas o columnas, existe al
menos una que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la
columna de la matriz M en la cual empieza el primer elemento de la submatriz P.
Ejemplo:
 */
public class ej21_matrizEnMatriz {
    public static void main(String[] args){
        int[][] matrizM=new int[10][10];
        int[][] matrizP=new int[3][3];
        int[] VposiciOn=new int[2];
        //rellenando matriz M y mostrandola.
        RellenaMatrizRandom(matrizM,10,10);
        MostrarMatriz(matrizM,10,10);
        //rellenando manualmente matriz P
        MatrizManual(matrizP,3,3);
        //buscando matriz
        boolean SubM=MatrizEnMatriz(matrizM,matrizP,VposiciOn);
        //mostrando resultado
        MostrarMatriz(matrizM,10,10);
        MostrarMatriz(matrizP,3,3);
        System.out.println("");

        if (SubM=true){
            System.out.println("La submatriz se encuentra en la posición ["+VposiciOn[0]+"] - ["+VposiciOn[1]+"].");
        } else {
            System.out.println("La submatriz no se encuentra en la matriz grandota :(");
        }
        System.out.println("Chau");
    }

    public static boolean MatrizEnMatriz(int[][] matrizM,int[][] matrizP,int[] VposiciOn){
        System.out.println("*** Buscando submatriz en arreglo random ***");
        //declarando v retorno
        boolean SubM=false;
        //rango lenght-2 para no salir de rango en la búsqueda.
        for (int i=0;i<((matrizM[0].length)-2);i++){
            for (int j=0;j<((matrizM[0].length)-2);j++){
                //camprando submatriz en una sentencia.
                if ((matrizM[i][j]==matrizP[0][0]) && (matrizM[i][j+1]==matrizP[0][1]) && (matrizM[i][j+2]==matrizP[0][2]) && (matrizM[i+1][j]==matrizP[1][0]) && (matrizM[i+1][j+1]==matrizP[1][1]) && (matrizM[i+1][j+2]==matrizP[1][2]) && (matrizM[i+2][j]==matrizP[2][0]) && (matrizM[i+2][j+1]==matrizP[2][1]) && (matrizM[i+2][j+2]==matrizP[2][2])){
                    VposiciOn[0]=i;
                    VposiciOn[1]=j;
                    SubM=true;
                    break;
                }
                /*    //si se encuentra coincidencia en el primer índice, se verifican el resto.
                if (matrizM[i][j]==matrizP[0][0]){
                    if (matrizM[i][j+1]==matrizP[0][1]){
                        if (matrizM[i][j+2]==matrizP[0][2]){
                            if (matrizM[i+1][j]==matrizP[1][0]){
                                if (matrizM[i+1][j+1]==matrizP[1][1]){
                                    if (matrizM[i+1][j+2]==matrizP[1][2]){
                                        if (matrizM[i+2][j]==matrizP[2][0]){
                                            if (matrizM[i+2][j+1]==matrizP[2][1]){
                                                if (matrizM[i+2][j+2]==matrizP[2][2]){
                                                    //guardamos posición en vector y salimos del loop.
                                                    VposiciOn[0]=i;
                                                    VposiciOn[1]=j;
                                                    SubM=true;
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                */
            }
            if (SubM==true){
                break;
            }
        }
        return SubM;
    }
    public static void RellenaMatrizRandom(int[][] matriz,int filas,int columnas){
        System.out.println("**Rellenando matriz con numeros aleatorios**");
        for (int i=0;i<filas;i++){
            for (int j=0;j<columnas;j++){
                matriz[i][j]=(int) (random()*10);
            }
        }
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
