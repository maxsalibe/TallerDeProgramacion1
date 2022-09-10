package ar.edu.ort.ejercicio11;

import java.util.ArrayList;

public class Comercio {
    private static final int DIFICULTAD_MAX_SERV_SIMPLES = 1;
    private ArrayList<Facturable> historialVentas;

    public Comercio() {
        historialVentas = new ArrayList<>();
    }

    public double montoTotalFacturado() {
        double total = 0;
        for (Facturable f: historialVentas
             ) {
            total += f.facturacion();
        }
        return total;
    }

    public int cantServiciosSimples() {
        int cantidad = 0;
        for (Facturable f: historialVentas
             ) {
            if (f instanceof ServicioReparacion &&
                    ((ServicioReparacion) f).getDificultad() <= DIFICULTAD_MAX_SERV_SIMPLES) {
                cantidad++;
            }
        }
        return cantidad;
    }

    /*
    Metodo para probar
     */
    public void agregarVenta(Facturable f) {
        historialVentas.add(f);
    }
}
