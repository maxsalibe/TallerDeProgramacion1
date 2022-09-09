package ar.edu.ort.ejercicio10;

public class Amarra {
    private int numero;
    private String ubicacion;
    private boolean disponible;
    private Barco barco;

    public Amarra(int numero, String ubicacion, boolean disponible, Barco barco) {
        this.numero = numero;
        this.ubicacion = ubicacion;
        this.disponible = disponible;
        this.barco = barco;
    }

    public float alquiler() {
        return barco.alquiler();
    }

    public float consumo() {
        return barco.calcularConsumo();
    }

    public Barco getBarco() {
        return this.barco;
    }



}
