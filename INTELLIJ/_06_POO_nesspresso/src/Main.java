import entidades.Cafetera;
import service.CafeteraService;

import java.util.Scanner;

/*
6. Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual
 Métodos getters y setters.
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada
 */
public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Cafetera c1=new Cafetera();
        CafeteraService cserv=new CafeteraService();

        System.out.println("*** Programa Nespresso. Sin George Clooney. ***");
        System.out.println("");
        System.out.println("Qué capacidad tiene tu cafetera? (Al final era de filtro, nespresso mis polainas)");
        c1.setCapacidadMaxima(leer.nextDouble());

        System.out.println("");
        System.out.println("Ok, querés llenarla?");
        String aux=leer.next();

        if (aux.equals("S") || aux.equals("Si") || aux.equals("s") || aux.equals("si")){
            System.out.println("Ok.");
        } else {
            System.out.println("No me importa, la lleno igual");
        }

        cserv.LlenarCafetera(c1);
        System.out.println("");
        System.out.println(c1.toString());

        System.out.println("Te sirvo uno, querés?");
        String aux2=leer.next();

        if (aux2.equals("S") || aux2.equals("Si") || aux2.equals("s") || aux2.equals("si")){
            System.out.println("Ok.");
        } else {
            System.out.println("No me importa, te sirvo igual");
        }

        cserv.ServirTaza(c1);

        System.out.println("");
        System.out.println(c1.toString());

        System.out.println("Querés agregar café?");
        String aux3=leer.next();

        if (aux3.equals("S") || aux3.equals("Si") || aux3.equals("s") || aux3.equals("si")){
            System.out.println("Ok.");
        } else {
            System.out.println("No me importa, le agrego igual");
        }

        cserv.AgregarCafe(c1);

        System.out.println("");
        System.out.println(c1.toString());

        System.out.println("Esto que hicimos es una chanchada, mejor la vaciamos, te parece?");
        String aux4=leer.next();

        if (aux4.equalsIgnoreCase("S") || aux4.equalsIgnoreCase("SI") || aux4.equalsIgnoreCase("sí")){
            System.out.println("Ok.");
        } else {
            System.out.println("No me importa, lo tiro igual");
        }

        cserv.VaciarCafetera(c1);

        System.out.println("");
        System.out.println(c1.toString());

        System.out.println("");
        System.out.println("Me voy a tomar un té a otro lado, mejor, chau.");
    }
}