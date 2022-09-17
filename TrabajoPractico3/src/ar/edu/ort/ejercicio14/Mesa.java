package ar.edu.ort.ejercicio14;

public class Mesa {
    private int numero;
    private int capacidad;
    private boolean libre;

    public void cerrarMesa() {
        libre = true;
    }

    public boolean sosLaMesa(int n) {
        return numero == n;
    }
}
