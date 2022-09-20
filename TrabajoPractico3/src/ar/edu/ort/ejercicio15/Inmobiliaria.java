package ar.edu.ort.ejercicio15;

import java.util.ArrayList;

public class Inmobiliaria extends Usuario {
    private static final String ENCABEZADO = "Hemos recibido un mail a " +
            "nuestra casilla %s con el mensaje ";
    private double porcentajeComision;
    private ArrayList<Inmueble> inmuebles;

    public Inmobiliaria(String nombre, String mail, double porcentajeComision) {
        super(nombre, mail);
        this.porcentajeComision = porcentajeComision;
        inmuebles = new ArrayList<>();
    }

    @Override
    public void notificar(String datosInmueble, double precioAnterior, double precioNuevo) {
        System.out.printf(ENCABEZADO + "\n\t\"%s\"", getMail(), Usuario.MENSAJE_GENERAL,
                datosInmueble, precioAnterior, precioNuevo);
    }
}
