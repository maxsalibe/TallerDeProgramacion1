package ar.edu.ort.ejercicio10;

import java.util.ArrayList;

public class Puerto {
    private ArrayList<Amarra> amarras;

    public Puerto() {
        amarras = new ArrayList<Amarra>();
    }

    public void agregarAmarra(Amarra a) {
        amarras.add(a);
    }

    // barcosConAlquilerMayorA
    public int barcosConAlquilerMayorA(float importe) {
        int cont = 0;
        for (Amarra a :
                amarras) {
            if (a.alquiler() > importe) cont++;
        }
        return cont;
    }

    // barcoConMayorConsumo
    public BarcoDeportivo barcoConMayorConsumo() {
        BarcoDeportivo barquito = null;
        float mayorConsumo = 0;
        for (Amarra a :
                amarras) {
            if (a.getBarco() instanceof BarcoDeportivo && a.consumo() > mayorConsumo) {
                mayorConsumo = a.consumo();
                barquito = (BarcoDeportivo) a.getBarco();
            }
        }
        return barquito;
    }
}
