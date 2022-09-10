package ar.edu.ort.ejercicio09;

public class Cabina {
    private static final int INICIO_HORA_PICO_1 = 6;
    private static final int FIN_HORA_PICO_1 = 10;
    private static final int INICIO_HORA_PICO_2 = 17;
    private static final int FIN_HORA_PICO_2 = 20;
    private static final double INCREMENTO_EN_HORA_PICO = 8;
    private int numero;
    private MedioDePago medioDePago;

    public Cabina(int numero, MedioDePago medioDePago) {
        this.numero = numero;
        this.medioDePago = medioDePago;
    }

    public double cobrar(Vehiculo v) {
        double tarifa = v.getTarifa();
        double descuento = medioDePago.getDescuento();
        if (esHoraPico()) {
            tarifa *= (1 + (INCREMENTO_EN_HORA_PICO / 100));
        }
        tarifa *= (1 - (descuento / 100));
        return tarifa;
    }

    public boolean aceptaEfectivo() {
        return medioDePago instanceof MedioDePagoEfectivo;
    }

    public int getDemora() {
        return aceptaEfectivo() ? 0 : (((MedioDePagoElectronico) medioDePago).getDemora());
    }

    private boolean esHoraPico() {
        int horaActual = Estacion.dameHoraActual();
        return (horaActual >= INICIO_HORA_PICO_1 && horaActual <= FIN_HORA_PICO_1) ||
                (horaActual >= INICIO_HORA_PICO_2 && horaActual <= FIN_HORA_PICO_2);
    }

    @Override
    public String toString() {
        return "Cabina{" +
                "numero=" + numero +
                ", medioDePago=" + medioDePago +
                '}';
    }
}
