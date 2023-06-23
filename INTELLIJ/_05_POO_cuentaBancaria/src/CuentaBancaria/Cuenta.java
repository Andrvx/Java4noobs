/*
Realizar una clase llamada CuentaBancaria.Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
 */
package CuentaBancaria;
public class Cuenta {
    private int numeroCuenta;
    private long dni;
    private double saldoActual;

    /**constructor por defecto
     *
     */
    public Cuenta() {
    }

    /**Constructor con att.
     *
     * @param numeroCuenta
     * @param dni
     * @param saldoActual
     */
    public Cuenta(int numeroCuenta, long dni, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    @Override
    public String toString() {
        return "- Cuenta { " +
                " numeroCuenta = " + numeroCuenta +
                ", dni =" + dni +
                ", saldoActual = " + saldoActual +
                '}';
    }
}
