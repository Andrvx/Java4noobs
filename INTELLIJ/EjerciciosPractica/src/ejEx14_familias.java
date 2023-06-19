import java.util.Scanner;

/*
14. Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la
cantidad de hijos para averiguar la media de edad de los hijos de todas las familias.
 */
public class ejEx14_familias {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);

        System.out.println("Decime cuántas familias querés comparas");
        int N= leer.nextInt();

        int suma=0;
        int edad;

        int[] vProm=new int[N];
        int[] vM=new int[N];

        for (int i=0;i<N;i++){
            System.out.println("Cuántos hijos tiene la "+(i+1)+"° familia?");
            vM[i]= leer.nextInt();

            suma=0;

            for (int j=0;j<vM[i];j++){
                System.out.println("Decime la edad del hijo n°"+(j+1)+":");
                edad= leer.nextInt();
                suma=suma+edad;
            }
            vProm[i]=(suma/vM[i]);
        }

        for (int k=0;k<N;k++){
            System.out.println("*** La "+(k+1)+"° familia tiene "+vM[k]+" hijes con promedio de edad de "+vProm[k]+" años.");
        }
    }
}
