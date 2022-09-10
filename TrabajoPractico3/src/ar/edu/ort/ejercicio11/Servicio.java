package ar.edu.ort.ejercicio11;

public abstract class Servicio implements Facturable {
    private double horas;

    public Servicio(double horas) {
        setHoras(horas);
    }

    protected double getHoras() {
        return horas;
    }

    @Override
    public double facturacion() {
        double ivaAplicable = Facturable.IVA / 2;
        return Matematica.sumarPorcentaje(calcularPrecio(), ivaAplicable);
    }
    public abstract double calcularPrecio();
    private void setHoras(double horas) {
        if (horas > 0) this.horas = horas;
    }
}
