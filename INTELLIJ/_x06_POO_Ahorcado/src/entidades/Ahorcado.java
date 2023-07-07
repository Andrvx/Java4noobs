//Crear una clase Ahorcado (como el juego), la cual deberá contener
//como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la
//cantidad jugadas máximas que puede realizar el usuario.
package entidades;

import java.util.Arrays;

public class Ahorcado {
    private String[] vectorPalabra;
    private String[] vectorBuscando;
    private int largoPalabra;
    private int cantJugadas;
    private int cantEncontradas;
    private String letrasYaBuscadas;
    public Ahorcado() {
    }

    public Ahorcado(String[] vectorPalabra, String[] vectorBuscando, int largoPalabra, int cantJugadas, int cantEncontradas, String letrasYaBuscadas) {
        this.vectorPalabra = vectorPalabra;
        this.vectorBuscando = vectorBuscando;
        this.largoPalabra = largoPalabra;
        this.cantJugadas = cantJugadas;
        this.cantEncontradas = cantEncontradas;
        this.letrasYaBuscadas = letrasYaBuscadas;
    }

    public String[] getVectorPalabra() {
        return vectorPalabra;
    }

    public void setVectorPalabra(String palabra) {
        this.vectorPalabra=new String[palabra.length()];
        for (int i=0;i<palabra.length();i++) {
            this.vectorPalabra[i] = palabra.substring(i,i+1);
        }
    }

    public String[] getVectorBuscando() {
        return vectorBuscando;
    }

    public void setVectorBuscando() {
        this.vectorBuscando=new String[this.largoPalabra];
        for (int i=0;i<this.vectorBuscando.length;i++) {
            this.vectorBuscando[i] = "_";
        }
    }

    public void setVectorBuscando(int i,String letra) {
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

    public void setLetrasYaBuscadas(String letra) {
        if (letra.equals(" ")){
            this.letrasYaBuscadas=" ";
        } else {
            this.letrasYaBuscadas += letra;
        }
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
