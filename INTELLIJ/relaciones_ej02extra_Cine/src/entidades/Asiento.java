package entidades;
//Para representar la sala con los espectadores vamos a utilizar una matriz. Los asientos son
//etiquetados por una letra y un número la fila A1 empieza al final del mapa como se muestra en
//la tabla. También deberemos saber si el asiento está ocupado por un espectador o no, si esta
//ocupado se muestra una X, sino un espacio vacío.
public class Asiento {
    private int fila;
    private String columna;
    private boolean ocupado;

    private Espectador espectador;

    public Asiento() {
    }

    public Asiento(int fila, String columna, boolean ocupado, Espectador espectador) {
        this.fila = fila;
        this.columna = columna;
        this.ocupado = ocupado;
        this.espectador = espectador;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public String getColumna() {
        return columna;
    }

    public void setColumna(String columna) {
        this.columna = columna;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }

    @Override
    public String toString() {
        return "Asiento{" +
                "fila=" + fila +
                ", columna='" + columna + '\'' +
                ", ocupado=" + ocupado +
                ", espectador=" + espectador +
                '}';
    }
}
