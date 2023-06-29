package service;

import entidades.Raices;

public class ServiceRaices {
    // Método getDiscriminante(): devuelve el valor del discriminante (double). El
//discriminante tiene la siguiente formula: (b^2)-4*a*c
    public double getDiscriminante(Raices raices){
        double discrminante=((double) (Math.pow(raices.getB(),2))-(4 * raices.getA() * raices.getC()));
        return discrminante;
    }
// Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
//que esto ocurra, el discriminante debe ser mayor o igual que 0.
    public boolean tieneRaices(Raices raices){
        return (getDiscriminante(raices)>0);
    }
// Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
//que esto ocurra, el discriminante debe ser igual que 0.
    public boolean tieneRaiz(Raices raices){
        return (getDiscriminante(raices)==0);
    }
// Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
//posibles soluciones.
    public void obtenerRaices(Raices raices){
        if (tieneRaices(raices)){
            System.out.println("r1: "+((-raices.getB()+(Math.sqrt(Math.pow(raices.getB(),2)-(4* raices.getA()* raices.getC()))))/(2* raices.getA())));
            System.out.println("r2: "+((-raices.getB()-(Math.sqrt(Math.pow(raices.getB(),2)-(4* raices.getA()* raices.getC()))))/(2* raices.getA())));
        }
    }
// Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
//Es en el caso en que se tenga una única solución posible.
    public void obtenerRaiz(Raices raices){
        if (tieneRaiz(raices)){
            System.out.println("r: "+((-raices.getB()+(Math.sqrt(Math.pow(raices.getB(),2)-(4* raices.getA()* raices.getC()))))/(2* raices.getA())));
        }
    }
// Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
//pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
//obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
//de no existir solución, se mostrará un mensaje.
    public void calcular(Raices raices){
        if (tieneRaices(raices)){
            obtenerRaices(raices);
        } else if (tieneRaiz(raices)) {
            obtenerRaiz(raices);
        } else {
            System.out.println("La ecuación no tiene raíces reales.");
        }
    }
//Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
//delante de -b
}
