//Crear una clase Ahorcado (como el juego), la cual deberá contener
////como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la
////cantidad jugadas máximas que puede realizar el usuario.
package entidades;

import java.util.Arrays;

public class Ahorcado {
    private String[] vectorPalabra;
    private int largoPalabra;
    private int cantJugadas;

    public Ahorcado() {
    }

    public Ahorcado(String[] vectorPalabra, int largoPalabra, int cantJugadas) {
        this.vectorPalabra = vectorPalabra;
        this.largoPalabra = largoPalabra;
        this.cantJugadas = cantJugadas;
    }

    public String[] getVectorPalabra() {
        return vectorPalabra;
    }

    public void setVectorPalabra(String[] vectorPalabra) {
        this.vectorPalabra = vectorPalabra;
    }

    public int getLargoPalabra() {
        return largoPalabra;
    }

    public void setLargoPalabra(int largoPalabra) {
        this.largoPalabra = largoPalabra;
    }

    public int getCantJugadas() {
        return cantJugadas;
    }

    public void setCantJugadas(int cantJugadas) {
        this.cantJugadas = cantJugadas;
    }

    @Override
    public String toString() {
        return "Ahorcado{" +
                "vectorPalabra=" + Arrays.toString(vectorPalabra) +
                ", largoPalabra=" + largoPalabra +
                ", cantJugadas=" + cantJugadas +
                '}';
    }
}
