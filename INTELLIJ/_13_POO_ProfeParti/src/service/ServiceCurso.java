package service;

import entidades.Curso;

import java.util.Scanner;

public class ServiceCurso {
    // método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
//que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
//en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
//nombre de cada alumno.
    public void cargarAlumnos(Curso curso){
        Scanner leer=new Scanner(System.in).useDelimiter("\n");

        String[] aux=new String[5];

        System.out.println("- Cargar Alumnos -");

        for (int i=0;i<5;i++) {
            System.out.println("Ingrese el nombre del " + (i+1) + "° alumno:");
            aux[i]=leer.next();
        }
        curso.setAlumnos(aux);

        System.out.println("- Alumnos Cargados -");
        System.out.println("");
    }

    // Método crearCurso(): el método crear curso, le pide los valores de los atributos al
//usuario y después se le asignan a sus respectivos atributos para llenar el objeto
//Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
//al atributo alumnos
    public void crearCurso(Curso curso){
        Scanner leer=new Scanner(System.in).useDelimiter("\n");

        System.out.println("*** Crear Curso ***");
        //nombre
        System.out.println("Ingrese el nombre del Curso:");
        curso.setNombreCurso(leer.next());
        //turno
        boolean validT;
        do {
            System.out.println("Ingrese el turno (M/T):");
            String auxT= leer.next();

            if (auxT.equalsIgnoreCase("M")) {
                curso.setTurno("Mañana");
                validT=true;
            } else if (auxT.equalsIgnoreCase("T")) {
                curso.setTurno("tarde");
                validT=true;
            } else {
                System.out.println("X - Opción inválida -");
                validT=false;
            }
        } while (!validT);
        //horas por día
        System.out.println("Ingrese la cantidad de horas por día:");
        curso.setCantidadHorasPorDia(leer.nextInt());
        //días por semana
        System.out.println("Cuántos días de la semana cursa?");
        curso.setCantidadDiasPorSemana(leer.nextInt());
        //precio por hora
        System.out.println("Ingrese el precio por hora de cursado:");
        curso.setPrecioPorHora(leer.nextDouble());
        //nombre alumnos
        cargarAlumnos(curso);

        System.out.println("*** Curso creado ***");
        System.out.println("");
    }
    // Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
//en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
//día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
//se repite el encuentro.
    public double calcularGananciaSemana(Curso curso){
        System.out.println("*** Calculando Ganancia ***");

        return (curso.getPrecioPorHora()*( (double) curso.getCantidadHorasPorDia()* curso.getCantidadDiasPorSemana())*5.0);
    }
}
