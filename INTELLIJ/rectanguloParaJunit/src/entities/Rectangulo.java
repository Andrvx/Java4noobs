package entities;

public class Rectangulo {
    private double base;
    private double altura;
    private boolean grandote;
    private String color;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.grandote=((base*altura)>100);
        this.color="No blanco";
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public boolean isGrandote() {
        return grandote;
    }

    public String getColor() {
        return color;
    }
}
