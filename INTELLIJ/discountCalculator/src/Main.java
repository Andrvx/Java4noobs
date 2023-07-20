import entities.DiscountCalculator;

import java.util.Scanner;

// 1. Calculadora de Descuentos:
//Crea una clase DiscountCalculator que calcule el descuento aplicado a un producto.
//Escribe pruebas unitarias para verificar que el cálculo del descuento se realiza correctamente
//para diferentes escenarios (por ejemplo, descuento del 10%, descuento máximo, sin descuento, etc.).
public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        System.out.println("Cuánto vale el coso?");
        double precio= leer.nextDouble();
        System.out.println("Qué porcentaje de descuento le hacemos?");
        double porcentajeDescuento=leer.nextDouble();
        DiscountCalculator ds=new DiscountCalculator()
        System.out.println("El precio con "+porcentajeDescuento+" % de descuento es: "+ DiscountCalculator.);

    }
}