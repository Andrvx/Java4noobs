package service;

import entidades.Persona;

import java.util.Date;
import java.util.Scanner;

public class ServicePersona {
    // Agregar un método de creación del objeto que respete la siguiente firma:
    //crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
    //usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
    //fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
    public void crearPersona(Persona persona){
        Scanner leer=new Scanner(System.in);

        int dia,mes,anio;
        Date fechaNac=new Date();

        System.out.println("*** Crear Persona ***");
        System.out.println("- Ingrese el nombre de la persona");
        persona.setNombre(leer.next());

        System.out.println("- Ingresá los dos dígitos del día de nacimiento");
        dia=leer.nextInt();

        System.out.println("Ingresá los dos dígitos del mes de nacimiento");
        mes=leer.nextInt();
        mes-=1;

        System.out.println("Ingresá los cuatro dígitos del año de nacimiento");
        anio=leer.nextInt();
        anio-=1900;

        fechaNac.setDate(dia);
        fechaNac.setMonth(mes);
        fechaNac.setYear(anio);

        persona.setFechaNac(fechaNac);

        System.out.println("*** Persona Creada ***");
    }
    // Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
    //en cuenta que para conocer la edad de la persona también se debe conocer la fecha
    //actual.
    public int calcularEdad(Persona persona){
        Date fechaActual=new Date();
        Date cumpleanios=new Date(fechaActual.getYear(),persona.getFechaNac().getMonth(),persona.getFechaNac().getDate());

        int edad;

        if (cumpleanios.after(fechaActual)){
            edad=(fechaActual.getYear()-persona.getFechaNac().getYear()-1);
        } else {
            edad=(fechaActual.getYear()-persona.getFechaNac().getYear());
        }

        return edad;
    }
    // Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
    //edad y retorna true en caso de que el receptor tenga menor edad que la persona que
    //se recibe como parámetro, o false en caso contrario.
    public boolean menorQue(int edad,Persona persona){
        return (calcularEdad(persona)>edad);
    }
    // Metodo mostrarPersona(): este método muestra la persona creada en el método anterior.
    public void mostrarPersona(Persona persona){
        System.out.println("*** Mostrando Persona ***");
        System.out.println("Nombre: "+persona.getNombre());
        System.out.println("Fecha de nacimiento: "+persona.getFechaNac().getDate()+" / "+persona.getFechaNac().getMonth()+" / "+persona.getFechaNac().getYear());
        System.out.println("Edad: "+calcularEdad(persona));
    }
}
