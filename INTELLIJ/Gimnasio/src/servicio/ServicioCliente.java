package servicio;

import entidades.Cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class ServicioCliente {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    ArrayList <Cliente> clientes;
    //registrarCliente: lo registra en el sistema.
    public void registrarCliente() {
        Cliente cliente=new Cliente();
        System.out.println("*** Cargando Cliente ***");
        System.out.println("Ingrese el número de cédula");
        cliente.setId(leer.nextInt());
        System.out.println("Ingrese el nombre del nuevo cliente");
        cliente.setNombre(leer.next());
        System.out.println("Ingrese la edad del susodicho");
        cliente.setEdad(leer.nextInt());
        System.out.println("Ingrese la altura, de verdad, del cliente");
        cliente.setAltura(leer.nextDouble());
        System.out.println("Decime el peso, también de verdad, del cliente");
        cliente.setPeso(leer.nextDouble());
        System.out.println("Ingrese el objetivo del cliente");
        cliente.setObjetivo(leer.next());

        System.out.println("--- Cliente Cargado ---");
        clientes.add(cliente);
    }
    public ServicioCliente() {
        clientes = new ArrayList<>();
    }

    //obtenerClientes(): devuelve una lista con todos los clientes registrados en el sistema.
    public ArrayList <Cliente> obtenerCliente(){
        return clientes;
    }
    //actualizarCliente(int id, String nombre, int edad, double altura, double peso, String objetivo): recibe el identificador
    //de un cliente existente y los nuevos datos del cliente, y actualiza la información correspondiente en el sistema.
    public void actualizarCliente(int id, String nombre, int edad, double altura, double peso, String objetivo){
        boolean existe=false;

        for (Cliente cliente:clientes) {
            if (cliente.getId()==id){
                cliente.setNombre(nombre);
                cliente.setEdad(edad);
                cliente.setAltura(altura);
                cliente.setPeso(peso);
                cliente.setObjetivo(objetivo);
                existe=true;
                break;
            }
        }
        if (!existe){
            System.out.println("No hay tal cliente, amigu");
        }
    }
    //eliminarCliente(int id): recibe el identificador de un cliente existente y lo elimina del sistema.
    public void eliminarCliente(int id){
        clientes.removeIf(cliente -> cliente.getId() == id);
        System.out.println("--- Cliente removido ---");
        /*
        boolean existe=false;
        int aux=0;
        for (Cliente cliente:clientes) {

            if (cliente.getId()==id){
                clientes.remove(aux)
                existe=true;
                break;
            }
            aux++;
        }
        if (!existe){
            System.out.println("El cliente ya no existía antes de que lo quieras sacar");
        }
        */
    }

}
