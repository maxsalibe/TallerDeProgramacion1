package ar.edu.ort.ejercicio15;

import java.util.ArrayList;

public class Inmueble {
    private String domicilio;
    private double superficie;
    private int ambientes;
    private double precio;
    private ArrayList<Usuario> interesados;

    public Inmueble(String domicilio, double superficie, int ambientes, double precio) {
        this.domicilio = domicilio;
        this.superficie = superficie;
        this.ambientes = ambientes;
        this.precio = precio;
        interesados = new ArrayList<>();
    }

    public void setPrecio(double nuevoPrecio) {
        if (nuevoPrecio != precio) {
            for (Usuario u :
                    interesados) {
                u.notificar(this.toString(), precio, nuevoPrecio);
            }
        }
        precio = nuevoPrecio;
    }

    @Override
    public String toString() {
        return "Inmueble{" +
                "domicilio='" + domicilio + '\'' +
                ", superficie=" + superficie +
                ", ambientes=" + ambientes +
                '}';
    }
}
