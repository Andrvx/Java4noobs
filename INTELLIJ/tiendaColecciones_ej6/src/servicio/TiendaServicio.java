package servicio;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

//Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
//productos que venderemos y el precio que tendrán. Además, se necesita que la
//aplicación cuente con las funciones básicas.
//Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
//eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
//Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
//Realizar un menú para lograr todas las acciones previamente mencionadas.
public class TiendaServicio {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    public static HashMap<String,Integer>productos=new HashMap<>();
//Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
//eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
//Hashmap)

    public void menuTienda(){
        boolean salir=false;
        //boolean valid=false;

            do {
                System.out.println("      *** MENU ***");
                System.out.println("      1 - Agregar un producto");
                System.out.println("      2 - Modificar precio de un producto");
                System.out.println("      3 - Eliminar un producto");
                System.out.println("      4 - Mostrar todos los productos");
                System.out.println("      5 - Salir");
                System.out.println("");
                System.out.print("Ingrese una opción:");
                String opcion= leer.next();
                leer.nextLine();
                switch (opcion){
                    case "1":
                        agregarProducto();
                        break;
                    case "2":
                        modificarPrecio();
                        break;
                    case "3":
                        eliminarProducto();
                        break;
                    case "4":
                        mostrarListaProductos();
                        break;
                    case "5":
                        System.out.println("Ok, si te querés ir, andate.");
                        //valid=true;
                        salir=true;
                        break;
                    default:
                        System.out.println("Opción inválida!");
                }
            } while (!salir);
    }

    public void agregarProducto(){
        System.out.println("--- Agregar Producto ---");
        System.out.println("Ingrese el nombre del producto:");
        String nombre= leer.next();
        leer.nextLine();
        System.out.println("Ingrese el precio:");
        double precioDouble= leer.nextDouble();

        Integer precio=(int) (precioDouble*100);

        productos.put(nombre,precio);
    }

    public void modificarPrecio(){
        System.out.println("--- Modificar Precio ---");
        System.out.println("Ingrese el nombre del producto:");
        String nombre= leer.next();
        leer.nextLine();

        if (productos.containsKey(nombre)){
            System.out.println("Ingrese el nuevo precio:");
            double precioDouble= leer.nextDouble();

            Integer precio=(int) (precioDouble*100);

            productos.put(nombre,precio);

            System.out.println("--- Precio modificado ---");
        } else {
            System.out.println("-Producto inexistente.");
        }
    }

    public void eliminarProducto(){
        System.out.println("--- Eliminar Producto ---");
        System.out.println("Ingrese el nombre del producto:");
        String nombre= leer.next();
        leer.nextLine();

        if (productos.containsKey(nombre)){

            productos.remove(nombre);

            System.out.println("--- Producto eliminado ---");
        } else {
            System.out.println("-Producto inexistente.");
        }
    }

    public void mostrarListaProductos(){
        System.out.println("--- Lista de Productos ---");

        for (Map.Entry<String,Integer> auxProd : productos.entrySet()){
            int i=1;
            double precioDouble= ((double) auxProd.getValue())/100;
            System.out.println(i+"- Producto: "+auxProd.getKey()+" | Precio: $"+precioDouble);
            i++;
        }
    }

}
