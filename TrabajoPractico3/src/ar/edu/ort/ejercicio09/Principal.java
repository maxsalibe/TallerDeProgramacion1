package ar.edu.ort.ejercicio09;

// Clase de pruebas. Testeado el 2022-09-10 con exito.
public class Principal {
    public static void main(String[] args) {
        Estacion e = new Estacion("ABC", "Una estacion");

        Cabina c1 = new Cabina(1, new Pase("una descripcion", 4));
        Cabina c2 = new Cabina(2, new Pase("una descripcion", 6));
        Cabina c3 = new Cabina(3, new MedioDePagoEfectivo("una descripcion"));
        Cabina c4 = new Cabina(4, new Pase("una descripcion", 8));
        Cabina c5 = new Cabina(5, new Pase("una descripcion", 1));
        Cabina c6 = new Cabina(6, new Pase("una descripcion", 5));
        Cabina c7 = new Cabina(7, new MedioDePagoEfectivo("algo"));
        Cabina c8 = new Cabina(8, new MedioDePagoEfectivo("algo"));

        e.agregarCabina(c1);
        e.agregarCabina(c2);
        e.agregarCabina(c3);
        e.agregarCabina(c4);
        e.agregarCabina(c5);
        e.agregarCabina(c6);
        e.agregarCabina(c7);
        e.agregarCabina(c8);

        System.out.printf("La cabina 1 cobro $ %.2f por un auto\n",
                c1.cobrar(new Vehiculo("123", CategoriaVehiculo.AUTO)));

        System.out.printf("La cabina 2 cobro $ %.2f por una moto\n",
                c2.cobrar(new Vehiculo("123", CategoriaVehiculo.MOTO)));

        System.out.printf("La cabina 3 cobro $ %.2f por un camion\n",
                c3.cobrar(new Vehiculo("123", CategoriaVehiculo.CAMION)));

        System.out.println("Cabinas con pago en efectivo");
        System.out.println(e.cabinasConEfectivo());


        System.out.println("El promedio de demora entre las cabinas" +
                " con pago electronico es de " + e.promedioDemora() + " dias.");

    }
}
