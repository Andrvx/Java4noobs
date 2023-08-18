package entidades;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Baraja {
    private ArrayList<Carta> mazo;
    private ArrayList<Carta> baraja;
    private ArrayList<Carta> monton;
    public Baraja() {
        mazo = new ArrayList<>();
        String palo;
        for (int j=0; j<4 ; j++) {
            for (int i = 1; i < 13; i++) {
                if ((i!=8)&&(i!=9)) {
                    Carta carta = new Carta();
                    switch (j) {
                        case 0:
                            carta.setPalo("Espada");
                            carta.setNumero(i);
                            break;
                        case 1:
                            carta.setPalo("Basto");
                            carta.setNumero(i);
                            break;
                        case 2:
                            carta.setPalo("Oro");
                            carta.setNumero(i);
                            break;
                        case 3:
                            carta.setPalo("Copa");
                            carta.setNumero(i);
                            break;
                    }
                    mazo.add(carta);
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Baraja{" +
                "mazo=" + mazo +
                '}';
    }

    public String barajaToString() {
        return "Baraja{" +
                "baraja=" + baraja +
                '}';
    }

    public String montonToString() {
        return "Baraja{" +
                "montón=" + monton +
                '}';
    }

    //• barajar(): cambia de posición todas las cartas aleatoriamente.
    public void barajar(){
        baraja=mazo;
        Collections.shuffle(baraja);
    }
//• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
//se haya llegado al final, se indica al usuario que no hay más cartas.
    public Carta siguienteCarta(){
        Carta carta=new Carta();
        if (baraja.size()!=0) {
            carta = baraja.get(0);
            monton.add(carta);
            baraja.remove(0);
        } else {
            carta=null;
        }
        return carta;
    }
//• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
    public int cartasDisponibles(){
        return baraja.size();
    }
//• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
//cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
//debemos indicárselo al usuario.
public ArrayList<Carta> darCartas(int cantidad){
    ArrayList<Carta> cartasDadas=new ArrayList<>();

    if (cantidad > baraja.size()){
        cartasDadas=null;
    } else {
        for (int i=0; i<cantidad;i++){
            Carta cartaAux=new Carta();
            cartaAux=baraja.get(0);
            cartasDadas.add(cartaAux);
            monton.add(cartaAux);
            baraja.remove(0);
        }
    }
    return cartasDadas;
}
//• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
//indicárselo al usuario
    public void cartasMonton(){
        if (monton.size()==0){
            System.out.println("Todavía no sacaste cartas.");
        } else {
            montonToString();
        }
    }
//• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
//luego se llama al método, este no mostrara esa primera carta.
    public void mostrarBaraja(){
        if (baraja.size()==0){
            System.out.println("No quedan más cartas.");
        } else {
            barajaToString();
        }
    }
}
