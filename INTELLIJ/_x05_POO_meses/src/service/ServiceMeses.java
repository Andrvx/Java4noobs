package service;

import entidades.Meses;

public class ServiceMeses {

    public String elegirMesRandom(Meses meses){
        int num;
        boolean valid=false;

        do {
            num = (int) (Math.random() * 10);
            if (num<12 && num>0){
                valid=true;
            }
        } while (!valid);

        return meses.getMeses()[num];
    }
}
