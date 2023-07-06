//Crear una clase Ahorcado (como el juego), la cual deberá contener
//como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la
//cantidad jugadas máximas que puede realizar el usuario.
package entidades;

import java.util.Arrays;

public class Ahorcado {
    private char[] vectorPalabra;
    private char[] vectorBuscando;
    private int largoPalabra;
    private int cantJugadas;
    private int cantEncontradas;
    private String letrasYaBuscadas;
    public Ahorcado() {
    }

    public Ahorcado(char[] vectorPalabra, char[] vectorBuscando, int largoPalabra, int cantJugadas, int cantEncontradas, String letrasYaBuscadas) {
        this.vectorPalabra = vectorPalabra;
        this.vectorBuscando = vectorBuscando;
        this.largoPalabra = largoPalabra;
        this.cantJugadas = cantJugadas;
        this.cantEncontradas = cantEncontradas;
        this.letrasYaBuscadas = letrasYaBuscadas;
    }

    public char[] getVectorPalabra() {
        return vectorPalabra;
    }

    public void setVectorPalabra(char[] vectorPalabra) {
        this.vectorPalabra = vectorPalabra;
    }

    public char[] getVectorBuscando() {
        return vectorBuscando;
    }

    public void setVectorBuscando() {
        char auxVar='_';
        Arrays.fill(this.vectorBuscando,char);
        /*
        for (int i=0;i<this.vectorBuscando.length;i++) {
            this.vectorBuscando[i] = auxVar;
        }

         */
    }

    public void setVectorBuscando(int i,char letra) {
        this.vectorBuscando[i]=letra;
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

    public int getCantEncontradas() {
        return cantEncontradas;
    }

    public void setCantEncontradas(int cantEncontradas) {
        this.cantEncontradas = cantEncontradas;
    }

    public String getLetrasYaBuscadas() {
        return letrasYaBuscadas;
    }

    public void setLetrasYaBuscadas(char letra) {
        this.letrasYaBuscadas += letra;
    }

    @Override
    public String toString() {
        return "Ahorcado{" +
                "vectorPalabra=" + Arrays.toString(vectorPalabra) +
                ", vectorBuscando=" + Arrays.toString(vectorBuscando) +
                ", largoPalabra=" + largoPalabra +
                ", cantJugadas=" + cantJugadas +
                ", cantEncontradas=" + cantEncontradas +
                '}';
    }
}
