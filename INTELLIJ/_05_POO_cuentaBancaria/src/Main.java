import CuentaBancaria.Cuenta;
import ServiceCB.ServiceCuenta;

import java.util.Scanner;

/*
5. Realizar una clase llamada CuentaBancaria.Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto CuentaBancaria.Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta.
 */
public class Main {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        ServiceCuenta SC=new ServiceCuenta();
        Cuenta c=new Cuenta();

        System.out.println("--- Programa Cuenta bancaria ---");

        boolean salir=false;

        do {
            System.out.println("*** Operaciones ***");
            System.out.println("1 - Crear Cuenta");
            System.out.println("2 - Ingresar Dinero");
            System.out.println("3 - Retirar Dinero");
            System.out.println("4 - Extracción Rápida");
            System.out.println("5 - Consultar Saldo");
            System.out.println("6 - Consultar Datos");
            System.out.println("7 - Salir");

            int opcion= leer.nextInt();

            switch (opcion){
                case 1:
                    SC.CrearCuenta(c);
                    break;
                case 2:
                    SC.IngresarDinero(c);
                    break;
                case 3:
                    SC.RetirarDinero(c);
                    break;
                case 4:
                    SC.ExtraccionRapida(c);
                    break;
                case 5:
                    SC.ConsultarSaldo(c);
                    break;
                case 6:
                    SC.ConsultarDatos(c);
                    break;
                case 7:
                    System.out.println("Pará que me apago. Brrrrrrr");
                    salir=true;
                    break;
                default:
                    System.out.println("Opción inválida, papu.");
                    break;
            }
        } while (!salir);
    }
}