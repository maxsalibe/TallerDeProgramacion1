package ar.edu.ort.ejercicio06;

import java.util.ArrayList;



public class Taller {
    public static final int KM_MAX = 2000;
    public static final int POT_MAX = 250;
    public int cantServiciosPosibles(ArrayList<Bicicleta> bicicletas) {
        int cant = 0;
        for (Bicicleta b :
                bicicletas) {
            if (b.reparable()) cant++;
        }
        return cant;
    }
}
