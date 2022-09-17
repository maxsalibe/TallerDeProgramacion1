package ar.edu.ort.ejercicio14.empleados;

import ar.edu.ort.ejercicio14.*;

import java.util.ArrayList;

public class Mozo extends EmpleadoConvenio {
    private CategoriaMozo categoria;

    public Mozo(String nombre, String legajo) {
        super(nombre, legajo);
    }

    // Para testearlo, agrego en el metodo un restaurante
    public void tomarPedido(Mesa me,
                              Cocinero c,
                              FormaPago fp,
                              ArrayList<ItemMenu> items,
                              Restaurante r) {
        r.agregarPedido(new Pedido(this, me, fp, c, items));
        me.marcarOcupada();
    }
}
