package service;

import entidades.Operacion;

import java.util.Scanner;
public class ServiceOp {
    Scanner leer=new Scanner(System.in);
    //d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
    //en los atributos del objeto.
    public void CrearOperacion(Operacion o){
        System.out.println("***Crear Operación***");
        System.out.println("Ingrese el primer número");
        o.setNumero1(leer.nextInt());
        System.out.println("Ingrese el segundo número");
        o.setNumero2(leer.nextInt());
        System.out.println("Números guardados.");
        System.out.println("");
    }
    //e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
    public int Sumar(Operacion o){
        return o.getNumero1()+o.getNumero2();
    }
    //f) Método restar(): calcular la resta de los números y devolver el resultado al main
    public int Restar(Operacion o){
        return o.getNumero1()-o.getNumero2();
    }
    //g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
    //fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
    //Si no, se hace la multiplicación y se devuelve el resultado al main
    public int Multiplicar(Operacion o){
        if ((o.getNumero2()==0) || (o.getNumero1()==0)){
            System.out.println("Error: Uno de los números es cero. Ponele...");
            return 0;
        }else {
            return o.getNumero2()*o.getNumero1();
        }
    }
    //h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
    //una división por cero, el método devuelve 0 y se le informa al usuario el error se le
    //informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
    public double Dividir(Operacion o){
        if (o.getNumero1()==0){
            return 0;
        } else if (o.getNumero2()==0) {
            System.out.println("");
            System.out.println("Error: El divisor no puede ser cero. Posta.");
            return 0;
        } else {
            return (double) o.getNumero1()/o.getNumero2();
        }
    }
}
