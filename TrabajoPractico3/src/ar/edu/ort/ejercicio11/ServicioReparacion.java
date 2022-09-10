package ar.edu.ort.ejercicio11;

public class ServicioReparacion extends Servicio {
    private static final double VALOR_HORA_REPARACION = 180;
    private static final int DIFICULTAD_MINIMA = 1;
    private static final int DIFICULTAD_MEDIA = 3;
    private static final int DIFICULTAD_MAXIMA = 5;
    private static final double INCREMENTO_DIFICULTAD = 25;
    private int dificultad;

    public ServicioReparacion(double horas, int dificultad) {
        super(horas);
        setDificultad(dificultad);
    }

    public int getDificultad() {
        return dificultad;
    }

    @Override
    public double calcularPrecio() {
        double precio = getHoras() * VALOR_HORA_REPARACION;
        if (dificultad > DIFICULTAD_MEDIA) {
            precio = Matematica.sumarPorcentaje(precio, INCREMENTO_DIFICULTAD);
        }
        return precio;
    }

    private void setDificultad(int dificultad) {
        if (dificultad >= DIFICULTAD_MINIMA && dificultad <= DIFICULTAD_MAXIMA) {
            this.dificultad = dificultad;
        }
    }
}
