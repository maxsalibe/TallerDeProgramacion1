package ar.edu.ort.ejercicio11;

// Clase de prueba. Testeado el 2022-09-10. Funciona correctamente.
public class Principal {
    public static void main(String[] args) {
        Comercio c = new Comercio();
        Facturable venta1 = new Insumo(TipoInsumo.HARDWARE,
                "Intel Core i3 12100",
                45,
                35000);
        Facturable venta2 = new Insumo(TipoInsumo.PERIFERICO,
                "Asus Prime 610",
                25,
                19000);
        Facturable servicio1 = new ServicioArmado(4);
        Facturable servicio2 = new ServicioArmado(1);
        Facturable servicio3 = new ServicioArmado(2.5);
        Facturable servicio4 = new ServicioArmado(3.5);
        Facturable servicio5 = new ServicioReparacion(6, 5);
        Facturable servicio6 = new ServicioReparacion(1, 1);
        Facturable servicio7 = new ServicioReparacion(2, 2);
        Facturable servicio8 = new ServicioReparacion(5, 4);
        c.agregarVenta(venta1);
        c.agregarVenta(venta2);
        c.agregarVenta(servicio1);
        c.agregarVenta(servicio2);
        c.agregarVenta(servicio3);
        c.agregarVenta(servicio4);
        c.agregarVenta(servicio5);
        c.agregarVenta(servicio6);
        c.agregarVenta(servicio7);
        c.agregarVenta(servicio8);
        System.out.printf("Monto total por ventas: $ %.2f.-\n", c.montoTotalFacturado());
        System.out.printf("Se ha realizado %d servicios de dificultad 1.\n", c.cantServiciosSimples());
    }

}

