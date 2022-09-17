package ar.edu.ort.ejercicio14;

import ar.edu.ort.ejercicio14.empleados.Empleado;

import java.util.ArrayList;

public class Restaurante {
    public static final double DESCUENTO_EFVO_PLATOS_NO_VEGANOS = 0.95;
    public static final double DESCUENTO_EFVO_PLATOS_CELIACOS = 0.98;
    public static final double DESCUENTO_EFVO_BEBIDAS_SIN_ALC = 0.90;
    public static final double DESCUENTO_EFVO_BEBIDAS_CON_ALC = 0.97;
    private ArrayList<Mesa> mesas;
    private ArrayList<Empleado> empleados;
    private ArrayList<ItemMenu> menu;
    private ArrayList<Pedido> pedidos;

    public Restaurante() {
        mesas = new ArrayList<>();
        empleados = new ArrayList<>();
        menu = new ArrayList<>();
        pedidos = new ArrayList<>();
    }

    public void pedidosPorCocinero(String legajo) {
        System.out.println("El cocinero legajo nro " + legajo +
                " tiene los siguientes pedidos a su cargo:");
        for (Pedido p :
                pedidos) {
            if (p.esElCocinero(legajo)) {
                System.out.println(p);
            }
        }
    }

    public void liberarMesa(int numeroMesa) {
        Pedido p = buscarPedidoDeLaMesa(numeroMesa);
        System.out.printf("\nImporte a abonar por la mesa %d: $ %.2f.\n", numeroMesa, p == null ? 0 : p.obtenerTotal());
    }

    public Pedido pedidoConMasBebidas(FormaPago fp) {
        int max_bebidas = 0;
        Pedido ped = null;
        for (Pedido p : pedidos
             ) {
            if (p.getCantBebidas() > max_bebidas) {
                max_bebidas = p.getCantBebidas();
                ped = p;
            }
        }
        return ped;
    }

    private Pedido buscarPedidoDeLaMesa (int numeroMesa) {
        int i = 0;
        Pedido p = null;
        while (i < pedidos.size() && p == null) {
            if (pedidos.get(i).esLaMesa(numeroMesa)) {
                p = pedidos.get(i);
            } else {
                i++;
            }
        }
        return p;
    }

    // Para test
    public void agregarPedido(Pedido p) {
        this.pedidos.add(p);
    }
    public void agregarItemMenu(ItemMenu i) {
        menu.add(i);
    }
    public void agregarEmpleado(Empleado e) {
        empleados.add(e);
    }
}
