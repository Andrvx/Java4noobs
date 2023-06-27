package service;

import entidades.Cadena;

import java.util.Scanner;

import static java.lang.Math.abs;

public class ServiceCadena {
    //a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
    //frase ingresada.
    public int mostrarVocales(Cadena cadena){
        int contador=0;

        for (int i=0;i<cadena.getLongitud();i++){
            if (String.valueOf(cadena.getFrase().charAt(i)).equalsIgnoreCase("A")||String.valueOf(cadena.getFrase().charAt(i)).equalsIgnoreCase("E")
            ||String.valueOf(cadena.getFrase().charAt(i)).equalsIgnoreCase("I")||String.valueOf(cadena.getFrase().charAt(i)).equalsIgnoreCase("O")
            ||String.valueOf(cadena.getFrase().charAt(i)).equalsIgnoreCase("U")){
                contador++;
            }
        }
        return contador;
    }
    //b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
    //ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
    public void invertirFrase(Cadena cadena){
        System.out.println("*** Invertir frase ***");
        System.out.println("- La frase: "+cadena.getFrase());

        System.out.print("- La frase invertida: ");
        for (int i = (cadena.getLongitud()-1); i > (-1); i--){
            System.out.print(cadena.getFrase().charAt(i));
            //System.out.println(i);
        }
        System.out.println("");
    }
    //c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
    //contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
    //Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
    public int vecesRepetido(Cadena cadena,String letra){
        int contador=0;

        for (int i=0;i<cadena.getLongitud();i++){
            if (String.valueOf(cadena.getFrase().charAt(i)).equalsIgnoreCase(letra)){
                contador++;
            }
        }
        return contador;
    }
    //e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
    //compone la clase con otra nueva frase ingresada por el usuario.
    public void compararLongitud(Cadena cadena,String fraseNueva){
        int difLong= cadena.getLongitud()-fraseNueva.length();

        if (difLong<0){
            System.out.println("La nueva frase es "+abs(difLong)+" caracteres más larga.");
        } else if (difLong==0){
            System.out.println("La nueva frase tiene la misma cantidad de caracteres.");
        } else {
            System.out.println("La nueva frase es "+difLong+" caracteres más corta.");
        }
    }
    //f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
    //con una nueva frase ingresada por el usuario y mostrar la frase resultante.
    public void unirFrases(Cadena cadena,String fraseNueva){
        System.out.println("*** Concatenando las frases brrrr ***");
        System.out.println(cadena.getFrase().concat(" ").concat(fraseNueva));
        System.out.println("");
    }
    //g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
    //encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
    //la frase resultante.
    public void reemplazar(Cadena cadena,String letra){
        System.out.println("*** Reemplazando la A ***");
        String aux=cadena.getFrase().replace("A",letra);
        aux=aux.replace("a",letra);
        System.out.println(aux);
        System.out.println("");
    }
    //h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
    //ingresa el usuario y devuelve verdadero si la contiene y falso si no.

    public boolean contiene(Cadena cadena,String letra){
        return cadena.getFrase().contains(letra);
    }
}
