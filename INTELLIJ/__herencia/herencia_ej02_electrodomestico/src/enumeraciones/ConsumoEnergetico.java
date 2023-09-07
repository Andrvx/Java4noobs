package enumeraciones;

public enum ConsumoEnergetico {
    A(1000),B(800),C(600),D(500),E(300),F(100);

    private Integer precio;

    ConsumoEnergetico(Integer precio) {
        this.precio = precio;
    }

    public Integer getPrecio() {
        return precio;
    }
}
