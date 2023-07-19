package service;

import entities.Rectangulo;

import java.util.Scanner;

public class RectanguloService {
    Scanner leer=new Scanner(System.in).useDelimiter("\n");

    public double calcularArea(Rectangulo rectangulo){
        return (rectangulo.getAltura()*rectangulo.getBase());
    }
    public double calcularPerimetro(Rectangulo rectangulo){
        return ((rectangulo.getAltura()*2)+ (rectangulo.getBase()*2));
    }
}
