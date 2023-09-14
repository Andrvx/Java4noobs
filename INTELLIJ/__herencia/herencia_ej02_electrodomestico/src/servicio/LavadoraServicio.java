package servicio;
import entidades.Electrodomestico;
import entidades.Lavadora;

public class LavadoraServicio extends ElectrodomesticoServicio{

    //• Método crearLavadora (): este método llama a crearElectrodomestico() de la clase
    //padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
    //el atributo propio de la lavadora.

    public Lavadora crearLavadora(){

        Lavadora lavadora= new Lavadora();

        super.crearElectrodomestico(lavadora);

        System.out.println("Ingrese el peso de carga");
        Integer auxCarga= leer.nextInt();

        lavadora.setCarga(auxCarga);

        return lavadora;
    }


    //• Método precioFinal(): este método será heredado y se le sumará la siguiente
    //funcionalidad. Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
    //carga es menor o igual, no se incrementará el precio. Este método debe llamar al
    //método padre y añadir el código necesario. Recuerda que las condiciones que hemos
    //visto en la clase Electrodoméstico también deben afectar al precio

    @Override
    public void precioFinal(Electrodomestico electrodomestico) {
        super.precioFinal(electrodomestico);

        if (((Lavadora)electrodomestico).getCarga()>30){
            electrodomestico.setPrecio(electrodomestico.getPrecio()+500);
        }
    }
}
