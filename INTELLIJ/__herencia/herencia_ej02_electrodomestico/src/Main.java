import entidades.Electrodomestico;
import entidades.Lavadora;
import entidades.Televisor;
import servicio.LavadoraServicio;
import servicio.TelevisorServicio;

// Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
//el precio final de los dos electrodomésticos
public class Main {
    public static void main(String[] args) {
        LavadoraServicio lavadoraServicio=new LavadoraServicio();
        TelevisorServicio televisorServicio=new TelevisorServicio();

        Lavadora l=new Lavadora();
        Electrodomestico t=new Televisor();

        l=lavadoraServicio.crearLavadora();

        lavadoraServicio.precioFinal(l);

        //t=televisorServicio.crearTelevisor();

        //televisorServicio.precioFinal(t);

        //System.out.println("Precio final del televisor: "+t.getPrecio());
        System.out.println("Precio final de la lavadora: "+l.getPrecio());

    }
}