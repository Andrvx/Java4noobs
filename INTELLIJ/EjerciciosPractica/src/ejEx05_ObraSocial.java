import java.util.Scanner;

/*
5. Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento
para los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio
 */
public class ejEx05_ObraSocial {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);

        System.out.println("***Obra Social Los Hijos de Puta***");
        System.out.println("");
        System.out.println("Indique el tipo de socio (A/B/C):");
        String socio= leer.next();
        //validación
        while ((!(socio.equals("A")))&&(!(socio.equals("B")))&&(!(socio.equals("C")))&&(!(socio.equals("a")))&&(!(socio.equals("b")))&&(!(socio.equals("c"))))
        {
            System.out.println("Cualquiera mandaste, probá de nuevo (A/B/C):");
            socio= leer.next();
        }

        System.out.println("Decime el valor de tratamiento:");
        int precio= leer.nextInt();

        switch (socio){
            case ("A"):
            case ("a"):
                System.out.println("El Socio debe pagar $ "+(precio*0.5)+".");
                break;
            case ("B"):
            case ("b"):
                System.out.println("El Socio debe pagar $ "+(precio*0.65)+".");
                break;
            case ("C"):
            case ("c"):
                System.out.println("El Socio es pobre, así que no tiene descuentos, lógico. Debe pagar $ "+precio+".");
                break;
        }
        System.out.println("");
        System.out.println("Nos vemos");
        System.out.println("");
    }
}
