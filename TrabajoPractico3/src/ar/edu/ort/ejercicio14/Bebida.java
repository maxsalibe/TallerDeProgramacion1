package ar.edu.ort.ejercicio14;

public class Bebida extends ItemMenu {
    private double tamanio;
    private boolean tieneAlcohol;

    public Bebida(String nombre, double precio, boolean tieneAlcohol) {
        super(nombre, precio);
        this.tieneAlcohol = tieneAlcohol;
    }

    @Override
    public double aplicarDescuento(double precio) {
        double precioConDescuento = precio;
        if (!tieneAlcohol) {
            precioConDescuento *= Restaurante.DESCUENTO_EFVO_BEBIDAS_SIN_ALC;
        } else {
            precioConDescuento *= Restaurante.DESCUENTO_EFVO_BEBIDAS_CON_ALC;
        }
        return precioConDescuento;
    }
}
