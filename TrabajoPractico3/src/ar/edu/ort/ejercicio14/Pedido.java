package ar.edu.ort.ejercicio14;

import ar.edu.ort.ejercicio14.empleados.Cocinero;
import ar.edu.ort.ejercicio14.empleados.Mozo;

import java.util.ArrayList;

public class Pedido {
    private Mozo mozo;
    private Mesa mesa;
    private FormaPago formaPago;
    private Cocinero cocinero;
    private ArrayList<ItemMenu> items;

    public Pedido(Mozo mozo, Mesa mesa, FormaPago formaPago, Cocinero cocinero, ArrayList<ItemMenu> items) {
        this.mozo = mozo;
        this.mesa = mesa;
        this.formaPago = formaPago;
        this.cocinero = cocinero;
        this.items = items;
    }

    public boolean esElCocinero(String legajo) {
        return cocinero.esTuLegajo(legajo);
    }

    public double obtenerTotal() {
        double importe = 0;
        for (ItemMenu i :
                items) {
            importe += i.getPrecio(formaPago);
        }
        cerrarMesa();
        return importe;
    }

    private void cerrarMesa() {
        mesa.cerrarMesa();
    }

    public boolean esLaMesa(int numeroMesa) {
        return mesa.sosLaMesa(numeroMesa);
    }

    public int getCantBebidas() {
        int cant = 0;
        for (ItemMenu i: items
             ) {
            if (i instanceof Bebida) {
                cant++;
            }
        }
        return cant;
    }

    @Override
    public String toString() {
        return "\nPedido{" +
                "mozo=" + mozo +
                ", \nmesa=" + mesa +
                ", \nformaPago=" + formaPago +
                ", \ncocinero=" + cocinero +
                ", \nitems=" + items +
                '}';
    }
}
