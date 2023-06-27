package service;

import entidades.Matematica;

public class ServiceMatematica {
    //a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
    public double devolverMayor(Matematica objMat){
        return Math.max(objMat.getNumero1(), objMat.getNumero2());
    }
    //b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
    //elevado al menor número. Previamente se deben redondear ambos valores.
    public int calcularPotencia(Matematica objMat){
        int resulPot;

            if (objMat.getNumero1()<objMat.getNumero2()){
                resulPot= (int) Math.pow(Math.round(objMat.getNumero2()),Math.round(objMat.getNumero1()));
            } else {
                resulPot= (int) Math.pow(Math.round(objMat.getNumero1()),Math.round(objMat.getNumero2()));
            }
        return resulPot;
    }
    //c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
    //Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
    public double calcularRaiz(Matematica objMat){
        double aux=Math.min(objMat.getNumero2(),objMat.getNumero1());
        aux=Math.abs(aux);

        return Math.sqrt(aux);
    }
}
