package Service;

import entidades.Circunferencia;

import java.util.Scanner;

//a) Método constructor que inicialice el radio pasado como parámetro.
//b) Métodos get y set para el atributo radio de la clase Circunferencia.
//c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
//objeto.
//d) Método area(): para calcular el área de la circunferencia (𝐀𝐫𝐞𝐚 = 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨𝟐).
//e) Método perimetro(): para calcular el perímetro (𝐏𝐞𝐫𝐢𝐦𝐞𝐭𝐫𝐨 = 𝟐 ∗ 𝛑 ∗ 𝐫𝐚𝐝𝐢𝐨).
public class CircunferenciaService {
    private Scanner leer=new Scanner(System.in).useDelimiter("\n");

    public void CrearCircunferencia(float radio){
        Circunferencia nuevaC=new Circunferencia();
        System.out.println("Decime el radio");
        nuevaC.setRadio(leer.nextFloat());
    }
    public float Area(float R){
        float a= (float) ((R * R)*3.14);
        return a;
    }
    public float Perimetro(float R){
        float p= (float) (2*R*3.14);
        return p;
    }

}
