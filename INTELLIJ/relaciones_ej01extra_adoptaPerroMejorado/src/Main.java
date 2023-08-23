// 1. Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
//clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
//atributos: nombre, apellido, edad, documento y Perro.
//Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
//pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
//la clase Persona, la información del Perro y de la Persona.

import java.util.ArrayList;
import java.util.Scanner;
import entidades.Perro;
import entidades.Persona;

// 1. Ahora se debe realizar unas mejoras al ejercicio de Perro y Persona. Nuestro programa va a
//tener que contar con muchas personas y muchos perros. El programa deberá preguntarle a
//cada persona, que perro según su nombre, quiere adoptar. Dos personas no pueden adoptar
//al mismo perro, si la persona eligió un perro que ya estaba adoptado, se le debe informar a la
//persona.
//Una vez que la Persona elige el Perro se le asigna, al final deberemos mostrar todas las
//personas con sus respectivos perros.

public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in).useDelimiter("\n");

        ArrayList<Persona> personaLista=new ArrayList<>();
        ArrayList<Perro> perroLista=new ArrayList<>();

        Persona persona1=new Persona("Iván","Rakitic",35,54545454,null);
        Persona persona2=new Persona("Coso","Fuyutsuki",60,4545111,null);
        Persona persona3=new Persona("Koji","Kabuto",16,46123456,null);
        personaLista.add(persona1);
        personaLista.add(persona2);
        personaLista.add(persona3);

        Perro perro1=new Perro("Batuque",5,"Mediano");
        Perro perro2=new Perro("Buscapié",1,"Chico");
        Perro perro3=new Perro("Cosito",9,"Chico");
        perroLista.add(perro1);
        perroLista.add(perro2);
        perroLista.add(perro3);

        for (Persona persona: personaLista){
            System.out.println(persona);
        }
        for (Perro perro: perroLista){
            System.out.println(perro);
        }

        System.out.println("Asignando perros a personas");
        System.out.println("Qué perro querés asignar?");
        String nombreAux= leer.nextLine();
        for (Perro perro: perroLista){
            if (perro.getNombre().equalsIgnoreCase(nombreAux)) {
                System.out.println("Perro encontrado");
            } if (perro.getDuenio()==null){
                System.out.println("El perro no está adoptado, qué dueño querés que tenga?");
                String duenioAux= leer.nextLine();
                for (Persona persona: personaLista){
                    if (persona.getNombre().equalsIgnoreCase())
                }
            }
        }
    }
}