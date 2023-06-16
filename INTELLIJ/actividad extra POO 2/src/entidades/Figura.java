package entidades;

import java.util.Scanner;

public class Figura {
    public int tipo;
    public String nombre;
    public double base;
    public double altura;
    public double apotema;
    public double radio;
    public double diagonal;

    public Figura() {
    }

    public Figura(int tipo, String nombre, double base, double altura, double apotema, double radio, double diagonal) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.base = base;
        this.altura = altura;
        this.apotema = apotema;
        this.radio = radio;
        this.diagonal = diagonal;
    }

    public void CrearFigura(){
        Scanner leer=new Scanner(System.in);

        System.out.println("Qué figura geométrica os place hoy (1-Cuadrado | 2-Rectángulo | 3-Triángulo | 4-Círculo" +
                " | 5-Exágono | 6-Pentágono | 7-Rombo)");
        tipo=leer.nextInt();
        switch (tipo){
            case 1:
                nombre="cuadrado";
                System.out.println("Ingrese el lado del caudrado");
                base=leer.nextDouble();
                break;
            case 2:
                nombre="rectángulo";
                System.out.println("Ingrese la base y la altura del rectángulo separados por ENTER");
                base=leer.nextDouble();
                altura=leer.nextDouble()
        }
    }

    public int getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public double getApotema() {
        return apotema;
    }

    public double getRadio() {
        return radio;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setApotema(double apotema) {
        this.apotema = apotema;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }
}

