package ar.edu.ort.ejercicio12;

import java.util.ArrayList;

public class Centro {
    public static final int LIMITE_DIARIO = 50;
    public static final String MENSAJE = "No hay cupos para hoy";
    private ArrayList<Dia> dias;

    public double revisar() {
        int anotados = 0;
        int cancelados = 0;
        for (Dia d:
        dias) {
            anotados += d.getAnotados();
            cancelados += d.revisar(LIMITE_DIARIO);
        }

    }

    public void mostrarDiaConMasPrioritarios() {

    }
}
