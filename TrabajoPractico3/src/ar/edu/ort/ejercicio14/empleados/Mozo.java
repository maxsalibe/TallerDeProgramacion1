package ar.edu.ort.ejercicio14.empleados;

import ar.edu.ort.ejercicio14.*;

import java.util.ArrayList;

public class Mozo extends EmpleadoConvenio {
    private CategoriaMozo categoria;

    // Para testearlo, agrego en el constructor un restaurante
    public void tomarPedido(Mesa me,
                              Mozo mo,
                              Cocinero c,
                              FormaPago fp,
                              ArrayList<ItemMenu> items,
                              Restaurante r) {
        r.agregarPedido(new Pedido(mo, me, fp, c, items));
    }
}
