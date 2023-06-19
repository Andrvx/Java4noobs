import java.util.Scanner;

public class ejEx12_contadorTresDigitos {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);

        System.out.println("Querés que arranque el contador (S/N)?");
        String aldope= leer.next();

        for (int i=0;i<10;i++){
            for (int e=0;e<10;e++){
                for (int j=0;j<10;j++){
                    if (i==3){
                        System.out.print("E-");
                    } else {
                        System.out.print(i+"-");
                    }
                    if (e==3){
                        System.out.print("E-");
                    } else {
                        System.out.print(e+"-");
                    }
                    if (j==3){
                        System.out.print("E");
                    } else {
                        System.out.print(j);
                    }
                    System.out.println("");
                }
            }
        }
    }
}
