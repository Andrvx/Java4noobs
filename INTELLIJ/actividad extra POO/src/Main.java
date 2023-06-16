import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import entidades.Vehiculo;

import java.util.Scanner;

// clase vehiculo
// marca modelo año tipo (automovil bicicleta motocicleta)
// moverse frenar
//
public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);

        System.out.println("Cuántos vehículos hay en la carrerita?");
        int cantV=leer.nextInt();

        Vehiculo[] vehiculos=new Vehiculo[cantV];

        for (int i=0;i<cantV; i++){
            vehiculos[i]=new Vehiculo();
            vehiculos[i].CrearAuto();
        }
        int distAux;

        for (int i=0;i<cantV; i++){
            distAux=vehiculos[i].Moverse(5);
            System.out.println("Un/una "+vehiculos[i].tipo+" recorre en 5 segundos "+distAux+" metros.");

            distAux=vehiculos[i].Moverse(10);
            System.out.println("Un/una "+vehiculos[i].tipo+" recorre en 10 segundos "+distAux+" metros.");

            distAux=vehiculos[i].Moverse(60);
            System.out.println("Un/una "+vehiculos[i].tipo+" recorre en 60 segundos "+distAux+" metros.");
        }

        int[] distancias=new int[cantV];
        int posi=0;

        for (int i=0; i<cantV;i++){
            distancias[i]=vehiculos[i].Moverse(300)+vehiculos[i].Frenarse();
        }
        for (int i=0; i<cantV;i++) {
            if (i!=0){
                if (distancias[i]>distancias[posi]){
                    posi=i;
                }
            }
        }
        System.out.println("El vehículo n° "+(1+posi)+" fue el que recorrió más distancia ("+distancias[posi]+" metros).");
        System.out.println(vehiculos[posi].toString());
    }
}