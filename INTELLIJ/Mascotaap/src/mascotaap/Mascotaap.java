package mascotaap;


import Servicio.MascotaService;
import entidades.Mascota;
import entidades.Usuario;

import java.util.Scanner;

public class Mascotaap {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        Mascota m1 = new Mascota("Perrazo", "perrito", "Alto Perro", "negro", 15, true, "saltazanja");
/*
        //asignando valores desde el main
        Mascota m1 = new Mascota();
        m1.apodo="Perrito";
        m1.nombre="Perrazo";
        m1.edad=28;
        m1.cola=true;
        m1.color="Negro";
        m1.raza="Perro";
        m1.tipo="Perro";

        //setters y getters
        System.out.println("m1 " + m1.getNombre() + " " + m1.getApodo() + " " + m1.getColor() + " " + m1.getTipo() + " " + m1.isCola() + " " + m1.getRaza() + " " + m1.getEdad());
        System.out.println("Nombre nuevo:");
        m1.setNombre(leer.next());
        System.out.println("Edad nueva:");
        m1.setEdad(leer.nextInt());
        System.out.println("Apodo nuevo:");
        m1.setApodo(leer.next());
        System.out.println("m1 " + m1.getNombre() + " " + m1.getApodo() + " " + m1.getColor() + " " + m1.getTipo() + " " + m1.isCola() + " " + m1.getRaza() + " " + m1.getEdad());
        System.out.println("m1 " + m1.getCola());
*/
        //creando mascota usando la clase service
        MascotaService mascotServ = new MascotaService();
        Mascota m3 = mascotServ.crearMascota();
        //System.out.println("m3 " + m3.getNombre() + " " + m3.getApodo() + " " + m3.getColor() + " " + m3.getTipo() + " " + m3.isCola() + " " + m3.getRaza() + " " + m3.getEdad());

        //usando método mostrar en service
        mascotServ.mostrarMascota(m3);

    }
}