package ar.edu.ort.ejercicio07;

public class Principal {
    public static void main(String[] args) {
        GrupoDeFiguras g = new GrupoDeFiguras();
        g.agregarFigura(new Circunferencia("verde", 3.5));
        g.agregarFigura(new Rectangulo("azul", 2.8, 9));
        g.agregarFigura(new TrianguloEquilatero("negro", 14));
        g.mostrarInfoDeFiguras();
    }
}
