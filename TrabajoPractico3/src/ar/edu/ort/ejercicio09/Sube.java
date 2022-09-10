package ar.edu.ort.ejercicio09;

public class Sube extends MedioDePagoElectronico {
    private static final double DESCUENTO_SUBE = 10;

    public Sube(String descripcion, int diasDeDemora) {
        super(descripcion, diasDeDemora);
    }

    @Override
    public double getDescuento() {
        return DESCUENTO_SUBE;
    }
}
