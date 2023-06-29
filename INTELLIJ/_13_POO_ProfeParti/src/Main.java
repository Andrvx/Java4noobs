import entidades.Curso;
import service.ServiceCurso;

import java.util.Scanner;

// 13. Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un
//programa para organizar la información de cada curso. Para ello, crearemos una clase
//entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
//cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde
//alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
//nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
// Un constructor por defecto.
// Un constructor con todos los atributos como parámetro.
// Métodos getters y setters de cada atributo.
// método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
//que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
//en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
//nombre de cada alumno.
// Método crearCurso(): el método crear curso, le pide los valores de los atributos al
//usuario y después se le asignan a sus respectivos atributos para llenar el objeto
//Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
//al atributo alumnos
// Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
//en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
//día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
//se repite el encuentro.
public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        ServiceCurso SC=new ServiceCurso();
        Curso curso=new Curso();

        System.out.println("*** Cursos Particulares ***");
        System.out.println("");

        boolean salir=false;
        int opcion;
        do {
            do {
                System.out.println("- Menú de opciones -");
                System.out.println("  1- Crear Curso");
                System.out.println("  2- Calcular Ganancia");
                System.out.println("  3- Mostrar curso");
                System.out.println("  4- Salir");
                System.out.println("");
                opcion= leer.nextInt();
            } while (opcion!=1 && opcion!=2 && opcion!=3 && opcion!=4);

            switch (opcion){
                case 1:
                    SC.crearCurso(curso);
                    break;
                case 2:
                    System.out.println("- La ganancia semanal es de $ "+SC.calcularGananciaSemana(curso));
                    System.out.println("");
                    break;
                case 3:
                    System.out.println(curso.toString());
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("Ok, bye!");
                    salir=true;
            }
        } while (!salir);
    }
}