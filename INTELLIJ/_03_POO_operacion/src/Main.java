import entidades.Operacion;
import service.ServiceOp;

import java.util.Scanner;

// 3 - Crear una clase llamada Operacion que tenga como atributos privados numero1 y
//numero2. A continuación, se deben crear los siguientes métodos:
//
//a) Método constructor con todos los atributos pasados por parámetro.
//b) Metodo constructor sin los atributos pasados por parámetro.
//c) Métodos get y set.
//d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
//en los atributos del objeto.
//e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
//f) Método restar(): calcular la resta de los números y devolver el resultado al main
//g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
//fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
//Si no, se hace la multiplicación y se devuelve el resultado al main
//h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
//una división por cero, el método devuelve 0 y se le informa al usuario el error se le
//informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        ServiceOp SO=new ServiceOp();
        Operacion operacion=new Operacion();

        System.out.println("--- Programa Operación ---");
        System.out.println("Elegí dos números para crear una Operación");

        SO.CrearOperacion(operacion);

        boolean salir=false;

        do {
            System.out.println("Elegí una operación");
            System.out.println("1 - Sumar");
            System.out.println("2 - Restar");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("");
            System.out.println("5 - Salir");
            System.out.println("");

            int opcion= leer.nextInt();

            switch (opcion){
                case 1:
                    System.out.println(operacion.getNumero1()+" más "+operacion.getNumero2()+" es "+SO.Sumar(operacion)+".");
                    System.out.println("");
                    break;
                case 2:
                    System.out.println(operacion.getNumero1()+" menos "+operacion.getNumero2()+" es "+SO.Restar(operacion)+".");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println(operacion.getNumero1()+" por "+operacion.getNumero2()+" es "+SO.Multiplicar(operacion)+".");
                    System.out.println("");
                    break;
                case 4:
                    System.out.println(operacion.getNumero1()+" dividido "+operacion.getNumero2()+" es "+SO.Dividir(operacion)+".");
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("");
                    System.out.println("Ok, byeeee.");
                    salir=true;
                    break;
            }
        }while (!salir);
    }
}