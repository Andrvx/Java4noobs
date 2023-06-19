import java.util.Scanner;

/*
8. Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares
y la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
public class ejEx08_multiploDeCinco {
    public static void main(String[] args){
        Scanner leer=new Scanner(System.in);

        System.out.println("Ingrese números hasta hallar un múltiplo de 5");
        int num;
        int cantPar=0;
        int cantImpar=0;
        int cantTot=0;

        do {
            num= leer.nextInt();
            if (num>0){
                cantTot++;
                if (num%2==0){
                    cantPar++;
                } else {
                    cantImpar++;
                }
            }
        } while (!(num%5==0));

        System.out.println("Múltiplo de 5 hallado ("+num+").");
        System.out.println("* Se ingresaron "+cantTot+" números, de los que "+cantPar+" eran pares y "+cantImpar+" impares. No conté los negativos, porque no.");

    }

}
