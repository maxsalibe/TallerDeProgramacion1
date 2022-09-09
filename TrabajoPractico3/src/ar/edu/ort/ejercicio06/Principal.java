package ar.edu.ort.ejercicio06;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Taller t = new Taller();
        ArrayList<Bicicleta> lista = new ArrayList<>();
        agregarBicicleta(lista, "Rosalia", "2000", 2001);
        agregarBicicleta(lista, "Aurorita", "Fantastic", 300);
        agregarBicicleta(lista, "KDT", "Player", 1500);
        agregarBicicleta(lista, "Canaglia", "Number 1", 2300);
        agregarBicicleta(lista, "Nodari", "Champion", 0);
        agregarBiciElectrica(lista, "ABC", "Fastest", 150, 240);
        agregarBiciElectrica(lista, "DEF", "Summum", 3150, 210);
        agregarBiciElectrica(lista, "DEF", "Rapidez", 20, 200);
        agregarBiciElectrica(lista, "Tesla", "Speed", 1999, 251);
        agregarBiciElectrica(lista, "Tesla", "Speed", 1999, 250);
        System.out.println(t.cantServiciosPosibles(lista));
    }

    static void agregarBicicleta(ArrayList<Bicicleta> l, String marca, String modelo, int cantKm) {
        l.add(new Bicicleta(marca, modelo, cantKm));
    }

    static void agregarBiciElectrica(ArrayList<Bicicleta> l, String marca, String modelo, int cantKm, int potencia) {
        l.add(new BiciElectrica(marca, modelo, cantKm, potencia));
    }

}
