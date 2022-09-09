package ar.edu.ort.ejercicio10;

public class BarcoDeportivo extends Barco {
    public static final float INDICE_CALCULO_POTENCIA = (float) 0.35;
    private int potenciaMotor;
    private int factorAerodinamico;

    public BarcoDeportivo(float valorBase, float valorAdicional, String matricula, int eslora, int anioFabricacion, String nombreDuenio, int potenciaMotor, int factorAerodinamico) {
        super(valorBase, valorAdicional, matricula, eslora, anioFabricacion, nombreDuenio);
        this.potenciaMotor = potenciaMotor;
        this.factorAerodinamico = factorAerodinamico;
    }

    @Override
    public float adicional() {
        return (float) (getValorAdicional() * 0.5 * potenciaMotor);
    }

    @Override
    public float calcularConsumo() {
        return potenciaMotor / factorAerodinamico * INDICE_CALCULO_POTENCIA;
    }

    protected int getPotenciaMotor() {
        return potenciaMotor;
    }

}

