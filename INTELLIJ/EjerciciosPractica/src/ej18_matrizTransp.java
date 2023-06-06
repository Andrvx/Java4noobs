import static java.lang.Math.random;

/*
18. Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
obtiene cambiando sus filas por columnas (o viceversa).
 */
public class ej18_matrizTransp {
    public static void main(String[] args){
        int dim=4;

        int[][] matriz=new int[dim][dim];

        RellenaMatrizRandom(matriz,dim,dim);
        MostrarMatriz(matriz,dim,dim);

    }
    public static void RellenaMatrizRandom(int[][] matriz,int filas,int columnas){
        for (int i=0;i<filas;i++){
            for (int j=0;i<columnas;j++){
                matriz[i][j]=(int) (random()*10);
            }
        }
    }
    public static void MostrarMatriz(int[][] matriz,int filas,int columnas){
        for (int i=0;i<filas;i++){
            for (int j=0;i<columnas;j++){
                System.out.print(" ["+matriz[i][j]+"] ");
            }
            System.out.println("");
        }
    }
}
