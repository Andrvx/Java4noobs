import static java.lang.Math.random;

/*
18. Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
obtiene cambiando sus filas por columnas (o viceversa).
 */
public class ej18_matrizTransp {
    public static void main(String[] args){
        int dim=4;

        int[][] matriz;
        //matriz=new int[4][4];
        matriz=new int[dim][dim];


        RellenaMatrizRandom(matriz,dim,dim);
        MostrarMatriz(matriz,dim,dim);
        MostrarTranspuesta(matriz,dim,dim);
    }
    public static void RellenaMatrizRandom(int[][] matriz,int filas,int columnas){
        System.out.println("**Rellenando matriz con numeros aleatorios**");
        for (int i=0;i<filas;i++){
            for (int j=0;j<columnas;j++){
                matriz[i][j]=(int) (random()*10);
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
    public static void MostrarTranspuesta(int[][] matriz,int filas,int columnas){
        System.out.println("La matriz transpuesta es así:");
        for (int j=0;j<columnas;j++){
            for (int i=0;i<filas;i++){
                System.out.print(" ["+matriz[i][j]+"] ");
            }
            System.out.println("");
        }
    }
}
