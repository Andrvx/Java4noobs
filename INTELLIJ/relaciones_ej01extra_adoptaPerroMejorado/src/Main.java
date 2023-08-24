// 1. Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
//clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
//atributos: nombre, apellido, edad, documento y Perro.
//Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
//pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
//la clase Persona, la información del Perro y de la Persona.

import java.util.ArrayList;
import java.util.Collections;
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
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        ArrayList<Persona> personaLista = new ArrayList<>();
        ArrayList<Perro> perroLista = new ArrayList<>();

        Persona persona1 = new Persona("Iván", "Rakitic", 35, 54545454, null);
        Persona persona2 = new Persona("Coso", "Fuyutsuki", 60, 4545111, null);
        Persona persona3 = new Persona("Koji", "Kabuto", 16, 46123456, null);
        personaLista.add(persona1);
        personaLista.add(persona2);
        personaLista.add(persona3);

        Perro perro1 = new Perro("Batuque", 5, "Mediano");
        Perro perro2 = new Perro("Buscapié", 1, "Chico");
        Perro perro3 = new Perro("Cosito", 9, "Chico");
        perroLista.add(perro1);
        perroLista.add(perro2);
        perroLista.add(perro3);

        for (Persona persona : personaLista) {
            System.out.println(persona);
        }
        for (Perro perro : perroLista) {
            System.out.println(perro);
        }

        boolean exit=false;
        boolean valid1=false;
        boolean valid2=false;
        int i;
        do {
            System.out.println("*** Asigando perros a dueños ***");
            Perro perroAux=new Perro();
            Persona duenioAux=new Persona();
            do {
                System.out.println("Elegí un perro para adoptar");
                String perroNombre=leer.nextLine();

                for (Perro perro: perroLista){
                    if (perro.getNombre().equalsIgnoreCase(perroNombre)){
                        valid1=true;
                        if (perro.getDuenio()==null){
                            valid2=true;
                            perroAux=perro;
                        }
                    }
                }
                if ((!valid2)||(!valid1)){
                    System.out.println("El perro no existe o está adoptado");
                }
            } while ((!valid2)||(!valid1));

            do {
                System.out.println("Elegí un dueño para el perro");
                String duenioNombre=leer.nextLine();

                for (Persona duenio: personaLista){
                    if (duenio.getNombre().equalsIgnoreCase(duenioNombre)){
                        valid1=true;
                        if (duenio.getPerro()==null){
                            valid2=true;
                            duenioAux=duenio;
                        }
                    }
                }
                if ((!valid2)||(!valid1)){
                    System.out.println("Esa persona no existe o ya tiene perro.");
                }
            } while ((!valid2)||(!valid1));

                    


            System.out.println("Querés asignar otro?(S/N)");
            String opc= leer.nextLine();
            if (opc.equalsIgnoreCase("s")){
                exit=false;
            } else {
                exit=true;
            }

        } while (!exit);

    }
}