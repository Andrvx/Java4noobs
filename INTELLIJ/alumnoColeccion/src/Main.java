import entidades.Alumno;
import service.AlumnoService;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

// 3. Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
//alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
//con sus 3 notas.
//En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
//toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
//pregunta al usuario si quiere crear otro Alumno o no.
//Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
//Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
//final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
//del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
//promedio final, devuelto por el método y mostrado en el main.
public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        AlumnoService aS=new AlumnoService();

        System.out.println("*** Programa Alumno ***");

        boolean exit=false;
        int opcion;

        ArrayList<Alumno> listaAlumnosMain= aS.getListaAlumnos();

        do {
            System.out.println("--- Menú ---");
            System.out.println("   1 - Cargar alumnos");
            System.out.println("   2 - Calcular nota promedio");
            System.out.println("   3 - Mostrar Lista de alumnos");
            System.out.println("   4 - Salir");

            boolean valid=false;
            do {
                try {
                    opcion = leer.nextInt();

                    switch (opcion){
                        case 1:
                            aS.crearAlumno();
                            valid=true;
                            break;
                        case 2:
                            System.out.println("Ingrese el nombre del alumno");
                            String nombre= leer.next();
                            leer.nextLine();
                            int contador=0;
                            for (Alumno alumno : listaAlumnosMain) {
                                if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                                    contador++;
                                }
                            }
                            if (contador==0){
                                System.out.println("El alumno no existe");
                                System.out.println("");
                            } else {
                                System.out.println("El promedio del alumno "+nombre+" es: "+aS.notaFinal(nombre)+".");
                                System.out.println("");
                            }
                            valid=true;
                            break;
                        case 3:
                            aS.mostrarListaAlumnos();
                            System.out.println("");
                            valid=true;
                            break;
                        case 4:
                            exit=true;
                            valid=true;
                            break;
                        default:
                            System.out.println("Opción inválida.");
                            System.out.println("");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Opción inválida.");
                    System.out.println("");
                }

            }while (!valid);

        }while (!exit);
        System.out.println("Byeeeee");
    }
}