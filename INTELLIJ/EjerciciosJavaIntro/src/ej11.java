/*
EJERCICIO 11
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios.
a e i o u
@ # $ % *
Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
correspondiente. Utilice la estructura “según” para la transformación.

Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
 */


import java.util.Scanner;

/**
 *
 * @author andre
 */
public class ej11 {

    public static void main(String[] args){

        Scanner leer = new Scanner(System.in);

        String frase, fraseCod;

        System.out.println("Escriba una frase");

        frase = leer.nextLine();

        fraseCod = codificar(frase);

        System.out.println("");
        System.out.println(fraseCod);
        System.out.println("");
        System.out.println("ChauCha");

    }

    public static String codificar(String frase){
        String fraseCod="";

        int largo = frase.length();

        for (int i = 0; i < largo; i++){
        /*
        a e i o u
        @ # $ % *
        */
            switch (frase.charAt(i)){
                case 'a':
                    fraseCod += "@";
                    break;
                case 'e':
                    fraseCod += "#";
                    break;
                case 'i':
                    fraseCod += "$";
                    break;
                case 'o':
                    fraseCod += "%";
                    break;
                case 'u':
                    fraseCod += "*";
                    break;
                default:
                    fraseCod += frase.charAt(i);
                    break;
            }
        }
        return fraseCod;
    }
}
