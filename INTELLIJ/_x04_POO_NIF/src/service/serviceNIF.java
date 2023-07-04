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
//0 T
//1 R
//2 W
//3 A
//4 G
//5 M
//6 Y
//7 F
//8 P
//9 D
//10 X
//11 B
//12 N
//13 J
//14 Z
//15 S
//16 Q
//17 V
//18 H
//19 L
//20 C
//21 K
//22 E
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
        System.out.println("- Nostrando Coso -");
        System.out.println("NIF: "+nif.getDNI()+"-"+nif.getLetraVerif());
    }

}
