package ar.edu.ort.ejercicio15;

public class Cliente extends Usuario {
    private static final String ENCABEZADO = "He recibido un SMS en" +
            " mi telefono %s con el mensaje ";
    private String apellido;
    private String telefono;

    public Cliente(String nombre, String mail, String apellido, String telefono) {
        super(nombre, mail);
        this.apellido = apellido;
        this.telefono = telefono;
    }

    @Override
    public void notificar(String datosInmueble, double precioAnterior, double precioNuevo) {
        System.out.printf(ENCABEZADO + "\n\t\"%s\"", this.telefono,
                Usuario.MENSAJE_GENERAL, datosInmueble, precioAnterior, precioNuevo);
    }
}
