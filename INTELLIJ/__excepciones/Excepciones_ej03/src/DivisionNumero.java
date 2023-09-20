public class DivisionNumero {
    /*
    public Integer parsearNumero(String numString){
        Integer numInt;
        try {
            numInt = Integer.parseInt(numString);
        } catch (NumberFormatException e){
            System.out.println("Eso no es un número");
            System.out.println(e.getCause());
            numInt=null;
        }
        return numInt;
    }
    */
    public double dividirNumeros(int n1, int n2){

        return ((double)n1/(double) n2);
    }
}
