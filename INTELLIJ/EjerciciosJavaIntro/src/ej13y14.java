/*
EJERCICIO 13
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
Declaración y creación de un Vector

EJERCICIO 14
Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus compañeros de equipo
tipo[] arregloV = new tipo[Tamaño];Declaración y creación de una Matriz

tipo[][] arregloM = new tipo[Filas][Columnas];

<>
*/

import java.util.Scanner;

public class ej13y14 {

    public static void main(String[] args){
        String[] Equipo = new String[5];
        Scanner leer = new Scanner(System.in);

        IngresarNombres(Equipo);

        System.out.println("");

        ImprimirVector(Equipo);

    }
    public static void IngresarNombres(String[] Equipo){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los "+Equipo.length+" nombres del equipo:");
        for (int i=0;i<Equipo.length; i++){
            Equipo[i]=leer.nextLine();
        }
    }
    public static void ImprimirVector(String[] Equipo){
        System.out.println("Los nombres en el vector son:");
        for (String nombre: Equipo){
            System.out.println(nombre);
        }
    }

}
