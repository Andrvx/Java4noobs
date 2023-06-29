package Service;
import entidades.Puntos;

import java.util.Scanner;
public class ServicePuntos {
    public void crearPunos(Puntos puntos){
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        System.out.println("-- Ingresando coordenadas --");
        System.out.println("x1:");
        puntos.setX1(leer.nextInt());
        System.out.println("y1:");
        puntos.setY1(leer.nextInt());
        System.out.println("x2:");
        puntos.setX2(leer.nextInt());
        System.out.println("y2:");
        puntos.setY2(leer.nextInt());

        System.out.println("-- Coordenadas cargadas --");
        System.out.println("");
    }
    public double calcularDistancia(Puntos puntos){
        final double x1=(double) puntos.getX1();
        final double y1=(double) puntos.getY1();
        final double x2=(double) puntos.getX2();
        final double y2=(double) puntos.getY2();

        return (Math.sqrt((Math.pow((y2-y1),2))+(Math.pow((x2-x1),2))));
    }
}
