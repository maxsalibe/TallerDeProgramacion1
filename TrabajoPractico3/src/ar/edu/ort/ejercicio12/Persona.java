package ar.edu.ort.ejercicio12;

public class Persona implements Priorizable, Notificable {
    protected static final int MAX_PRIORIDAD = 1;
    protected static final int SIN_PRIORIDAD = 2;
    protected static final int EDAD_LIMITE = 60;
    private String dni;
    private String nombre;
    private String apellido;
    private int edad;
    private Motivo motivo;


    /*
    Solo lo necesario para testear.
    */
    public Persona(String nombre, int edad, Motivo motivo) {
        this.nombre = nombre;
        this.edad = edad;
        this.motivo = motivo;
    }

    @Override
    public int asignarPrioridad() {
        return MAX_PRIORIDAD;
    }

    @Override
    public void notificar(String mensaje) {
        System.out.println(nombre + " " + apellido + " ha sido notificado.");
    }

    protected int getEdad() {
        return this.edad;
    }

    protected Motivo getMotivo() {
        return this.motivo;
    }

    public boolean tieneObraSocial() {
        return this instanceof PersonaConObraSocial;
    }
}
