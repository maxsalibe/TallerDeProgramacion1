package ar.edu.ort.ejercicio08;

public class EmpleadoComision extends Empleado {
    private static final double SALARIO_MINIMO = 20000;
    private int nroClientesCaptados;
    private double montoPorCliente;

    public EmpleadoComision(int dni, String nombre, String apellido, int anioIngreso, int nroClientesCaptados, double montoPorCliente) {
        super(dni, nombre, apellido, anioIngreso);
        this.nroClientesCaptados = nroClientesCaptados;
        this.montoPorCliente = montoPorCliente;
    }

    @Override
    public void mostrarSalario() {
        super.mostrarSalario();
        System.out.println("Sueldo a pagar: $ " + (nroClientesCaptados * montoPorCliente < SALARIO_MINIMO ?
                            SALARIO_MINIMO :
                            nroClientesCaptados * montoPorCliente));
    }

    public int getNroClientes() {
        return nroClientesCaptados;
    }
}
