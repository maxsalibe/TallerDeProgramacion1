package ar.edu.ort.ejercicio08;

public class Principal {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.agregarEmpleado(new EmpleadoComision(33567900,
                "Mario",
                "Scalabrini",
                1999,
                15,
                3000));
        empresa.agregarEmpleado(new EmpleadoComision(33567800,
                "Raul",
                "Scalabrini",
                2020,
                25,
                1000));
        empresa.agregarEmpleado(new EmpleadoComision(33567600,
                "Maria",
                "Scalabrini",
                2019,
                3,
                2500));
        empresa.agregarEmpleado(new EmpleadoComision(33567500,
                "Marta",
                "Scalabrini",
                2010,
                2,
                700));
        empresa.agregarEmpleado(new EmpleadoComision(33567000,
                "Sofia",
                "Scalabrini",
                1999,
                1,
                30000));
        empresa.agregarEmpleado(new EmpleadoComision(33567100,
                "Mariela",
                "Scalabrini",
                1999,
                0,
                6700));
        empresa.agregarEmpleado(new EmpleadoSalarioFijo(123,
                "Carlos",
                "Gomez",
                2015,
                100000));
        empresa.agregarEmpleado(new EmpleadoSalarioFijo(456,
                "Manuel",
                "Gomez",
                2020,
                200000));
        empresa.agregarEmpleado(new EmpleadoSalarioFijo(789,
                "Jorge",
                "Gomez",
                2010,
                1500));
        empresa.agregarEmpleado(new EmpleadoSalarioFijo(101,
                "Nicolas",
                "Gomez",
                2021,
                106));
        empresa.mostrarSalarios();

    }

}
