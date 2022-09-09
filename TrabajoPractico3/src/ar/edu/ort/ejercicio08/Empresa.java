package ar.edu.ort.ejercicio08;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> empleados;

    public Empresa() {
        empleados = new ArrayList<>();
    }

    public void mostrarSalarios() {
        for (Empleado e : empleados) {
            e.mostrarSalario();
        }
    }

    public Empleado empleadoConMasClientes() {
        Empleado empleadoADevolver = null;
        int maxClientes = 0;
        for (Empleado e: empleados
             ) {
            if (e instanceof EmpleadoComision && ((EmpleadoComision) e).getNroClientes() > maxClientes) {
                maxClientes = ((EmpleadoComision) e).getNroClientes();
                empleadoADevolver = e;
            }
        }
        return empleadoADevolver;
    }

    // Agrego clases para testearlo
    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }
}
