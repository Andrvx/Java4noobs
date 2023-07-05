package entidades;

import java.util.Arrays;

//Crea una clase en Java donde declares una variable de tipo array de Strings que
////contenga los doce meses del año, en minúsculas.
public class Meses {
    private String[] meses = new String[]{"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto",
            "septiembre", "octubre", "noviembre", "diciembre"};

    public Meses() {
        this.meses = meses;
    }

    public String[] getMeses() {
        return meses;
    }
/*
    public void setMeses() {
        this.meses = new String[]{"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto",
                "septiembre", "octubre", "noviembre", "diciembre"};
    }
*/
    @Override
    public String toString() {
        return "Meses{" +
                "meses=" + Arrays.toString(meses) +
                '}';
    }
}
