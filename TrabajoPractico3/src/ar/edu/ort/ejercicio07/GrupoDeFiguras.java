package ar.edu.ort.ejercicio07;

import java.util.ArrayList;

public class GrupoDeFiguras {
    private ArrayList<Figura> figuras;

    public GrupoDeFiguras() {
        figuras = new ArrayList<>();
    }

    public void agregarFigura(Figura f) {
        figuras.add(f);
    }

    public void mostrarInfoDeFiguras(){
        for (Figura f :
                figuras) {
            System.out.println(f);
        }
    };
}
