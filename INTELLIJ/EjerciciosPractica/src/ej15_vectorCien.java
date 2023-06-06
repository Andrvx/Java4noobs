/*
15. Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente
 */

public class ej15_vectorCien {
    public static void main(String[] args){
        System.out.println("Creando un vector.");
        int[] vector = new int[100];

        System.out.println("Rellenando vector.");
        RellenoVector(vector);

        System.out.println("Mostrando vector de manera descendente.");
        MostrarVectorDesc(vector);

    }
    public static void MostrarVectorDesc(int[] vector){
        for (int i = 99; i > -1; i--){
            System.out.print("("+i+")["+vector[i]+"]-");
        }
    }
    public static void RellenoVector(int[] vector){
        for (int i=0;i<100;i++){
            vector[i]=i+1;
        }
    }
}
