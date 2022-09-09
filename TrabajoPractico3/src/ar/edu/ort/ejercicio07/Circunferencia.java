package ar.edu.ort.ejercicio07;

public class Circunferencia extends Figura {
    private double radio;

    public Circunferencia(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radio, 2) ;
    }
    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }
}
