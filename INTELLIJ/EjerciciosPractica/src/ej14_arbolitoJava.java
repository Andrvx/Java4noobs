import java.util.Scanner;

/*
14. Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
public class ej14_arbolitoJava {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);
        System.out.println("Cambio Cambio!");
        System.out.println("");
        System.out.println("Ingresar el monto en €:");
        double monto=leer.nextDouble();
        System.out.println("A qué moneda lo convierto? (Libra/Yen/Dólar)");

        String moneda= leer.next();
        moneda=moneda.toLowerCase();

        while ((!moneda.equals("dolar")) && (!moneda.equals("dólar")) && (!moneda.equals("yen")) && (!moneda.equals("libra"))){
            System.out.println("");
            System.out.println("Solamente convierto a Yen, Dólar o Libra. Elegí de nuevo.");

            moneda=leer.next();
            moneda=moneda.toLowerCase();
        }

        ConvertirMoneda(monto,moneda);

        System.out.println("");
        System.out.println("Ya está. Chau.");
    }
    public static void ConvertirMoneda(double monto,String moneda){
        switch (moneda){
            //¥£$€
            case ("dolar"):
            case ("dólar"):
                System.out.println("€ "+monto+" equivale a $ "+(monto*1.28611));
                break;
            case ("yen"):
                System.out.println("€ "+monto+" equivale a ¥ "+(monto*129.852));
                break;
            case ("libra"):
                System.out.println("€ "+monto+" equivale a £ "+(monto*0.86));
                break;
        }
    }
}
