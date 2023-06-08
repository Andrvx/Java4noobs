import java.util.Scanner;

/*
4. Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
 */
public class ejEx04_arabeToRomano {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);

        System.out.println("*** Conversor (Limitadito) a Numeral Romano ***");

        System.out.println("Decime un número, entre 1 y 10.");
        int numA= leer.nextInt();
        //validación
        while ((numA<1)||(numA>10)){
            System.out.println("Eso está fuera de rango, entre 1 y 10 es la cosa! Probá de nuevo.");
            numA= leer.nextByte();
        }
        System.out.print(numA+" en números romanos es: ");
        switch (numA){
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
            case 8:
                System.out.println("VIII");
                break;
            case 9:
                System.out.println("IX");
            case 10:
                System.out.println("X");
        }
        System.out.println("");
        System.out.println("Feliz de haber sido útil, nos vemos!");
    }
}
