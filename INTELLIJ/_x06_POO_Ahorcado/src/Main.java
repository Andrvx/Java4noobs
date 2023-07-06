import entidades.Ahorcado;
import service.ServiceAhorcado;

//6. Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener
//como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la
//cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes métodos
//con los parámetros que sean necesarios:
// Constructores, tanto el vacío como el parametrizado.
public class Main {
    public static void main(String[] args) {
        System.out.println("**** EL AHORCADO ****");

        Ahorcado ahorcado=new Ahorcado();
        ServiceAhorcado servahorc=new ServiceAhorcado();

        servahorc.juego(ahorcado);

        System.out.println("**** GAME OVER ****");
    }
}