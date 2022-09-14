package ar.edu.ort.ejercicio12;

import java.util.ArrayList;

public class Dia {
    private String fecha;
    private boolean esHabil;
    public ArrayList<Persona> personas;

    public Dia(String fecha) {
        this.fecha = fecha;
        personas = new ArrayList<>();
    }

    public int revisar(int cupo, String mensaje) {
        int cancelados = 0;
        if (personas.size() > cupo) {
            cancelados = personas.size() - cupo;
            for (int i = cupo; i < personas.size(); i++) {
                personas.get(i).notificar(mensaje);
            }
        }
        return cancelados;
    }

    public int getAnotados() {
        return personas.size();
    }

    public int getPrioritarios() {
        int i = 0;
        boolean recorriTodosLosPrioritarios = false;
        while (i < personas.size() && !recorriTodosLosPrioritarios) {
            if (personas.get(i).asignarPrioridad() != 1) {
                recorriTodosLosPrioritarios = true;
            } else {
                i++;
            }
        }
        return i;
    }
    public double promedioEdadPersonasSinOS() {
        int acumEdades = 0;
        int contadorPersonas = 0;
        for (Persona p :
                personas) {
            acumEdades += p.getEdad();
            contadorPersonas++;
        }
        return contadorPersonas != 0 ? acumEdades * 1.0 / contadorPersonas : 0;
    }

    // Para testear
    public void agregarPersona(Persona p) {
        personas.add(p);
    }

    @Override
    public String toString() {
        return "Dia{" +
                "fecha='" + fecha + '\'' +
                '}';
    }
}
