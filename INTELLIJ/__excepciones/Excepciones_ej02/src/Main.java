public class Main {
    //Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
    //generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
    //de rango)
    public static void main(String[] args){
        String[] arreglo={"a","e","i"};

        try {

            for (int i = 0; i < 4; i++) {
                System.out.println(arreglo[i]);
            }

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getClass());
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }
}
