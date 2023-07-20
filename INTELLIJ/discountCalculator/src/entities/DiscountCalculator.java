package entities;

public class DiscountCalculator {

    private final double precio;
    private final double porcentajeDescuento;

    private final double precioConDescuento;

    public DiscountCalculator() {
    }

    public DiscountCalculator(double precio, double porcentajeDescuento){
        this.precio = precio;
        this.porcentajeDescuento = porcentajeDescuento;
        double descuento=precio*porcentajeDescuento/100;
        this.precioConDescuento=(precio-descuento);
    }

}
