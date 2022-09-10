package ar.edu.ort.ejercicio09;

public class Pase extends MedioDePagoElectronico {
    private static final double DESCUENTO_CON_BAJA_DEMORA = 15;
    private static final double DESCUENTO_CON_ALTA_DEMORA = 12;
    private static final int LIMITE_BAJA_DEMORA = 5;

    public Pase(String descripcion, int diasDeDemora) {
        super(descripcion, diasDeDemora);
    }

    @Override
    public double getDescuento() {
        int demora = getDemora();
        return demora < LIMITE_BAJA_DEMORA ? DESCUENTO_CON_BAJA_DEMORA : DESCUENTO_CON_ALTA_DEMORA;
    }
}
