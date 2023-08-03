package entidades;
import java.util.Objects;

public class Pais implements Comparable<Pais>{
    private String pais;

    public Pais() {
    }

    public Pais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = (7 * hash) + Objects.hashCode(getPais());
        return hash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pais)) return false;
        Pais pais1 = (Pais) o;
        return Objects.equals(getPais(), pais1.getPais());
    }

    @Override
    public String toString() {
        return "Pais{" +
                "pais='" + pais + '\'' +
                '}';
    }

    @Override
    public int compareTo(Pais pais) {
        return this.pais.compareTo(pais.getPais());
    }
}
