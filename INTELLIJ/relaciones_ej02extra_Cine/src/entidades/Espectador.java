package entidades;
//Por último, del espectador, nos interesa saber su
////nombre, edad y el dinero que tiene disponible
public class Espectador {
    private String nombre;
    private int edad;
    private double billetera;

    public Espectador() {
    }

    public Espectador(String nombre, int edad, double billetera) {
        this.nombre = nombre;
        this.edad = edad;
        this.billetera = billetera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getBilletera() {
        return billetera;
    }

    public void setBilletera(double billetera) {
        this.billetera = billetera;
    }

    @Override
    public String toString() {
        return "Espectador{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", billetera=" + billetera +
                '}';
    }
}
