package ar.edu.ort.ejercicio11;

public class ServicioArmado extends Servicio {
    private final static double VALOR_HORA_ARMADO = 250;

    public ServicioArmado(double horas) {
        super(horas);
    }

    @Override
    public double calcularPrecio() {
        return getHoras() * VALOR_HORA_ARMADO;
    }
}
