// 1-atributos 2-constructor 3-getter y setter 4-métodos funcionales 5-to stream???
package entidades;

public class Mascota {
    private String nombre;
    private String apodo;
    private String tipo;
    private String color;
    private int edad;
    private boolean cola;
    private String raza;

    public Mascota(){
        //constructor implícito
    }

    public Mascota(String nombre, String apodo, String tipo, String color, int edad, boolean cola, String raza) {
        //alt+insert
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
    }
    //setters
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setApodo(String apodo) {
        this.apodo = apodo;
    }
    public void setTipo(String tipo){
        this.tipo=tipo;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setCola(boolean cola) {
        this.cola = cola;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    //getters
    public String getApodo() {
        return apodo;
    }
    public String getNombre() {
        return nombre;
    }
    public String getColor() {
        return color;
    }
    public int getEdad() {
        return edad;
    }
    public String getRaza() {
        return raza;
    }
    public String getTipo() {
        return tipo;
    }
    public boolean isCola() {
        return cola;
    }
    public String getCola() {
        if (this.cola==true) {
            return "Tiene rabo";
        } else {
            return "rabón";
        }
    }
}
