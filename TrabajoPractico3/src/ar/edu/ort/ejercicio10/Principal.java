package ar.edu.ort.ejercicio10;

public class Principal {
    public static void main(String[] args) {
        Puerto p = new Puerto();
        p.agregarAmarra(new Amarra(1, "Aca", false, new BarcoDeportivo(100, 20, "ABC",
                10, 1987, "Maxi", 1500, 3)));
        p.agregarAmarra(new Amarra(1, "Aca", false, new BarcoDeportivo(100, 20, "DEF",
                10, 1987, "Pepito", 1000000, 2)));
        p.agregarAmarra(new Amarra(1, "Mas alla", false, new BarcoDeportivoDeLujo(100, 20, "GHI",
                10, 1987, "Fulanito", 4500, 1)));
        p.agregarAmarra(new Amarra(1, "Ningun lugar", false, new BarcoYate(10, 20, "JKL",
                10, 1987, "YKW", 7)));
        p.agregarAmarra(new Amarra(1, "Algun lugar", false, new BarcoVelero(10, 20, "MNO",
                10, 1987, "YKW", 5)));

        System.out.println("Barco con mayor consumo: " + p.barcoConMayorConsumo());
        System.out.println("Por encima de 300: " + p.barcosConAlquilerMayorA(300));

    }




}
