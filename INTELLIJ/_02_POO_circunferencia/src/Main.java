import Service.CircunferenciaService;
import entidades.Circunferencia;

import java.util.Scanner;

// 2. Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
//tipo real. A continuación, se deben crear los siguientes métodos:
//a) Método constructor que inicialice el radio pasado como parámetro.
//b) Métodos get y set para el atributo radio de la clase Circunferencia.
//c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
//objeto.
//d) Método area(): para calcular el área de la circunferencia (𝐀𝐫𝐞𝐚 = 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨𝟐).
//e) Método perimetro(): para calcular el perímetro (𝐏𝐞𝐫𝐢𝐦𝐞𝐭𝐫𝐨 = 𝟐 ∗ 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨).
public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        CircunferenciaService CS=new CircunferenciaService();

        Circunferencia c1=new Circunferencia();

        System.out.println("Decime un radio");
        c1.setRadio(leer.nextFloat());

        System.out.println("* Área de la circunferencia con radio "+c1.getRadio()+" es "+CS.Area(c1.getRadio()));
        System.out.println("* Perímetro de la circunferencia con radio "+c1.getRadio()+" es "+CS.Perimetro(c1.getRadio()));



        }
    }