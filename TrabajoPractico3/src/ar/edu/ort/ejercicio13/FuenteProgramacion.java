package ar.edu.ort.ejercicio13;

import java.util.ArrayList;

public class FuenteProgramacion extends Fuente {
    private ArrayList<Metodo> metodos;

    @Override
    public double indiceCalidad() {
        double acum = 0;
        for (Metodo m :
                metodos) {
            acum += m.indiceCalidad();
        }
        return metodos.size() == 0 ? 0 : acum / metodos.size();
    }

    public Metodo buscarMetodo(String nombre) {
        int i = 0;
        Metodo m = null;
        while (i < metodos.size() && m == null) {
            if (metodos.get(i).esTuNombre(nombre)) {
                m = metodos.get(i);
            } else {
                i++;
            }
        }
        return m;
    }
}
