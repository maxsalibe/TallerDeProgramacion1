package ar.edu.ort.ejercicio12;

public class Persona implements Priorizable, Notificable {
    private String dni;
    private String nombre;
    private String apellido;
    private int edad;
    private Motivo motivo;

    @Override
    public int asignarPrioridad() {

    }

    @Override
    public void notificar(String mensaje) {

    }

    public double promedioEdadPersonasSinOS() {

    }

    protected int getEdad() {
        return this.edad;
    }

    protected Motivo getMotivo() {
        return this.motivo;
    }
}
