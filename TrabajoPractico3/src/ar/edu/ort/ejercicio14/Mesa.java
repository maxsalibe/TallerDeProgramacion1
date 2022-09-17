package ar.edu.ort.ejercicio14;

public class Mesa {
    private int numero;
    private int capacidad;
    private boolean libre;

    public Mesa(int numero) {
        this.numero = numero;
    }

    public void cerrarMesa() {
        libre = true;
    }

    public boolean sosLaMesa(int n) {
        return numero == n;
    }

    @Override
    public String toString() {
        return "Mesa{" +
                "numero=" + numero +
                ", libre=" + libre +
                '}';
    }
}
