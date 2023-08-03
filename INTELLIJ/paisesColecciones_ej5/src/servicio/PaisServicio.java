package servicio;
import entidades.Pais;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.HashSet;


public class PaisServicio {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    public static TreeSet<Pais> paises=new TreeSet();

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
                    valid=false;
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

//Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
//buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
//usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
//al usuario.
    public void eliminarPais(String pais) {
        Iterator<Pais> iterator = paises.iterator();
        int aux=0;
        while (iterator.hasNext()) {
            Pais paisAux = iterator.next();
            if (paisAux.getPais().equalsIgnoreCase(pais)){
                iterator.remove();
                aux++;
            }
        }
        if (aux==0){
            System.out.println("Ese país no existe.");
        }
    }
}
