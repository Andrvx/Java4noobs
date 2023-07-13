package servicio;

import entidades.Cliente;
import entidades.Rutina;

import java.util.ArrayList;
import java.util.Scanner;

public class ServicioRutina {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    ArrayList<Rutina> rutinas;
    public ServicioRutina (){
        rutinas=new ArrayList<>();
    }
    //crearRutina(Rutina rutina): recibe un objeto de tipo Rutina y lo agrega al sistema.
    public void crearRutina(Rutina rutina) {
        rutinas.add(rutina);
    }
     //obtenerRutinas(): devuelve una lista con todas las rutinas registradas en el sistema.
    public ArrayList <Rutina>obtenerRutinas(){
        return rutinas;
    }
    //actualizarRutina(int id, String nombre, int duracion, String nivelDificultad, String descripcion): recibe el identificador
    //de una rutina existente y los nuevos datos de la rutina, y actualiza la información correspondiente en el sistema.
    public void actualizarRutina(int id, String nombre, int duracion, String nivelDeDificultad, String descripcion){
        boolean existe=false;

        for (Rutina rutina:rutinas) {
            if (rutina.getId()==id){
                rutina.setNombre(nombre);
                rutina.setDuracion(duracion);
                rutina.setNivelDeDificultad(nivelDeDificultad);
                rutina.setDescripcion(descripcion);
                existe=true;
                break;
            }
        }
        if (!existe){
            System.out.println("Esa rutina no existe!");
        }
    }
    //eliminarRutina(int id): recibe el identificador de una rutina existente y la elimina del sistema.
    public void eliminarRutina(int id){
        rutinas.removeIf(rutina -> rutina.getId() == id);
        System.out.println("--- Rutina removida ---");
        /*
        boolean existe=false;
        int aux=0;
        for (Rutina rutina:rutinas) {

            if (rutina.getId()==id){
                rutinas.remove(aux)
                existe=true;
                break;
            }
            aux++;
        }
        if (!existe){
            System.out.println("No existe esa rutina, fail.");
        }
        */
    }
}
