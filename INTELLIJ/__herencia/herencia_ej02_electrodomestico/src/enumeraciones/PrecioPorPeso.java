package enumeraciones;

public enum PrecioPorPeso {
    CAT_A(100,"Entre 1 y 19 Kg"),CAT_B(500,"Entre 20 y 49 Kg"),CAT_C(800,"Entre 50 y 79 Kg"),CAT_D(1000,"Mayor que 80 Kg");

    private Integer precio;
    private String descripcion;

    PrecioPorPeso(Integer precio, String descripcion) {
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public Integer getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
