package ar.edu.ort.ejercicio14;

public abstract class ItemMenu {
    private String nombre;
    private double precio;

    public double getPrecio(FormaPago fp) {
        double precioADevolver = precio;
        if (fp.equals(FormaPago.EFECTIVO)) {
            precioADevolver = aplicarDescuento(precio);
        }
        return precioADevolver;
    }

    public abstract double aplicarDescuento(double precio);
}
