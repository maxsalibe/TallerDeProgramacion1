package ar.edu.ort.ejercicio06;

public class BiciElectrica extends Bicicleta {
    private int potencia;

    public BiciElectrica(String marca, String modelo, int cantidadKm, int potencia) {
        super(marca, modelo, cantidadKm);
        this.potencia = potencia;
    }

    @Override
    public boolean reparable() {
        return potencia <= Taller.POT_MAX && super.reparable();
    }
}
