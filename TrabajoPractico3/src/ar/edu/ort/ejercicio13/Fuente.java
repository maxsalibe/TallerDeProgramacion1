package ar.edu.ort.ejercicio13;

public abstract class Fuente implements Calificable {
    private String nombre;
    private String path;

    public Fuente(String nombre, String path) {
        this.nombre = nombre;
        this.path = path;
    }

}
