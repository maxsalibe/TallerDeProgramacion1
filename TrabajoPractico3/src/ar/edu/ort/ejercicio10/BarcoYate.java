package ar.edu.ort.ejercicio10;

public class BarcoYate extends Barco {
    private int camarotes;

    public BarcoYate(float valorBase, float valorAdicional, String matricula, int eslora, int anioFabricacion, String nombreDuenio, int camarotes) {
        super(valorBase, valorAdicional, matricula, eslora, anioFabricacion, nombreDuenio);
        this.camarotes = camarotes;
    }

    @Override
    public float adicional() {
        return getValorAdicional() * camarotes;
    }
}
