package service;

import entidades.Alumno;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

//En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
//toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
//pregunta al usuario si quiere crear otro Alumno o no.
//Después de ese bucle tendremos el siguiente método en el servicio de Alumno:

public class AlumnoService {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    ArrayList<Alumno> listaAlumnos=new ArrayList<>();

    public void crearAlumno(){
        System.out.println("*** Crear Alumno ***");

        boolean exit=false;

        do {
            System.out.println("Ingrese el nombre completo del alumno");
            String nombreAux= leer.next();

            ArrayList<Integer> notaAuxList = new ArrayList<>(3);

            for (int i = 0; i < 3; i++) {
                boolean valid = false;
                //notaAuxList = new ArrayList<>();
                int notaAuxVar=0;
                do {
                    System.out.println("Ingrese la " + (i + 1) + "° nota del alumno:");
                    try {
                        notaAuxVar=leer.nextInt();
                        valid = true;
                    } catch (InputMismatchException e) {
                        System.out.println("Nota inválida.");
                    }
                    notaAuxList.add(i,notaAuxVar);
                    leer.nextLine();
                } while (!valid);
            }

            Alumno alumnoAux = new Alumno(nombreAux,notaAuxList);

            listaAlumnos.add(alumnoAux);

            boolean valid = false;
            String opcion;
            do {
                System.out.println("Desea crear otro alumno? (s/n)");
                opcion = leer.next();
                if (opcion.equalsIgnoreCase("n")) {
                    exit = true;
                    valid = true;
                } else if (!opcion.equalsIgnoreCase("s")) {
                    System.out.println("No te entiendo");
                } else {
                    valid = true;
                }
            } while (!valid);
        } while (!exit);
    }

    public void mostrarListaAlumnos(){
        for (int i = 0; i < listaAlumnos.size(); i++) {
            System.out.print(listaAlumnos.get(i).getNombre()+" ");
            System.out.println(listaAlumnos.get(i).getNotas().toString());
        }
    }
    //Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
//final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
//del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
//promedio final, devuelto por el método y mostrado en el main.
    public int notaFinal(String nombre){
        int sumaNotas=0;
        for (int i = 0; i < listaAlumnos.size(); i++) {
            if (listaAlumnos.get(i).getNombre().equals(nombre)){
                for (int aux: listaAlumnos.get(i).getNotas()) {
                    sumaNotas += aux;
                }
            }
        }
        return (sumaNotas/3);
    }
}
