import java.util.Scanner;

// 3 Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
//números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
//para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
//una división con los dos numeros y mostrar el resultado.
public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in).useDelimiter("\n");

        DivisionNumero DN=new DivisionNumero();
        boolean valid=false;

        String nString1,nString2;
        Integer numInt1=1,numInt2=0;

        do {
            System.out.println("Tirate un número:");

            nString1= leer.nextLine();

            try {
                numInt1 = Integer.parseInt(nString1);
                valid=true;
            } catch (NumberFormatException e){
                System.out.println("Eso no es un número");
                System.out.println(e.getClass());
            }
        } while (!valid);

        do {
            System.out.println("Tirate otro número:");

            nString2= leer.nextLine();

            try {
                numInt2 = Integer.parseInt(nString2);
                valid=true;
            } catch (NumberFormatException e){
                System.out.println("Eso no es un número");
                System.out.println(e.getClass());
                valid=false;
            }
        } while (!valid);

        try{
            double division=DN.dividirNumeros(numInt1,numInt2);
        System.out.println("La división da "+division);

        } catch(ArithmeticException e){
            System.out.println("No se puede dividir por cero, amigu.");
            System.out.println(e.getClass());
        }
    }
}