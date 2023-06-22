/*
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada
 */
package service;

import entidades.Cafetera;

import java.util.Scanner;

public class CafeteraService {
    Scanner leer=new Scanner(System.in);
    public void LlenarCafetera(Cafetera cafetera){
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        System.out.println("*** La cafetera se llenó al máximo de su capacidad. ***");
    }
    public void ServirTaza(Cafetera cafetera){
        System.out.println("*** Sirviendo una taza. ***");
        System.out.println("Qué capacidad tiene la taza?");
        double taza=leer.nextDouble();

        if (taza<cafetera.getCantidadActual()){
            System.out.println("Llenamos la taza completa. No dormís hasta pasado mañana.");
            cafetera.setCantidadActual((cafetera.getCantidadActual())-taza);
        } else if (taza== cafetera.getCantidadActual()) {
            System.out.println("Llenamos la taza completa, pero se terminó el café.");
            cafetera.setCantidadActual(0);
        } else {
            System.out.println("Hay poco café en la cafetera, y no pudimos llenar la taza, pero quedó con "+cafetera.getCantidadActual()+" de café");
            cafetera.setCantidadActual(0);
        }
        System.out.println("Metele que se enfría!");
    }

    public void VaciarCafetera(Cafetera cafetera){
        System.out.println("*** Vaciando la cafetera. Me vas a hacer llorar. ***");
        cafetera.setCantidadActual(0);
    }
    public void AgregarCafe(Cafetera cafetera){
        System.out.println("*** Rellenando cafetera con los culitos de las tazas usadas. ***");
        System.out.println("Cuánto café agregamos?");
        double cafeAgregado=leer.nextDouble();

        if (cafetera.getCapacidadMaxima()<(cafetera.getCantidadActual()+cafeAgregado)){
            System.out.println("La revalsaste, pero quedó llena.");
            LlenarCafetera(cafetera);
        } else if (cafetera.getCapacidadMaxima()==(cafetera.getCantidadActual()+cafeAgregado)) {
            System.out.println("Alacanzó justo para que se llene!");
            LlenarCafetera(cafetera);
        } else {
            cafetera.setCantidadActual(cafetera.getCantidadActual()+cafeAgregado);
            System.out.println("La cafetera quedó con "+cafetera.getCantidadActual()+" de café.");
        }
    }
}
