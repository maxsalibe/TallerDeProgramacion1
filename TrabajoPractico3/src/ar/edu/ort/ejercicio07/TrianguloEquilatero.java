package ar.edu.ort.ejercicio07;

public class TrianguloEquilatero extends Figura {
    private double lado;

    public TrianguloEquilatero(String color, double lado) {
        super(color);
        this.lado = lado;
    }
    @Override
    public double area() {
        double altura = Math.sqrt(Math.pow(lado, 2) - Math.pow(0.5 * lado, 2));
        return 0.5 * lado * altura;
    }
    @Override
    public double perimetro() {
        return 3 * lado;
    }
}
