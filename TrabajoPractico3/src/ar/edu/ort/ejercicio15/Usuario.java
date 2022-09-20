package ar.edu.ort.ejercicio15;

public abstract class Usuario {
    public static final String MENSAJE_GENERAL = "El inmueble %s por el que" +
            " ha demostrado interes cambio su precio de $ %.2f a $ %f.2.";
    private String nombre;
    private String mail;

    public Usuario(String nombre, String mail) {
        this.nombre = nombre;
        this.mail = mail;
    }

    public abstract void notificar(String datosInmueble, double precioAnterior, double precioNuevo);
    public String getMail() {
        return mail;
    }
}
