//7. Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
//sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
//atributo, puede hacerlo. Los métodos que se implementarán son:
import entidades.Persona;
import servicePersona.ServiceP;
import java.util.Scanner;

//A continuación, en la clase main hacer lo siguiente:
//Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
//los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
//tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
//persona es mayor de edad.
//Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
//distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
//cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
//también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        ServiceP SP=new ServiceP();

        int[] vectIMC=new int[4];
        boolean[] vectMayorEdad=new boolean[4];
        Persona[] vectP=new Persona[4];

        System.out.println("*** Programa Persona ***");

        for (int i=0;i<4;i++){
            System.out.println("");
            System.out.println((i+1)+"° persona:");
            vectP[i]=SP.CrearPersona();
        }
        for (int i=0;i<4;i++){
            vectIMC[i]=SP.CalcularIMC(vectP[i]);
        }
        for (int i=0;i<4;i++){
            vectMayorEdad[i]=SP.EsMayorDeEdad(vectP[i]);
        }
        //calcular un porcentaje de esas 4 personas
        //cuantas están por debajo de su peso, cuantas en su peso ideal
        //y cuantos por encima, y también calcularemos un porcentaje de cuantos
        //son mayores de edad y cuantos menores

        int subP=0, cisP=0, sobreP=0;
        for (int i=0;i<4;i++){
            switch (vectIMC[i]){
                case -1:
                    subP++;
                    break;
                case 0:
                    cisP++;
                    break;
                case 1:
                    sobreP++;
                    break;
            }
        }
        System.out.println("* Las personas por debajo de su peso representan el "+(25*subP)+"% de" +
                " la muestra, las personas en su rango de peso ideal representan el " +
                ""+(cisP*25)+"%, y las personas con sobrepeso representan el "+(sobreP*25)+"% del " +
                "total.");
        int mayores=0;
        for (int i=0;i<4;i++){
            if (vectMayorEdad[i]){
                mayores++;
            }
        }
        System.out.println("* El "+(25*mayores)+"% de las personas es mayor de edad.");
        System.out.println("");
        System.out.println("Terminose.");
    }
}