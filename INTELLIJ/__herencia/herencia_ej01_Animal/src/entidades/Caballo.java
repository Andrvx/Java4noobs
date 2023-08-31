package entidades;

public class Caballo extends Animal{
    public Caballo() {
    }

    public Caballo(String nombre, String alimento, Integer edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimentarse() {
        System.out.println("Este animal, "+this.nombre+", se alimenta de "+this.alimento+".");
    }
}
