package entidades;
import java.util.Objects;
public class Producto implements Comparable<Producto>{
    private String nombre;
    private double precio;

    public Producto() {
    }

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public int compareTo(Producto producto) {
        return this.nombre.compareTo(producto.getNombre());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Producto)) return false;
        Producto producto = (Producto) o;
        return Double.compare(producto.getPrecio(), getPrecio()) == 0 && Objects.equals(getNombre(), producto.getNombre());
    }

    @Override
    public int hashCode() {
        return 7 * (Objects.hashCode(getNombre()));
    }
}
