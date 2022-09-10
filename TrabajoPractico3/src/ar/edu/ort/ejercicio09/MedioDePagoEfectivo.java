package ar.edu.ort.ejercicio09;

public class MedioDePagoEfectivo extends MedioDePago {
    private static final double DESCUENTO_POR_PAGO_EFECTIVO = 0;

    public MedioDePagoEfectivo(String descripcion) {
        super(descripcion);
    }

    @Override
    public double getDescuento() {
        return DESCUENTO_POR_PAGO_EFECTIVO;
    }

    @Override
    public String toString() {
        return "MedioDePagoEfectivo{}";
    }
}
