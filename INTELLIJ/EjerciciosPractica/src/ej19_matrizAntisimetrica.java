import java.util.Scanner;

/*
19. Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que
una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada
de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).

 */
public class ej19_matrizAntisimetrica {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);

        int[][] matriz=new int[3][3];
        int[][] matrizTrns=new int[3][3];

        System.out.println("Rellenate una matriz 3x3, y veamos si es ANTISIMÉTRICAAAA!");

        MatrizManual(matriz,3,3);
        MostrarMatriz(matriz,3,3);
        MatrizTranspuestaNegativa(matriz,matrizTrns,3,3);
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
    public static void MatrizTranspuestaNegativa(int[][] matriz,int[][] matrizT,int filas,int columnas){
        System.out.println("**Generando matriz transpuesta negativa**");
        for (int j=0;j<columnas;j++){
            for (int i=0;i<filas;i++){
                matrizT[j][i]=(matriz[i][j]*-1);
            }
        }
        MostrarMatriz(matrizT,filas,columnas);

        int aux=0;

        for (int i=0;i<filas;i++){
            for (int j=0;j<columnas;j++){
                if (!(matriz[i][j]==matrizT[i][j])){
                    aux++;
                }
            }
        }
        if (aux==0) {
            System.out.println("La matriz es ANTISIMÉTRICA, posta.");
        } else {
            System.out.println("La matriz NO es ANTISIMÉTRICA, es comunarda.");
        }
    }
}
