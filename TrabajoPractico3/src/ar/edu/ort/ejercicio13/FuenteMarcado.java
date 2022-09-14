package ar.edu.ort.ejercicio13;

public class FuenteMarcado extends Fuente {
    private double tamanio;

    @Override
    public double indiceCalidad() {
        return 450 / tamanio;
    }
}
