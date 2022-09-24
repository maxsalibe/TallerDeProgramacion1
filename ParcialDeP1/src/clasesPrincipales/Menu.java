package clasesPrincipales;

import interfaces.Ejecutable;
import interfaces.Mostrable;

import java.util.ArrayList;

public class Menu implements Mostrable, Ejecutable {
    private String titulo;
    private ArrayList<OpcionAccesoAMenu> opciones;
    private OpcionDeSalida opcionExtra;

    public Menu(String titulo) {
        this.titulo = titulo;
        opciones = new ArrayList<>();
        opcionExtra = new OpcionDeSalida();
    }

    public void registrar(OpcionAccesoAMenu opcion) {
        opciones.add(opcion);
    }

    public void mostrar() {

    }

    public void ejecutar() {

    }


}
