package ar.edu.ort.ejercicio12;

public class PersonaConObraSocial extends Persona {
    private String nombrePrestador;
    private int numeroAfiliado;

    /*
    Solo lo necesario para testear.
     */
    public PersonaConObraSocial(String nombre, int edad, Motivo motivo) {
        super(nombre, edad, motivo);
    }

    @Override
    public int asignarPrioridad() {
        int prioridad = SIN_PRIORIDAD;
        if (getMotivo() == Motivo.CONTACTO_ESTRECHO || getEdad() >= EDAD_LIMITE) {
            prioridad = MAX_PRIORIDAD;
        }
        return prioridad;
    }
}
