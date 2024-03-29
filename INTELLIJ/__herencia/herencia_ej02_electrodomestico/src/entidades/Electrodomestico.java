package entidades;
import enumeraciones.Color;
import enumeraciones.ConsumoEnergetico;

public class Electrodomestico {
    protected Integer precio;
    protected Color color;
    protected ConsumoEnergetico consumoEnergetico;

    protected Integer peso;

    public Electrodomestico() {
    }

    public Electrodomestico(Integer precio, Color color, ConsumoEnergetico consumoEnergetico, Integer peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public ConsumoEnergetico getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(ConsumoEnergetico consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "precio=" + precio +
                ", color=" + color +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                '}';
    }
}
