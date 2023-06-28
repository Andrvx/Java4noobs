//11. Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
//clase Date.
//En este ejercicio deberemos instanciar en el main, una fecha usando la clase Date,
//para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
//usuario para poner el constructor del objeto Date.
//Una vez creada la fecha de tipo Date, deberemos mostrarla y mostrar cuantos años
//hay entre esa fecha y la fecha actual, que se puede conseguir instanciando un objeto
//Date con constructor vacío.

import java.util.Date;
import java.util.Scanner;

//Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
//Ejemplo fecha actual: Date fechaActual = new Date();
public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int mes,dia,anio;

        System.out.println("Ingresá los dos dígitos del día");
        dia=leer.nextInt();

        System.out.println("Ingresá los dos dígitos del mes");
        mes=leer.nextInt();
        mes-=1;

        System.out.println("Ingresá los cuatro dígitos del año");
        anio=leer.nextInt();
        anio-=1900;

        Date fechaIngresada=new Date(anio,mes,dia);
        Date fechaActual=new Date();

        System.out.println(fechaIngresada.toString());
        System.out.println(fechaActual.toString());
        System.out.println("La diferencia de años entre la fecha ingresada y la actual es: "+(fechaActual.getYear()-fechaIngresada.getYear()));

    }
}