package ar.edu.ort.ejercicio07;

public abstract class Figura {
    private String color;

    public Figura(String color) {
        this.color = color;
    }

    public abstract double area();
    public abstract double perimetro();

    @Override
    public String toString() {
        return String.format("%s {color='%s', area=%.2f, perimetro=%.2f}",
                getClass().getSimpleName(),
                color,
                area(),
                perimetro());
    }
}
