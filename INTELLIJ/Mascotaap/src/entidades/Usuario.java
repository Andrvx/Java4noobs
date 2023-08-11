package entidades;

import java.util.ArrayList;
import java.util.Date;

public class Usuario {
    public String nombre;
    public String apelllido;
    public String dni;
    public Date nacimiento;
    public String pais;
    ArrayList<Mascota> listaMascotas;
    public Usuario(){

    }

    public Usuario(String nombre, String apelllido, String dni, Date nacimiento, String pais) {
        this.nombre = nombre;
        this.apelllido = apelllido;
        this.dni = dni;
        this.nacimiento = nacimiento;
        this.pais = pais;
    }
}
