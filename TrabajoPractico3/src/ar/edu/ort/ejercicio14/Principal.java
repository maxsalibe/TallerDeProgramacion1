package ar.edu.ort.ejercicio14;

import ar.edu.ort.ejercicio14.empleados.Cocinero;
import ar.edu.ort.ejercicio14.empleados.Mozo;

import java.util.ArrayList;

// Testeado con exito en 2022-09-17.

public class Principal {
    public static void main(String[] args) {
        Restaurante r = new Restaurante();
        Mesa m1 = new Mesa(1);
        Mesa m2 = new Mesa(2);
        Mesa m3 = new Mesa(3);
        ItemMenu item1 = new Plato("Ravioles", 780, false, false);
        ItemMenu item2 = new Plato("Ensalada", 590, true, true);
        ItemMenu item3 = new Plato("Lechon", 1100, false, false);
        ItemMenu item4 = new Bebida("Coca", 350, false);
        ItemMenu item5 = new Bebida("Agua", 275, false);
        ItemMenu item6 = new Bebida("Vino", 550, true);
        Cocinero c1 = new Cocinero("Ezequiel", "coci1");
        Cocinero c2 = new Cocinero("Marina", "coci2");
        r.agregarEmpleado(c1);
        r.agregarEmpleado(c2);
        Mozo mo1 = new Mozo("Jorge", "moz1");
        Mozo mo2 = new Mozo("Luciana", "moz2");
        Mozo mo3 = new Mozo("Yanina", "moz3");
        r.agregarEmpleado(mo1);
        r.agregarEmpleado(mo2);
        r.agregarEmpleado(mo3);
        ArrayList<ItemMenu> itemsMesa1 = new ArrayList<>();
        ArrayList<ItemMenu> itemsMesa2 = new ArrayList<>();
        ArrayList<ItemMenu> itemsMesa3 = new ArrayList<>();
        itemsMesa1.add(item1);
        itemsMesa1.add(item1);
        itemsMesa1.add(item5);
        itemsMesa1.add(item5);
        itemsMesa2.add(item3);
        itemsMesa2.add(item2);
        itemsMesa2.add(item1);
        itemsMesa2.add(item4);
        itemsMesa2.add(item4);
        itemsMesa2.add(item6);
        itemsMesa3.add(item2);
        itemsMesa3.add(item5);
        mo1.tomarPedido(m1, c1, FormaPago.EFECTIVO, itemsMesa1, r);
        mo2.tomarPedido(m2, c1, FormaPago.DEBITO, itemsMesa2, r);
        mo3.tomarPedido(m3, c2, FormaPago.CREDITO, itemsMesa3, r);
        r.pedidosPorCocinero("coci1");
        r.pedidosPorCocinero("coci2");
        r.liberarMesa(1);
        r.liberarMesa(2);
        r.liberarMesa(3);
        System.out.println("\nPedido con mas bebidas:");
        System.out.println(r.pedidoConMasBebidas(FormaPago.EFECTIVO));

    }
}
