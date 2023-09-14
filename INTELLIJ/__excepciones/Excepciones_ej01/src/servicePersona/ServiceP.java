// Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
//devuelve un booleano.
package servicePersona;

import entidades.Persona;

import java.util.Scanner;

public class ServiceP {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    // Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
    //al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
    //Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
    //O. Si no es correcto se deberá mostrar un mensaje
    public Persona CrearPersona(){
        System.out.println("-- Crear Persona --");
        Persona persona=new Persona();

        System.out.println("Ingrese el nombre de la persona");
        persona.setNombre(leer.next());

        System.out.println("Ingrese la edad");
        persona.setEdad(leer.nextInt());

        boolean valid=false;
        do {
            System.out.println("Ingrese el sexo (H/M/O)");
            String sexo=leer.next();
            sexo=sexo.toUpperCase();
            if (sexo.equalsIgnoreCase("H")||sexo.equalsIgnoreCase("M")||sexo.equalsIgnoreCase("O")){
                switch (sexo){
                    case "H":
                        persona.setSexo("Hombre");
                        break;
                    case "M":
                        persona.setSexo("Mujer");
                        break;
                    case "O":
                        persona.setSexo("Otro");
                        break;
                }
                valid=true;
            } else {
                System.out.println("Opción inválida");
            }
        } while (!valid);

        System.out.println("Ingrese el peso");
        persona.setPeso(leer.nextInt());

        System.out.println("Ingrese la altura en metros");
        persona.setAltura(leer.nextDouble());

        System.out.println("**** Persona cargada ****");
        return persona;
    }
    // Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
//kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
//significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
//Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
//persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
//de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
//función devuelve un 1.
    public int CalcularIMC(Persona persona){
        int aux;
        int imc=(int)(((double)(persona.getPeso()))/(persona.getAltura()* persona.getAltura()));

        if (imc<20){
            aux=-1;
        } else if (imc>=20 && imc<=25) {
            aux=0;
        } else
            aux=1;

        return aux;
    }
    // Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
    //devuelve un booleano.
    public boolean EsMayorDeEdad(Persona persona){
        if (persona.getEdad()>=18){
            return true;
        } else {
            return false;
        }
    }
}
