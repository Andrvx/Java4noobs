/*
2. Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C,
C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
public class ejEx02_intercValores {
    public static void main(String[] args){
        int A=0,B=1,C=2,D=3,aux;

        System.out.println("Los valores iniciales de las variables son:");
        System.out.println("A: "+A);
        System.out.println("B: "+B);
        System.out.println("C: "+C);
        System.out.println("D: "+D);

        aux=A;
        A=D;
        D=B;
        B=C;
        C=aux;

        System.out.println("");

        System.out.println("Los valores de las variables después del intercambio son:");
        System.out.println("A: "+A);
        System.out.println("B: "+B);
        System.out.println("C: "+C);
        System.out.println("D: "+D);



    }
}
