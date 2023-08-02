package servicio;
import entidades.Pais;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PaisServicio {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    Set<Pais> paises=new HashSet<>();

    public void agregarPaises(){
        System.out.println("*** Agregar Paises ***");
        boolean salir=false;
        boolean valid=false;
        do {
            System.out.println("Agregá un pais");
            String paisAux= leer.next();
            leer.nextLine();
            paises.add(new Pais(paisAux));

            do {
                System.out.println("Querés agregar otro?(s/n)");
                String opcion = leer.next();
                leer.nextLine();
                if (opcion.equalsIgnoreCase("n")){
                    System.out.println("Ok, bye.");
                    valid=true;
                    salir=true;
                } else if (!(opcion.equalsIgnoreCase("s"))) {
                    System.out.println("Opción invaaalida!");
                } else {
                    System.out.println("Ok.");
                    valid=true;
                }
            } while (!valid);
        } while (!salir);
    }
    public void mostrarSetPaises(){
        for (Pais pais: paises) System.out.println(pais.toString());
    }
//Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
//cómo se ordena un conjunto.
//Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
//buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
//usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
//al usuario.
}
