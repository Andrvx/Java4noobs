import java.util.Scanner;

/*
3. Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase
String.
 */
public class ejEx03_detecVocal {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Hola, soy tu detector de vocales, decime una letra y me fijo si es, dale?");
        String letra = leer.next();

        //validando una sola letra para no armar lío
        while (((letra.length()) > 1) || (letra.equals("0")) || (letra.equals("1")) || (letra.equals("2")) || (letra.equals("3")) || (letra.equals("4")) || (letra.equals("5")) || (letra.equals("6")) || (letra.equals("7")) || (letra.equals("8")) || (letra.equals("9"))) {
            if ((letra.length()) > 1) {
                System.out.println("JaJa! Eso es más de una letra salamín! Probá de nuevo!");
                letra = leer.next();
            } else {
                System.out.println("JaJa! Eso es un número, qué chanza! Probá de nuevo!");
                letra = leer.next();
            }
        }

        /*
        while ((letra.equals("0"))||(letra.equals("1"))||(letra.equals("2"))||(letra.equals("3"))||(letra.equals("4"))||(letra.equals("5"))||(letra.equals("6"))||(letra.equals("7"))||(letra.equals("8"))||(letra.equals("9"))){
            System.out.println("JaJa! Eso es un número, qué chanza! Probá de nuevo!");
            letra= leer.next();
        }
        */
            //comprobando vocal
            switch (letra) {
                case ("A"):
                case ("a"):
                    System.out.println(">A< es la primera vocal del diccionario.");
                    break;
                case ("E"):
                case ("e"):
                    System.out.println(">E< es la segunda vocal del diccionario.");
                    break;
                case ("I"):
                case ("i"):
                    System.out.println(">I< es la tercera vocal del diccionario.");
                    break;
                case ("O"):
                case ("o"):
                    System.out.println(">O< es la cuarta vocal del diccionario.");
                    break;
                case ("U"):
                case ("u"):
                    System.out.println(">U< es la quinta vocal del diccionario.");
                    break;
                default:
                    System.out.println(letra + " es una consonante.");
            }
            System.out.println("Powered by Microsoft. Pagá Windows, rata.");

    }
}
