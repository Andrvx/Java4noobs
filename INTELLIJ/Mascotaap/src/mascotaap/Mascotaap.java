package mascotaap;


import entidades.Mascota;
import entidades.Usuario;

import java.util.Scanner;

public class Mascotaap {
    public static void main(String[] args) {

        Scanner leer=new Scanner(System.in);

        Mascota m1= new Mascota("Perrazo", "perrito", leer.next(), "negro", leer.nextInt(), true, leer.next());
/*
        Mascota m1 = new Mascota();
        m1.apodo="Perrito";
        m1.nombre="Perrazo";
        m1.edad=28;
        m1.cola=true;
        m1.color="Negro";
        m1.raza="Perro";
        m1.tipo="Perro";
*/
        System.out.println(m1.apodo+" "+m1.tipo+" "+m1.edad+" "+m1.raza);


        }
    }