package ar.edu.ort.ejercicio10;

public class BarcoDeportivoDeLujo extends BarcoDeportivo {
    public BarcoDeportivoDeLujo(float valorBase, float valorAdicional, String matricula, int eslora, int anioFabricacion, String nombreDuenio, int potenciaMotor, int factorAerodinamico) {
        super(valorBase, valorAdicional, matricula, eslora, anioFabricacion, nombreDuenio, potenciaMotor, factorAerodinamico);
    }

    // 2 * potencia en HP * Índice de cálculo de potencia.
    @Override
    public float calcularConsumo() {
        return 2 * getPotenciaMotor() * INDICE_CALCULO_POTENCIA;
    }
}
