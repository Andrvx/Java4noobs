package entidades;

import java.util.Scanner;

public class Vehiculo {
    public String marca;
    public String modelo;
    public int year;
    public String tipo;


    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", year=" + year +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    public void CrearAuto(){
        Scanner leer=new Scanner(System.in);

        System.out.println("Ingrese el tipo de vehículo (1-auto 2-moto 3-bici).");
        int auxT;
        do {
            auxT = leer.nextInt();
            if ((auxT<1) || (auxT>3)){
                System.out.println("Pusiste cualquiera, probá de nuevo (1-auto 2-moto 3-bici).");
            }
        } while ((auxT<1) || (auxT>3));

        switch (auxT){
            case 1:
                tipo="Auto";
                break;
            case 2:
                tipo="Moto";
                break;
            case 3:
                tipo="Bici";
                break;
        }

        System.out.println("Ingrese la marca del/la "+tipo+".");
        marca=leer.next();

        System.out.println("Ingrese el año de fabricación del/la "+tipo+".");
        year=leer.nextInt();

        System.out.println("Ingrese el modelo del/la "+tipo+".");
        modelo=leer.next();


    }

    public int Moverse(int tiempo){
        int dist=0;

        if (tipo.equals("Auto")) {
            dist=3*tiempo;
        } else if (tipo.equals("Moto")){
            dist=2*tiempo;
            } else if (tipo.equals("Bici")){
            dist=1*tiempo;
                    }
        return dist;
    }

    public int Frenarse(){
        int distF=0;

        if (tipo.equals("Auto")) {
            distF= 2;
        } else if (tipo.equals("Moto")){
            distF= 2;
        } else if (tipo.equals("Bici")){
            distF= 0;
        }
        return distF;
    }


    public Vehiculo(String marca, String modelo, int year, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.tipo = tipo;
    }

    public Vehiculo() {
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
