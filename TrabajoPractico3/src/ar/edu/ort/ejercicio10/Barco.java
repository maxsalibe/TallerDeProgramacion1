package ar.edu.ort.ejercicio10;

public abstract class Barco {
    private float valorBase;
    private float valorAdicional;
    private String matricula;
    private int eslora;
    private int anioFabricacion;
    private String nombreDuenio;

    public Barco(float valorBase, float valorAdicional, String matricula, int eslora, int anioFabricacion, String nombreDuenio) {
        this.valorBase = valorBase;
        this.valorAdicional = valorAdicional;
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
        this.nombreDuenio = nombreDuenio;
    }

    public float precioBase() {
        return eslora * valorBase;
    }

    protected float getValorAdicional() {
        return valorAdicional;
    }

    public abstract float adicional();

    public float alquiler() {
        return precioBase() + adicional();
    }

    public float calcularConsumo() {
        return 0;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                " {matricula='" + matricula + '\'' +
                ", nombreDuenio='" + nombreDuenio + '\'' +
                '}';
    }
}
