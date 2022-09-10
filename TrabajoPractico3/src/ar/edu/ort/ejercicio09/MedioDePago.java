package ar.edu.ort.ejercicio09;

public abstract class MedioDePago {
    private String descripcion;

    public MedioDePago(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getDescuento() {
        return 0;
    }
}
