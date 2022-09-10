package ar.edu.ort.ejercicio09;

public enum CategoriaVehiculo {
    AUTO(50), MOTO(30), CAMION(100);
    private double tarifa;

    CategoriaVehiculo(double tarifa) {
        this.tarifa = tarifa;
    }

    public double getTarifa() {
        return tarifa;
    }
}
