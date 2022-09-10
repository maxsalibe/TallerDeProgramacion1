package ar.edu.ort.ejercicio09;

public abstract class MedioDePagoElectronico extends MedioDePago {
    private int diasDeDemora;

    public MedioDePagoElectronico(String descripcion, int diasDeDemora) {
        super(descripcion);
        this.diasDeDemora = diasDeDemora;
    }

    public int getDemora() {
        return diasDeDemora;
    }
}
