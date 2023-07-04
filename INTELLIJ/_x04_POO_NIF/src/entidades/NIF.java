package entidades;

public class NIF {
    private long DNI;
    private char letraVerif;

    public NIF() {
    }

    public NIF(long DNI, char letraVerif) {
        this.DNI = DNI;
        this.letraVerif = letraVerif;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public char getLetraVerif() {
        return letraVerif;
    }

    public void setLetraVerif(char letraVerif) {
        this.letraVerif = letraVerif;
    }

    @Override
    public String toString() {
        return "NIF{" +
                "DNI=" + DNI +
                ", letraVerif=" + letraVerif +
                '}';
    }
}
