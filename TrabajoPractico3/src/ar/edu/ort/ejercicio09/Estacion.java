package ar.edu.ort.ejercicio09;

import java.time.LocalDate;
import java.time.LocalTime;

public class Estacion {
    public static int dameHoraActual() {
        return LocalTime.now().getHour();
    }
}
