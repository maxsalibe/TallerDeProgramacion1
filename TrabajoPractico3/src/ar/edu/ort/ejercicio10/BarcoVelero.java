package ar.edu.ort.ejercicio10;

public class BarcoVelero extends Barco {
    private int mastiles;

    public BarcoVelero(float valorBase, float valorAdicional, String matricula, int eslora, int anioFabricacion, String nombreDuenio, int mastiles) {
        super(valorBase, valorAdicional, matricula, eslora, anioFabricacion, nombreDuenio);
        this.mastiles = mastiles;
    }

    @Override
    public float adicional() {
        return mastiles * getValorAdicional();
    }
}
