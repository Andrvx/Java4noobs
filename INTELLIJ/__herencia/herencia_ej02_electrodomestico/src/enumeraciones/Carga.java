package enumeraciones;

public enum Carga {
    FRONTAL("Frontal"),SUPERIOR("Superior");
    private String valor;

    Carga(String valor) {
        this.valor = valor;
    }

    public String getValor() {
        return valor;
    }
}
