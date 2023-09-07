package servicio;
import entidades.Electrodomestico;
import enumeraciones.Color;
import enumeraciones.ConsumoEnergetico;
import java.util.Scanner;

public class ElectrodomesticoServicio {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");
    //• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
    //sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
    //objeto y no será visible.
    public ConsumoEnergetico comprobarConsumoEnergetico(char letra){
        String letraString=""+letra;
        ConsumoEnergetico categoria=ConsumoEnergetico.F;
        for (ConsumoEnergetico aux: ConsumoEnergetico.values()){
            if (letraString.equalsIgnoreCase(aux.toString())){
                categoria=aux;
            }
        }
        return categoria;
    }
    //• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
    //usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
    //blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
    //minúsculas. Este método se invocará al crear el objeto y no será visible.
    public Color comprobarColor(String color){
        Color colorOk=Color.BLANCO;
        for (Color aux: Color.values()){
            if (color.equalsIgnoreCase(aux.toString())){
                colorOk=aux;
            }
        }
        return colorOk;
    }
    //• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
    //electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
    //precio se le da un valor base de $1000.
    public Electrodomestico crearElectrodomestico(){
        System.out.println("*** Crear Electrodoméstico ***");

        Electrodomestico electrodomestico=new Electrodomestico();

        System.out.println("Ingrese el color");
        String color= leer.nextLine();
        System.out.println("Ingrese la letra de consumo energético");
        char letra=leer.next().charAt(0);
    }
    //• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
    //precio.
}
