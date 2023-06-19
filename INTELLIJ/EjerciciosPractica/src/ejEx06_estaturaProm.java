/*
6. Leer la altura de N personas y determinar el promedio de estaturas que se encuentran
por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
import java.util.Scanner;

public class ejEx06_estaturaProm {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);

        System.out.println("*** Detector de Petisos ***");
        System.out.println("");
        System.out.println("Cuántas personas mediste?");
        int N= leer.nextInt();

        double[] vAlturas=new double[N];

        System.out.println("Ingresá la altura de las "+N+" personas, en metros.");

        for (int i=0;i<N;i++){

            System.out.println("N° "+(i+1)+":");
            vAlturas[i]=leer.nextDouble();
        }
        double totA=0;
        double totP=0;
        double Np=0;

        for (int j=0;j<N;j++){
            totA=totA+vAlturas[j];
            if ((vAlturas[j])<(1.60)){
                totP=totP+vAlturas[j];
                Np++;
            }
        }

        System.out.println("");
        System.out.println("El promedio general de alturas es de "+(totA/N)+" metros, y el de la gente verticalmente desafiada es de "+(totP/Np)+" metros.");
        System.out.println("No quiero ni saber qué vas a hacer con esta data, dejá.");
        System.out.println("");
    }
}
