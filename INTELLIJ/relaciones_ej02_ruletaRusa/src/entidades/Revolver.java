package entidades;
//Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
//del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
//tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.

public class Revolver {

    private int posicionActual;
    private int posicionAgua;

    public Revolver() {
    }

    public Revolver(int posicionActual, int posicionAgua) {
        this.posicionActual = posicionActual;
        this.posicionAgua = posicionAgua;
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }
    //Métodos:
//• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
//deben ser aleatorios.
    public void llenarRevolver(){
        this.posicionActual=0;
        boolean valid=false;
        do {
            int posAux = (int) (Math.random() * 10);
            if (posAux <= 5 && posAux >= 0) {
                valid=true;
                this.posicionAgua=posAux;
            }
        }while (!false);
    }

//• mojar(): devuelve true si la posición del agua coincide con la posición actual
    public boolean mojar(){
        boolean auxTirito=false;
        if (this.posicionAgua==this.posicionActual){
            auxTirito=true;
        } else {
            auxTirito=false;
        }
        return auxTirito;
    }

//• siguienteChorro(): cambia a la siguiente posición del tambor
    public void siguienteChorro(){
        if (this.posicionActual==6){
            this.posicionActual=0;
        } else {
            this.posicionActual++;
        }
    }
//• toString(): muestra información del revolver (posición actual y donde está el agua)
}
