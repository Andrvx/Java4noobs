import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
//1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
//programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
//después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
//salir, se mostrará todos los perros guardados en el ArrayList.

public class Main {
    public static void main(String[] args) {
        System.out.println("*** Programa que lee y guarda razas de perros ***");

        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> listaRazas=new ArrayList<>();

        boolean salir=false;
        String razaAux;
        String opcion;
        boolean valid;

        do {
            System.out.println("Ingrese una raza de perro:");

                razaAux= leer.next();
                listaRazas.add(razaAux);

                valid=false;
                do {
                    System.out.println("Desea agregar otra raza? (s/n)");
                    opcion = leer.next();

                    if (opcion.equalsIgnoreCase("n")) {
                        salir = true;
                        valid = true;
                    } else if (!opcion.equalsIgnoreCase("s")) {
                        System.out.println("No te entiendo");
                    } else {
                        valid=true;
                    }
                } while (!valid);
        } while (!salir);

        System.out.println("Lista de razas ingresadas:");
        for (int i = 0; i < listaRazas.size(); i++) {
            System.out.println((i+1)+"- "+listaRazas.get(i));
        }

        /* probando for each
        int i = 1;
        for (String aux: listaRazas){
            System.out.print(+"i++ - ");
            System.out.println(aux);
        }
         */

        /* probando .remove(object)
        listaRazas.remove("saltazanja");

        System.out.println("Lista de razas ingresadas:");
        for (int i = 0; i < listaRazas.size(); i++) {
            System.out.println((i+1)+"- "+listaRazas.get(i));
        }
         */

//2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
//un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
//está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
//ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
//la lista ordenada.

        System.out.println("Decime ina raza para borrar");
        String razaBorrar= leer.next();

        Iterator<String> it= listaRazas.iterator();

        boolean existe=false;
        while (it.hasNext()){
            String aux= it.next();

            if (aux.equals(razaBorrar)){
                it.remove();
                System.out.println("Raza removida");
                existe=true;
                break;
            }
        }
        if (!existe){
            System.out.println("La raza no existe");
        }
        System.out.println("Lista de razas ingresadas:");
        for (int i = 0; i < listaRazas.size(); i++) {
            System.out.println((i+1)+"- "+listaRazas.get(i));
        }

            System.out.println("");
            System.out.println("Terminó.");
    }

}