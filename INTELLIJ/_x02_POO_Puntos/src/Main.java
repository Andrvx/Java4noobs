import Service.ServicePuntos;
import entidades.Puntos;

import java.util.Scanner;

// 2. Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
//atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
//usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
//los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
//que existe entre los dos puntos que existen en la clase Puntos. Para conocer como
//calcular la distancia entre dos puntos consulte el siguiente link:
//http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        Puntos P=new Puntos();
        ServicePuntos SP=new ServicePuntos();

        System.out.println("*** Distancia por coordenadas en un plano ***");
        System.out.println("");

        SP.crearPunos(P);

        System.out.println(P.toString());
        System.out.println("");

        System.out.println("La distancia entre los puntos es "+SP.calcularDistancia(P));
        System.out.println("");
        System.out.println("Listo.");
    }
}