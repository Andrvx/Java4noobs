import java.util.Scanner;
/*
1. Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
public class ejEx01_minutosAhoras {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);

        System.out.println("Ponete una cantidad realista de minutos:");
        int minAbs= leer.nextInt();

        MinutosToHoras(minAbs);

        System.out.println("chaucha");
    }

    public static void MinutosToHoras(int minAbs){
        int minFin=minAbs%60;
        int horasAbs=(minAbs-minFin)/60;
        int horasFin=horasAbs%24;
        int diasFin=(horasAbs-horasFin)/24;

        System.out.println("");
        System.out.println("**** Java goes brrrrrrr ****");
        System.out.println("");
        System.out.println(minAbs+" minutos equivalen a "+diasFin+" días, "+horasFin+" horas, y "+minFin+" minutos.");
    }
}
