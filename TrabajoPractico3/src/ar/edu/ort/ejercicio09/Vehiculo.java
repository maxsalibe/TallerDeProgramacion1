package ar.edu.ort.ejercicio09;

public class Vehiculo {
    private String patente;
    private CategoriaVehiculo categoria;

    public Vehiculo(String patente, CategoriaVehiculo categoria) {
        this.patente = patente;
        this.categoria = categoria;
    }

    public double getTarifa() {
        return categoria.getTarifa();
    }
}
