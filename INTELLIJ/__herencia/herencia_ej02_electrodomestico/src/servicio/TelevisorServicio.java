package servicio;
import entidades.Electrodomestico;
import entidades.Televisor;

public class TelevisorServicio extends ElectrodomesticoServicio {
    //• Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
    //padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
    //los atributos del televisor.
    public Electrodomestico crearTelevisor(){
        Televisor televisor=(Televisor) super.crearElectrodomestico();

        System.out.println("Ingrese el tamaño de la pantalla en pulgadas");
        Integer auxTamanio= leer.nextInt();

        televisor.setTamanio(auxTamanio);

        System.out.println("Tiene sintonizador TDT?(S/N)");
        String auxTDT= leer.nextLine();

        if (auxTDT.equalsIgnoreCase("s")){
            televisor.setTDT(true);
        } else {
            televisor.setTDT(false);
        }

        return televisor;
    }
    //• Método precioFinal(): este método será heredado y se le sumará la siguiente
    //funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
    //incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
    //$500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
    //también deben afectar al precio.
    @Override
    public void precioFinal(Electrodomestico electrodomestico){
        super.precioFinal(electrodomestico);

        if (((Televisor)electrodomestico).getTamanio()>40){
            electrodomestico.setPrecio((int)((electrodomestico.getPrecio())*1.4));
        }
        if (((Televisor) electrodomestico).isTDT()){
            electrodomestico.setPrecio(electrodomestico.getPrecio()+500);
        }
    }
}
