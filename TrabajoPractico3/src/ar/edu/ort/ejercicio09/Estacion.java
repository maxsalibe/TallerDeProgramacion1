package ar.edu.ort.ejercicio09;

import java.time.LocalTime;
import java.util.ArrayList;

public class Estacion {
    private String id;
    private String descripcion;
    private ArrayList<Cabina> cabinas;

    public Estacion(String id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
        this.cabinas = new ArrayList<>();
    }

    public static int dameHoraActual() {
        return LocalTime.now().getHour() + 3;
    }

    public ArrayList<Cabina> cabinasConEfectivo() {
        ArrayList<Cabina> cabinasConEfectivo = new ArrayList<>();
        for (Cabina c :
                cabinas) {
            if (c.aceptaEfectivo()) {
                cabinasConEfectivo.add(c);
            }
        }
        return cabinasConEfectivo;
    }

    public double promedioDemora() {
        int cantCabinas = cabinas.size();
        double promedio = -1;
        int acum = 0;
        if (cantCabinas > 0) {
            for (Cabina c:
                 cabinas) {
                    acum += c.getDemora();
            }
            promedio = ((double) acum) / ((double) cantCabinas);
        }
        return promedio;
    }

    /*
    Metodo para pruebas
     */
    public void agregarCabina(Cabina c) {
        cabinas.add(c);
    }
}
