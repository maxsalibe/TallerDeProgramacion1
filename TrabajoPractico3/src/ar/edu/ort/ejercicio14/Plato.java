package ar.edu.ort.ejercicio14;

public class Plato extends ItemMenu {
    private String descripcion;
    private boolean esVegano;
    private boolean esAptoCeliaco;

    @Override
    public double aplicarDescuento(double precio) {
        double precioConDescuento = precio;
        if (!esVegano) {
            precioConDescuento *= Restaurante.DESCUENTO_EFVO_PLATOS_NO_VEGANOS;
        }
        if (esAptoCeliaco) {
            precioConDescuento *= Restaurante.DESCUENTO_EFVO_PLATOS_CELIACOS;
        }
        return precioConDescuento;
    }

}
