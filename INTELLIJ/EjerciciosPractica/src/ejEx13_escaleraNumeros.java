import java.util.Scanner;

/*
13. Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
 */
public class ejEx13_escaleraNumeros {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        System.out.println("Te dibujo una escalera, cuántos escalones querés?");
        int num= leer.nextInt();

        System.out.println("Ahí va!");

        for (int i=1;i<(num+1);i++){
            for (int j=0;j<i;j++){
                System.out.print((j+1));
            }
            System.out.println("");
        }
    }
}
