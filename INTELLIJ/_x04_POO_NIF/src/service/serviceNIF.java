package service;

import entidades.NIF;

import java.util.Scanner;

// Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
//corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
//resultado del calculo.

public class serviceNIF {

    Scanner leer=new Scanner(System.in);
    public void crearNif(NIF nif){
        System.out.println("*** Crear NIF ***");
        System.out.println("");

        System.out.println("Ingrese el número de DNI:");
        nif.setDNI(leer.nextLong());
        System.out.println("- Calculando Dígito Verificador - ");
        nif.setLetraVerif(calcularNif(nif.getDNI()));
        System.out.println("- Dígito asignado -");
    }
    //La letra correspondiente al dígito verificador se calculará a traves de un método que
//funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el
//número de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe
//buscar en un array (vector) de caracteres la posición que corresponda al resto de la
//división para obtener la letra correspondiente. La tabla de caracteres es la siguiente:
//POSICIÓN LETRA

    public char calcularNif(long DNI){
        char[] tabla= new char[22];

        char reotrno;
        reotrno = 0;

        String tablaChar="TRWAGMYFPDXBNJZSQVHLCKE";

        for (int i=0;i<22;i++){
            tabla[i]=tablaChar.charAt(i);
        }

        int resto= (int) (DNI%23);

        for (int i = 0; i<22; i++){
            if (resto==i){
                reotrno= tabla[i];
            }
        }
        return reotrno;
    }
    // Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
//en mayúscula; por ejemplo: 00395469-F).
    public void mostrar(NIF nif){
        System.out.println("- Mostrando Coso -");
        System.out.println("NIF: "+nif.getDNI()+"-"+nif.getLetraVerif());
    }

}
