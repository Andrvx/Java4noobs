package Service;

import entidades.Movil;

import java.util.Scanner;

public class ServiceMovil {
    // Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
//instanciar un objeto Celular y poder cargarlo en nuestro programa.
    public void cargarCelular(Movil movil){
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        System.out.println("--- Cargar Celular ---");

        System.out.println("Ingrese la marca del móvil:");
        movil.setMarca(leer.next());

        System.out.println("Ingrese el modelo del móvil:");
        movil.setModelo(leer.next());

        ingresarCodigo(movil);

        System.out.println("Ingrese el tamaño de almacenamiento del móvil:");
        movil.setAlmacenamiento(leer.nextInt());

        System.out.println("Ingrese el tamaño de memoria RAM del móvil:");
        movil.setMemoriaRAM(leer.nextInt());
    }
// Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
//números de un celular. Para ello, puede utilizarse un bucle repetitivo
    public void ingresarCodigo(Movil movil){
        Scanner leer=new Scanner(System.in);

        String codigo;
        boolean valid=false;
        do {
            System.out.println("Ingrese el código del móvil:");
            codigo = leer.next();
            if (codigo.length()!=7){
                System.out.println("Código inválido (7 cifras - numérico)");
            } else {
                valid=true;
            }
        } while (!valid);
        movil.setCodigo(Integer.parseInt(codigo));
    }
}
