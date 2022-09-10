package ar.edu.ort.ejercicio11;

public class Insumo implements Facturable {
    private TipoInsumo tipo;
    private String nombre;
    private double porcentajeGanancia;
    private double precioLista;

    public Insumo(TipoInsumo tipo, String nombre, double porcentajeGanancia, double precioLista) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.porcentajeGanancia = porcentajeGanancia;
        this.precioLista = precioLista;
    }

    @Override
    public double facturacion() {
        double conGanancia = Matematica.sumarPorcentaje(precioLista, porcentajeGanancia);
        double conIva = Matematica.sumarPorcentaje(conGanancia, Facturable.IVA);
        return conIva;
    }
}
