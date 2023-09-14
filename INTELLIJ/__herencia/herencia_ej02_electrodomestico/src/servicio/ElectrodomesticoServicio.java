package servicio;
import entidades.Electrodomestico;
import entidades.Lavadora;
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
    //método precio por peso
    public Integer precioPorPeso(Integer peso){
        Integer precioAux=100;

        if (peso>=80){
            precioAux=1000;
        } else if (peso>=50) {
            precioAux=800;
        } else if (peso>=20) {
            precioAux=500;
        }

        return precioAux;
    }
    //• Metodo crearElectrodomestico(): le pide la información al usuario y llena el
    //electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
    //precio se le da un valor base de $1000.
    protected void crearElectrodomestico(Electrodomestico electrodomestico){
        System.out.println("*** Crear Electrodoméstico ***");

        //Electrodomestico electrodomestico=new Electrodomestico();

        System.out.println("Ingrese el color");
        String auxColor= leer.nextLine();

        electrodomestico.setColor(comprobarColor(auxColor));

        System.out.println("Ingrese la letra de consumo energético");
        char auxLetra=leer.next().charAt(0);

        electrodomestico.setConsumoEnergetico(comprobarConsumoEnergetico(auxLetra));

        System.out.println("Ingrese el peso");
        Integer auxPeso= leer.nextInt();

        electrodomestico.setPeso(auxPeso);

        electrodomestico.setPrecio(1000);

        //return electrodomestico;
    }

    //• Método precioFinal(): según el consumo energético y su tamaño, aumentará el valor del
    //precio.
    protected void precioFinal(Electrodomestico electrodomestico){
        Integer auxPrecioPeso=precioPorPeso(electrodomestico.getPeso());
        Integer auxPrecioConsumo=electrodomestico.getConsumoEnergetico().getPrecio();
        electrodomestico.setPrecio((electrodomestico.getPrecio())+auxPrecioConsumo+auxPrecioPeso);
    }
}
