import entidades.Cliente;
import entidades.Rutina;
import servicio.ServicioCliente;
import servicio.ServicioRutina;

import java.util.Scanner;

//En el método principal (main):
public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        ServicioRutina SR=new ServicioRutina();
        ServicioCliente SC=new ServicioCliente();
        Rutina rutinaAux=new Rutina();

        for (int i=0;i<5;i++){
            System.out.println("Creando cliente "+i+1);
            SC.registrarCliente();
        }
        for (int i=0;i<5;i++){
            System.out.println("Creando rutina "+i+1);
            System.out.println("Ingrese el ID de la rutina");
            rutinaAux.setId(leer.nextInt());
            System.out.println("Ingrese el nombre de la rutina");
            rutinaAux.setNombre(leer.next());
            System.out.println("Ingrese la duración");
            rutinaAux.setDuracion(leer.nextInt());
            System.out.println("Qué nivel de dificultad tiene");
            rutinaAux.setNivelDeDificultad(leer.next());
            System.out.println("Ingrese una breve descripción de lo que se trata esta bendita rutina");
            rutinaAux.setDescripcion(leer.next());

            SR.crearRutina(rutinaAux);
        }
        System.out.println(SC.obtenerCliente().toString());
        System.out.println(SR.obtenerRutinas().toString());

        System.out.println("Actualicemos un cliente, porque sí");
        System.out.println("Decime el id del cliente a actualizar");
        int idAux= leer.nextInt();
        System.out.println("Decime el nombre actualizado");
        String nombreAux= leer.next();
        System.out.println("Actualizá la edad");
        int edadAux= leer.nextInt();
        System.out.println("Creció o se achicó?");
        double alturaAux= leer.nextDouble();
        System.out.println("Decime el nuevo peso");
        double pesoAux= leer.nextDouble();
        System.out.println("Acrualizá el objetivo");
        String objetivoAux= leer.next();

        SC.actualizarCliente(idAux,nombreAux,edadAux,alturaAux,pesoAux,objetivoAux);

        System.out.println(SC.obtenerCliente().toString());

        System.out.println("Actualicemos una rutina");
        System.out.println("Decime el id de la rutina a actualizar");
        int idRutAux= leer.nextInt();
        System.out.println("Decime el nombre actualizado");
        String nombreRutAux= leer.next();
        System.out.println("Actualizá la duración");
        int duracionAux= leer.nextInt();
        System.out.println("Actualizá el nivel de dificultad");
        String nivelAux= leer.next();
        System.out.println("Actualizá la descripción");
        String descripcionAux= leer.next();

        SR.actualizarRutina(idRutAux,nombreRutAux,duracionAux,nivelAux,descripcionAux);

        System.out.println(SR.obtenerRutinas().toString());

        System.out.println("Decime el ID del abandonador");
        idAux= leer.nextInt();

        SC.eliminarCliente(idAux);
        System.out.println("Lista de clientes actualizada");
        System.out.println(SC.obtenerCliente().toString());

        System.out.println("Decime el ID de la rutina a borrar");
        idRutAux= leer.nextInt();

        SR.eliminarRutina(idRutAux);
        System.out.println("Lista de rutinas actualizada");
        System.out.println(SR.obtenerRutinas().toString());
    }

}