/*

 */
package ServiceCB;

import CuentaBancaria.Cuenta;

import java.util.Scanner;

public class ServiceCuenta {
    Scanner leer=new Scanner(System.in);
    //c) Metodo para crear un objeto CuentaBancaria.Cuenta, pidiéndole los datos al usuario.
    public void CrearCuenta(Cuenta cuenta){
        System.out.println("*** Crear Cuenta ***");
        System.out.println("Ingrese el DNI del titular.");
        cuenta.setDni(leer.nextLong());
        System.out.println("Ingrese el número de cuenta");
        cuenta.setNumeroCuenta(leer.nextInt());
        System.out.println("");
        System.out.println(cuenta.toString());
        System.out.println("");
    }
    //d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
    //y se la sumara a saldo actual.
    public void IngresarDinero(Cuenta cuenta){
        System.out.println("*** Ingresar Dinero ***");
        System.out.println("Qué monto ingresará?");
        double ingreso=leer.nextDouble();
        cuenta.setSaldoActual(cuenta.getSaldoActual()+ingreso);
        System.out.println("*** Ingreso exitoso ***");
        System.out.println(cuenta.toString());
        System.out.println("");
    }
    //e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
    //la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
    //pondrá el saldo actual en 0.
    public void RetirarDinero(Cuenta cuenta){
        System.out.println("*** Retirar Dinero ***");
        System.out.println("Qué montó retirará?");
        double retiro=leer.nextDouble();
        if (retiro <= cuenta.getSaldoActual()){
            cuenta.setSaldoActual(cuenta.getSaldoActual()-retiro);
        } else {
            System.out.println("Saldo insuficiente. Se retiraron "+cuenta.getSaldoActual()+" pesos.");
            cuenta.setSaldoActual(0);
        }
        System.out.println("*** Fin de la operación ***");
        System.out.println(cuenta.toString());
        System.out.println("");
    }
    //f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
    //usuario no saque más del 20%.
    public void ExtraccionRapida(Cuenta cuenta) {
        System.out.println("*** Extracción rápida ***");
        System.out.println("Operación con máximo de extracción del 20%. Saldo actual: " + cuenta.getSaldoActual() + ". Máximo: " + cuenta.getSaldoActual() * 0.2 + ".");

        boolean salir=true;
        do {
            System.out.println("Qué monto retirará?");
            double extraccion = leer.nextDouble();
                if (extraccion <= (cuenta.getSaldoActual() * 0.2)) {
                    cuenta.setSaldoActual(cuenta.getSaldoActual() - extraccion);
                    System.out.println("Se retiraron " + extraccion + " pesos.");
                    System.out.println("");
                    salir=false;
                } else {
                    System.out.println("El monto supera el máximo permitido");
                    System.out.println("");
                }
        }while (salir);
    }
    //g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
    public void ConsultarSaldo(Cuenta cuenta){
        System.out.println("*** Consulta de saldo ***");
        System.out.println("    Saldo: $ "+cuenta.getSaldoActual());
        System.out.println("");
    }
    //h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta.
    public void ConsultarDatos(Cuenta cuenta){
        System.out.println("*** Consulta de datos ***");
        System.out.println("DNI Titular: "+cuenta.getDni());
        System.out.println("Número de cuenta: "+cuenta.getNumeroCuenta());
        System.out.println("Saldo actual: $ "+cuenta.getSaldoActual());
        System.out.println("");
    }
}
