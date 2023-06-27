package entidades;
//Realizar una clase llamada Matemática que tenga como atributos dos números reales con
//los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
//constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
//Math.random para generar los dos números y se guardaran en el objeto con su
//respectivos set

public class Matematica {
    private double numero1;
    private double Numero2;

    /**
     *
     */
    public Matematica() {
    }

    /**
     *
     * @param numero1
     * @param numero2
     */
    public Matematica(double numero1, double numero2) {
        this.numero1 = numero1;
        Numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public double getNumero2() {
        return Numero2;
    }

    public void setNumero2(double numero2) {
        Numero2 = numero2;
    }

    @Override
    public String toString() {
        return "Matematica{" +
                "numero1=" + numero1 +
                ", Numero2=" + Numero2 +
                '}';
    }
}
