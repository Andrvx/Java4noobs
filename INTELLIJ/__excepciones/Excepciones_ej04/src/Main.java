import java.util.InputMismatchException;
import java.util.Scanner;

// Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
//causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
//no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
//número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
//utilizando bloques try/catch para las distintas excepciones
public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        try {
            System.out.println("Dame un número");
            int num1 = leer.nextInt();

            leer.nextLine();

            System.out.println("Dame otro");
            String num2String = leer.nextLine();

            int num2=Integer.parseInt(num2String);

            int division= num1/num2;


        } catch (InputMismatchException e){
            System.out.println("El número era una letra jejej");
            System.out.println(e.getClass());
        } catch (ArithmeticException e){
            System.out.println("Uyyy, no se puede dividir por cero, papu");
            System.out.println(e.getClass());
        } catch (NumberFormatException e){
            System.out.println("El segundo número resultó ser una letra, mirá vos");
            System.out.println(e.getClass());
        }
    }
}