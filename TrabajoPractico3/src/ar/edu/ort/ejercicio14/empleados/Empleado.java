package ar.edu.ort.ejercicio14.empleados;

import java.util.Calendar;
import java.util.Date;

public abstract class Empleado {
    private String nombre;
    private String legajo;
    private Calendar fechaIngreso;

    public Empleado(String nombre, String legajo) {
        this.nombre = nombre;
        this.legajo = legajo;
    }

    public boolean esTuLegajo(String l) {
        return legajo.equals(l);
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
