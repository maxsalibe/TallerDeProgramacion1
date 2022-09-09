package ar.edu.ort.ejercicio06;

public class Bicicleta {
    private String marca;
    private String modelo;
    private int cantidadKm;

    public Bicicleta(String marca, String modelo, int cantidadKm) {
        this.marca = marca;
        this.modelo = modelo;
        this.cantidadKm = cantidadKm;
    }

    protected int getCantidadKm() {
        return this.cantidadKm;
    }

    public boolean reparable() {
        return cantidadKm < Taller.KM_MAX;
    }
}

