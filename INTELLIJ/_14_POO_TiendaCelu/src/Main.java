import Service.ServiceMovil;
import entidades.Movil;

import java.util.Scanner;

// 14. Una tienda que vende teléfonos móviles quiere tener registro de cada producto que
//posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
//almacenar cada producto con su información. Crear una entidad entidades.Movil con los atributos
//marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será
//un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número
//correspondiente al código. A continuación, se implementarán los siguientes métodos:
// Un constructor por defecto.
// Un constructor con todos los atributos como parámetro.
// Métodos getters y setters de cada atributo.
// Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
//instanciar un objeto Celular y poder cargarlo en nuestro programa.
// Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
//números de un celular. Para ello, puede utilizarse un bucle repetitivo
public class Main {
    public static void main(String[] args) {
        ServiceMovil SM=new ServiceMovil();
        Movil M1=new Movil();

        System.out.println("*** Verdo celulares. No son robados. ***");
        System.out.println("");

        SM.cargarCelular(M1);

        System.out.println(M1.toString());
        System.out.println("");
        System.out.println("Ya está");
    }
}