/*
 * te edito el comentario
 */
package javaapplication1;

/**
 *
 * @author andre
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     * @param False
     */
    public static void main(String[] args) {
        // poniendo algo en pantalla
        System.out.println("A ver qué onda");
        System.out.println("parece que anduvo");
        
        String cadenaza = "anda o no?";
            System.out.print("variable cadenaza: ");
            System.out.println(cadenaza);
        
        double puntoFlotanteLargo = 0.5456;
            System.out.print("variable puntoFlotanteLargo: ");
            System.out.println(puntoFlotanteLargo);
        
        int entero = 45;
            System.out.print("variable entero: ");
            System.out.println(entero);
            
        char caracter = 'A';
        System.out.print("variable caracter: ");
            System.out.println(caracter);
        
        float puntoFlotanteCorto;
            puntoFlotanteCorto = 3.1416f;
            System.out.print("variable puntoFlotanteCortogit: ");
            System.out.println(puntoFlotanteCorto);
            
        boolean logico;
            logico = false;
            System.out.print("variable lógico: ");
            System.out.println(logico);
            
        long enteroGrande = 1000000;
            System.out.print("variable enteroGrande: ");
            System.out.println(enteroGrande);
            
        short enteroCorto = -4500;
            System.out.print("variable enteroCorto: ");
            System.out.println(enteroCorto);
            
        byte enteroCortito = -8;
            System.out.print("variable enteroCortito: ");
            System.out.println(enteroCortito);
            
            
            
    /* deteccion de errores pag. 13
        int numero = 48;
    double decimales = 3.55;
    boolean bandera = false;
    */ 
        
/*  
EJERCICIO 3
Define variables donde puedas alojar los resultados y prueba usar dos operadores de cada tipo
*/

int num1 = 5;
float num3;
double resultado;
long num2 = 7;
boolean bandera;

bandera = num1<num2;
resultado = (9)/2f;
        System.out.println("ejercicio3");
        System.out.print("variable int : ");
        System.out.println(num1);
        System.out.print("variable double : ");
        System.out.println(resultado);
        System.out.print("variable long : ");
        System.out.println(num2);
        System.out.print("variable boolean : " + bandera + " ");
        System.out.println(bandera);
        
        num3 = num1++;
        System.out.print("num1++: ");
        System.out.println(num3);
        num3 = num2--;
        System.out.print("num2--: ");
        System.out.println(num3);
        
/*
        EJERCICIO 4
Define una variable que aloje tu nombre y otra que guarde tu edad. Imprime ambas variables
por pantalla.
        
        */
        System.out.println("");
        System.out.println("ejercicio4");
short edad = 43;
String nombre = "Andres";

        System.out.println(nombre + " tiene " + edad + " años.");




    }
    
    
}