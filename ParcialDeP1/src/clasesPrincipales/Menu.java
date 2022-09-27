package clasesPrincipales;

import interfaces.Ejecutable;
import interfaces.Mostrable;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu implements Mostrable, Ejecutable {
    private String titulo;
    private ArrayList<OpcionDeMenu> items;
    private OpcionDeSalida salida;
    private Scanner input;

    public Menu(String titulo, Scanner input) {
        this.titulo = titulo;
        items = new ArrayList<>();
        salida = new OpcionDeSalida();
        this.input = input;
    }

    public void registrar(OpcionDeMenu opcion) {
        items.add(opcion);
    }

    public void mostrar() {
        for (OpcionDeMenu o: items
             ) {
            o.mostrar();
        }
        salida.mostrar();
    }

    public void ejecutar() {
        mostrar();
        char eleccion;
        OpcionDeMenu opcionElegida = null;
        while (opcionElegida == null) {
            System.out.println("Ingrese la opcion deseada:");
            eleccion = input.nextLine().charAt(0);
            OpcionDeMenu opcionElegida = buscarOpcion(eleccion);
        }
        elegirOpcion(eleccion);
    }

    private void elegirOpcion(char c) {

    }

    private OpcionDeMenu buscarOpcion(char c) {
        OpcionDeMenu opcionBuscada = null;
        int i = 0;
        while (opcionBuscada == null && i < items.size()) {
            if (items.get(i).getCharSelector() == c) {
                opcionBuscada = items.get(i);
            }
        }
        return opcionBuscada;
    }


}
