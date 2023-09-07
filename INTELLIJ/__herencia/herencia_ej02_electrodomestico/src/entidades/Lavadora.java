package entidades;
import enumeraciones.Carga;
import enumeraciones.Color;
import enumeraciones.ConsumoEnergetico;

public class Lavadora extends Electrodomestico{
    private Carga carga;

    public Lavadora() {
    }

    public Lavadora(Integer precio, Color color, ConsumoEnergetico consumoEnergetico, Integer peso, Carga carga) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Carga getCarga() {
        return carga;
    }

    public void setCarga(Carga carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "carga=" + carga +
                '}';
    }
}
