import entidades.Dni;
import entidades.Persona;

import java.util.ArrayList;

// Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
//objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
//acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.
public class Main {
    public static void main(String[] args) {
        Persona persona=new Persona();
        
        persona.setNombre("Andres");
        persona.setApellido("Lasarte");

        Dni dni=new Dni("abcd",20202203);

        persona.setDni(dni);

        System.out.println(persona.toString());


    }
}