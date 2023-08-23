package entidades;

import enumeraciones.Raza;

//Perro, que tendrá como atributos: nombre, raza, edad y tamaño
public class Perro {
    private String nombre;
    private Raza raza;
    private int edad;
    private String tamanio;

    private Persona duenio;

    public Perro() {
    }

    public Perro(String nombre, int edad, String tamanio) {
        this.nombre = nombre;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Raza getRaza() {
        return raza;
    }

    public void setRaza(Raza raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public Persona getDuenio() {
        return duenio;
    }

    public void setDuenio(Persona duenio) {
        this.duenio = duenio;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "nombre='" + nombre + '\'' +
                ", raza='" + raza + '\'' +
                ", edad=" + edad +
                ", tamaño='" + tamanio + '\'' +
                ", dueño=" + duenio +
                '}';
    }
}