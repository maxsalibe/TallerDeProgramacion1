package ar.edu.ort.ejercicio14.empleados;

import ar.edu.ort.ejercicio14.empleados.Empleado;

public abstract class EmpleadoCocina extends Empleado {
    private String nombreART;

    public EmpleadoCocina(String nombre, String legajo) {
        super(nombre, legajo);
    }
}
