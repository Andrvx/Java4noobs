package entidades;

public class Gato extends Animal{
    public Gato() {
    }

    public Gato(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimentarse() {
        System.out.println("Este animal, "+this.nombre+", se alimenta de "+this.alimento+".");
    }
}
