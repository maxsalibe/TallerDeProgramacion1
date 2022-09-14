package ar.edu.ort.ejercicio12;

import java.util.ArrayList;

public class Centro {
    public static final int LIMITE_DIARIO = 3;  // Modificada esta constante para testear.
                                                // Originalmente, era 50.
    public static final String MENSAJE = "No hay cupos para hoy";
    private ArrayList<Dia> dias;

    public Centro() {
        dias = new ArrayList<>();
    }

    public double revisar() {
        int anotados = 0;
        int cancelados = 0;
        for (Dia d:
        dias) {
            anotados += d.getAnotados();
            cancelados += d.revisar(LIMITE_DIARIO, MENSAJE);
        }
        return anotados == 0 ? 0 : cancelados * 100.0 / anotados;
    }

    public void mostrarDiaConMasPrioritarios() {
        int maxPrioritarios = 0;
        Dia diaConMasPrioritarios = null;
        for (Dia d :
                dias) {
            if (d.getPrioritarios() > maxPrioritarios) {
                maxPrioritarios = d.getPrioritarios();
                diaConMasPrioritarios = d;
            }
        }
        System.out.println("El dia con mas prioritarios es el " + diaConMasPrioritarios + ", " +
                "con " + maxPrioritarios + " prioritarios.");
    }

    // Para testear
    public void agregarDia(Dia d) {
        dias.add(d);
    }
}
