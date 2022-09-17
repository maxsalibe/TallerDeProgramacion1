package ar.edu.ort.ejercicio13;

import java.sql.Array;
import java.util.ArrayList;

public class Analizador {
    private ArrayList<Programa> programas;

    public Analizador() {
        programas = new ArrayList<>();
    }

    public ArrayList<Programa> programasPorDebajoDe(double umbral) {
        ArrayList<Programa> programasADevolver = new ArrayList<>();
        for (Programa p :
                programas) {
            if (p.indiceCalidad() < umbral) programasADevolver.add(p);
        }
        return programasADevolver;
    }

    // Para test
    public void agregarPrograma(Programa p) {
        programas.add(p);
    }
}
