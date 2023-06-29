// 14. Una tienda que vende teléfonos móviles quiere tener registro de cada producto que
//posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
//almacenar cada producto con su información. Crear una entidad entidades.Movil con los atributos
//marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será
//un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número
//correspondiente al código. A continuación, se implementarán los siguientes métodos:
// Un constructor por defecto.
// Un constructor con todos los atributos como parámetro.
// Métodos getters y setters de cada atributo.
package entidades;

import java.util.Arrays;

public class Movil {
    private String marca;
    private String modelo;
    private int memoriaRAM;
    private int almacenamiento;
    private int[] codigo=new int[7];

    public Movil() {
    }

    public Movil(String marca, String modelo, int memoriaRAM, int almacenamiento, int[] codigo) {
        this.marca = marca;
        this.modelo = modelo;
        this.memoriaRAM = memoriaRAM;
        this.almacenamiento = almacenamiento;
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    /**
     *
     * @return (int)
     */
    public int getCodigo() {
        int aux=0;
        for (int i=0;i<7;i++){
            aux+=this.codigo[i];
            if (i!=6){
                aux=aux*10;
            }
        }

        return aux;
    }

    /**
     *
     * @param codigo (int - 7 dígitos)
     */
    public void setCodigo(int codigo) {
        int[] auxCod=new int[7];
        String auxC=Integer.toString(codigo);
        String auxD;
        for (int i=0;i<7;i++){
            auxD=auxC.substring(i,i+1);
            auxCod[i]=Integer.parseInt(auxD);
        }
        this.codigo = auxCod;
    }

    @Override
    public String toString() {
        return "Movil{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", memoriaRAM=" + memoriaRAM +
                ", almacenamiento=" + almacenamiento +
                ", codigo=" + Arrays.toString(codigo) +
                '}';
    }
}
