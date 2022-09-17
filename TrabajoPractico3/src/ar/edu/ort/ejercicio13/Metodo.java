package ar.edu.ort.ejercicio13;

public class Metodo implements Calificable {
    private String nombre;
    private int cantidadParametros;
    private int cantidadInstrucciones;
    private int ramificaciones;

    public Metodo(String nombre, int cantidadParametros, int cantidadInstrucciones, int ramificaciones) {
        this.nombre = nombre;
        this.cantidadParametros = cantidadParametros;
        this.cantidadInstrucciones = cantidadInstrucciones;
        this.ramificaciones = ramificaciones;
    }

    @Override
    public double indiceCalidad() {
        return 5 / (cantidadParametros + 1.0) + 20.0 / cantidadInstrucciones + 3 / (ramificaciones + 1.0);
    }

    @Override
    public String toString() {
        return "Metodo{" +
                "nombre='" + nombre + '\'' +
                ", cantidadParametros=" + cantidadParametros +
                ", cantidadInstrucciones=" + cantidadInstrucciones +
                ", ramificaciones=" + ramificaciones +
                ", indiceCalidad=" + indiceCalidad() +
                '}';
    }

    public boolean esTuNombre(String n) {
        return this.nombre.equals(n);
    }
}
