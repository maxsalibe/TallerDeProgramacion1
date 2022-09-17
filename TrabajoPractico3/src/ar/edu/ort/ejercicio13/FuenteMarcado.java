package ar.edu.ort.ejercicio13;

public class FuenteMarcado extends Fuente {
    private double tamanio;

    public FuenteMarcado(String nombre, String path, double tamanio) {
        super(nombre, path);
        this.tamanio = tamanio;
    }

    @Override
    public double indiceCalidad() {
        return 450 / tamanio;
    }
}
