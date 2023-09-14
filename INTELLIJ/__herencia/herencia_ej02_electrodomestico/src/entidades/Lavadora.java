package entidades;
import enumeraciones.Carga;
import enumeraciones.Color;
import enumeraciones.ConsumoEnergetico;

public class Lavadora extends Electrodomestico{
    private Integer carga;

    public Lavadora() {
    }

    public Lavadora(Integer precio, Color color, ConsumoEnergetico consumoEnergetico, Integer peso, Integer carga) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Integer getCarga() {
        return carga;
    }

    public void setCarga(Integer carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return super.toString()+"Lavadora{" +
                "carga=" + carga +
                '}';
    }
}
