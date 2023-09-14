package entidades;
import enumeraciones.Color;
import enumeraciones.ConsumoEnergetico;

public class Televisor extends Electrodomestico{
    private Integer tamanio;
    private boolean TDT;

    public Televisor() {
    }

    public Televisor(Integer precio, Color color, ConsumoEnergetico consumoEnergetico, Integer peso, Integer tamanio, boolean TDT) {
        super(precio, color, consumoEnergetico, peso);
        this.tamanio = tamanio;
        this.TDT = TDT;
    }

    public Integer getTamanio() {
        return tamanio;
    }

    public void setTamanio(Integer tamanio) {
        this.tamanio = tamanio;
    }

    public boolean isTDT() {
        return TDT;
    }

    @Override
    public String toString() {
        return super.toString()+"Televisor{" +
                "tamanio=" + tamanio +
                ", TDT=" + TDT +
                '}';
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }
}
