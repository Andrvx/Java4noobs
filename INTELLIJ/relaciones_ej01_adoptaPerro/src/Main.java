import entidades.Perro;
import entidades.Persona;

import java.util.Scanner;

// 1. Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
//clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
//atributos: nombre, apellido, edad, documento y Perro.
//Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
//pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
//la clase Persona, la información del Perro y de la Persona.
public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in).useDelimiter("\n");

        Persona persona1=new Persona();
        Persona persona2=new Persona();

        persona1.setNombre("Fideo");
        persona1.setApellido("DiMaría");
        persona1.setDocumento(30404505);
        persona1.setEdad(35);

        persona2.setNombre("Lautaro");
        persona2.setApellido("Martínez");
        persona2.setEdad(27);
        persona2.setDocumento(40505696);

        Perro perro1=new Perro();
        Perro perro2=new Perro();

        perro1.setNombre("Chiquito");
        perro1.setRaza("Perro");
        perro1.setEdad(5);
        perro1.setTamanio("Chico");

        perro2.setNombre("Batuque");
        perro2.setRaza("Saltazanja");
        perro2.setEdad(4);
        perro2.setTamanio("Mediano");

        System.out.println("Persona 1:"+persona1.toString());
        System.out.println("Persona 2:"+persona2.toString());
        System.out.println("Perro1:"+perro1.toString());
        System.out.println("Perro2:"+perro2.toString());
        System.out.println("****");
        System.out.println("Qué perro querés para "+persona1.getNombre()+" "+persona1.getApellido()+"? (1 o 2)");
        int opcion= leer.nextInt();
        if (opcion==1){
            persona1.setPerro(perro1);
            persona2.setPerro(perro2);
        } else if (opcion==2){
            persona1.setPerro(perro2);
            persona2.setPerro(perro1);
        } else {
            System.out.println("Mirá que era fácil, me enojé, chau.");
        }
        System.out.println("****");
        System.out.println("Quedaron así:");
        System.out.println("Persona 1:"+persona1.toString());
        System.out.println("Persona 2:"+persona2.toString());
        System.out.println("****");
    }
}