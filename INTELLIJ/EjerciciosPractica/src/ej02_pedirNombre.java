import java.util.Scanner;

public class ej02_pedirNombre {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);

        System.out.println("Decime tu nombre:");

        String nombre=leer.nextLine();
        System.out.println("");
        System.out.println("tu nombre es "+nombre+". Soy un crack.");
    }

}
