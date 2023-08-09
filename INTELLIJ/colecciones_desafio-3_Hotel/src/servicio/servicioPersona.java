package servicio;
import entidades.Persona;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class servicioPersona {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    ArrayList <Persona> listaPersonas=new ArrayList<>();
    public void crearPersona (){
        System.out.println("*** Crear Persona ***");
        System.out.println("Ingrese el nombre");
        String auxNombre= leer.next();
        leer.nextLine();
        System.out.println("Ingrese la edad");
        int auxEdad= leer.nextInt();
        System.out.println("Ingrese el DNI");
        int auxDni= leer.nextInt();
        System.out.println("Ingrese el País");
        String auxPais= leer.next();
        leer.nextLine();

        Persona auxPersona=new Persona();
        auxPersona.setNombre(auxNombre);
        auxPersona.setEdad(auxEdad);
        auxPersona.setDni(auxDni);
        auxPersona.setPais(auxPais);

        System.out.println("*** Persona Cargada ***");
    }

    public void borrarPersona(){
        System.out.println("*** Borrar Persona ***");
        System.out.println("Ingrese el dni");
        int auxDni= leer.nextInt();

        Iterator <Persona> buscadorIt= listaPersonas.iterator();

        while (buscadorIt.hasNext()){
            if (buscadorIt.next().getDni()==auxDni){
                buscadorIt.remove();
            }
        }
        System.out.println("*** Persona Borrada ***");
    }

    public void actualizarPersona(){
        System.out.println("*** Actualizar Persona ***");
        System.out.println("Ingrese el dni");
        int auxDni= leer.nextInt();
        System.out.println("Ingrese el nombre actualizado");
        String auxNombre= leer.next();
        leer.nextLine();
        System.out.println("Ingrese la edad");
        int auxEdad= leer.nextInt();
        System.out.println("Ingrese el País");
        String auxPais= leer.next();
        leer.nextLine();

        Iterator <Persona> buscadorIt= listaPersonas.iterator();

        while (buscadorIt.hasNext()){
            if (buscadorIt.next().getDni()==auxDni){
                buscadorIt.next().setPais(auxPais);
                buscadorIt.next().setEdad(auxEdad);
                buscadorIt.next().setNombre(auxNombre);
            }
        }
        System.out.println("*** Persona Actualizada ***");
    }

    public void mostrarPersona(){
        System.out.println("*** Mostrar Persona ***");
        System.out.println("Ingrese el dni");
        int auxDni= leer.nextInt();

        Iterator <Persona> buscadorIt= listaPersonas.iterator();

        while (buscadorIt.hasNext()){
            if (buscadorIt.next().getDni()==auxDni){
                buscadorIt.toString();
            }
        }
        System.out.println("*** ***");
    }
}
