//9. Realizar una clase llamada Matemática que tenga como atributos dos números reales con
//los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
//constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
//Math.random para generar los dos números y se guardaran en el objeto con su
//respectivos set. Deberá además implementar los siguientes métodos:

import entidades.Matematica;
import service.ServiceMatematica;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        ServiceMatematica SM=new ServiceMatematica();
        Matematica m1=new Matematica();

        m1.setNumero1((Math.random()*15));
        m1.setNumero2((Math.random()*15));

        System.out.println(m1.toString());

        System.out.println("El mayor es "+SM.devolverMayor(m1));
        System.out.println("El mayor elevado al menor (redondeados) es "+SM.calcularPotencia(m1));
        System.out.println("La raiz cuadrada del valor absoluto del menor es "+SM.calcularRaiz(m1));
    }
}