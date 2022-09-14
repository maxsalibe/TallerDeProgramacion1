package ar.edu.ort.ejercicio13;

import java.util.ArrayList;

public class Programa implements Calificable {
    private String id;
    private String nombre;
    private String responsable;
    private boolean pasoPruebasUnitarias;
    private ArrayList<Fuente> fuentes;

    @Override
    public double indiceCalidad() {
        return pasoPruebasUnitarias ? promedioIndiceFuentes() : 0;
    }

    public void mostrarDetalleDeMetodo(String nombreMetodo) {
        Metodo m = buscarMetodo(nombreMetodo);
        System.out.println(m == null ? "El metodo" +
                " no fue encontrado." : m);
    }

    public ArrayList<Fuente> listadoFuentesMayoresAlPromedio() {
        ArrayList<Fuente> fuentesADevolver = new ArrayList<>();
        for (Fuente f :
                fuentes) {
            if (f.indiceCalidad() > promedioIndiceFuentes()) {
                fuentesADevolver.add(f);
            }
        }
        return fuentesADevolver;
    }

    private double promedioIndiceFuentes() {
        double acum = 0;
        for (Fuente f :
                fuentes) {
            acum += f.indiceCalidad();
        }
        return fuentes.size() == 0 ? 0 : acum / fuentes.size();
    }

    private Metodo buscarMetodo(String nombre) {
        Metodo m = null;
        int i = 0;
        while (i < fuentes.size() && m == null) {
            if (fuentes.get(i) instanceof FuenteProgramacion &&
            ((FuenteProgramacion) fuentes.get(i)).buscarMetodo(nombre) != null) {
                m = ((FuenteProgramacion) fuentes.get(i)).buscarMetodo(nombre);
            } else {
                i++;
            }
        }
        return m;
    }
}
