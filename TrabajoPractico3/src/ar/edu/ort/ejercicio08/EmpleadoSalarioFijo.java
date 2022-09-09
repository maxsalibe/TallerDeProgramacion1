package ar.edu.ort.ejercicio08;

import java.time.LocalDate;

public class EmpleadoSalarioFijo extends Empleado {
    private static final int TOPE_PRIMER_ESCALAFON = 2;
    private static final int TOPE_SEGUNDO_ESCALAFON = 6;
    private static final int TOPE_TERCER_ESCALAFON = 11;
    private static final double PORCENTAJE_ADICIONAL_PRIMER_ESCALAFON = 0;
    private static final double PORCENTAJE_ADICIONAL_SEGUNDO_ESCALAFON = 5;
    private static final double PORCENTAJE_ADICIONAL_TERCER_ESCALAFON = 10;
    private static final double PORCENTAJE_ADICIONAL_CUARTO_ESCALAFON = 15;
    private double sueldoBasico;
    private double porcentajeAdicional;

    public EmpleadoSalarioFijo(int dni, String nombre, String apellido, int anioIngreso, double sueldoBasico) {
        super(dni, nombre, apellido, anioIngreso);
        setSueldoBasico(sueldoBasico);
        setPorcentajeAdicional();
    }

    private void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    private void setPorcentajeAdicional() {
        int antiguedad = LocalDate.now().getYear() - getAnioIngreso();
        if (antiguedad < TOPE_PRIMER_ESCALAFON) {
            porcentajeAdicional = PORCENTAJE_ADICIONAL_PRIMER_ESCALAFON;
        } else if (antiguedad < TOPE_SEGUNDO_ESCALAFON) {
            porcentajeAdicional = PORCENTAJE_ADICIONAL_SEGUNDO_ESCALAFON;
        } else if (antiguedad < TOPE_TERCER_ESCALAFON) {
            porcentajeAdicional = PORCENTAJE_ADICIONAL_TERCER_ESCALAFON;
        } else {
            porcentajeAdicional = PORCENTAJE_ADICIONAL_CUARTO_ESCALAFON;
        }
    }

    @Override
    public void mostrarSalario() {
        super.mostrarSalario();
        System.out.printf("Sueldo a pagar: $ %.2f\n", sueldoBasico * (1 + porcentajeAdicional / 100));
    }
}
