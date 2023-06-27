//8. Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
//String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
//una frase que puede ser una palabra o varias palabras separadas por un espacio en
//blanco y a través de los métodos set, se guardará la frase y la longitud de manera
//automática según la longitud de la frase ingresada. Deberá además implementar los
//siguientes métodos:

import entidades.Cadena;
import service.ServiceCadena;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        ServiceCadena SC=new ServiceCadena();
        Cadena cadena=new Cadena();

        System.out.println("*** Programa de la Cadena ***");
        System.out.println("Tirate una frase. Cortita, no te zarpes.");
        cadena.setFrase(leer.nextLine());
        cadena.setLongitud(cadena.getFrase().length());

        boolean salir=false;
        String letraRepe;
        int cantRepe;
        String fraseCompa;
        String fraseUnida;
        String letraReemp;
        String letraBusca;

        do {
            System.out.println("");
            System.out.println("--- Menú de opciones ---");
            System.out.println("1 - Mostrar vocales");
            System.out.println("2 - Invertir frase");
            System.out.println("3 - Veces Repetido");
            System.out.println("4 - Comparar longitud");
            System.out.println("5 - Unir frases");
            System.out.println("6 - Reemplazar");
            System.out.println("7 - Contiene");
            System.out.println("8 - Salir");
            System.out.println("");

            int opcion= leer.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("La frase tiene "+SC.mostrarVocales(cadena)+" vocales.");
                    System.out.println("");
                    break;
                case 2:
                    SC.invertirFrase(cadena);
                    break;
                case 3:
                    System.out.println("Qué letra querés buscar?");
                    letraRepe=leer.next();
                    cantRepe=SC.vecesRepetido(cadena,letraRepe);
                    System.out.println("La letra "+letraRepe+" se repite "+cantRepe+" veces.");
                    break;
                case 4:
                    System.out.println("Decime una frase para ver cuál es más largota.");
                    fraseCompa=leer.next();
                    SC.compararLongitud(cadena,fraseCompa);
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("Decime una frase para unir a la otra");
                    fraseUnida=leer.next();
                    SC.unirFrases(cadena,fraseUnida);
                    break;
                case 6:
                    System.out.println("Decime una letra con la que quieras reemplaza las A.");
                    letraReemp=leer.next();
                    SC.reemplazar(cadena,letraReemp);
                    break;
                case 7:
                    System.out.println("Qué letra querés buscar?");
                    letraBusca=leer.next();
                    if (SC.contiene(cadena,letraBusca)){
                        System.out.println("La "+letraBusca+" está en la frase!");
                    } else {
                        System.out.println("La "+letraBusca+" NO está en la frase!");
                    }
                    break;
                case 8:
                    System.out.println("Ok. Saliendo");
                    salir=true;
                    break;
                default:
                    System.out.println("Opción inválida. Lee mejor y probá de nuevo.");
            }
        } while (!salir);
    }
}