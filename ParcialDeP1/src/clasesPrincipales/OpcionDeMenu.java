package clasesPrincipales;

import interfaces.Ejecutable;
import interfaces.Mostrable;

public abstract class OpcionDeMenu implements Mostrable, Ejecutable {
    private String descripcion;
    private char caracter;

    public OpcionDeMenu(String descripcion, char caracter) {
        this.descripcion = descripcion;
        this.caracter = caracter;
    }
}
