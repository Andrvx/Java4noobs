package Servicio;
import entidades.Mascota;

import java.util.ArrayList;
import java.util.Scanner;

public class MascotaService {
    private Scanner leer=new Scanner(System.in).useDelimiter("\n");
    private ArrayList<String> mascotas;

    public MascotaService(){
        this.mascotas=new ArrayList<>();
    }

    /**
     *
     * @return
     */
    public Mascota crearMascota() {
        Mascota nuevaMascota=new Mascota();

        System.out.println("Ingrese el tipo de mascota");
        nuevaMascota.setTipo(leer.next());

        System.out.println("Ingrese el nombre de la mascota");
        nuevaMascota.setNombre(leer.next());

        System.out.println("Ingrese si tiene cola o no (Sí/No).");
        String cola=leer.next();
        if ((cola.equals("Si")) || (cola.equals("Sí")) || (cola.equals("si")) || (cola.equals("sí")) || (cola.equals("yes"))){
            nuevaMascota.setCola(true);
        } else {
            nuevaMascota.setCola(false);
        }

        return nuevaMascota;
    }

    /**
     *
     * @param masco
     */
    public void mostrarMascota(Mascota masco){
        System.out.println(masco.getNombre());
        System.out.println(masco.getTipo());
        System.out.println(masco.getCola());

    }
}

