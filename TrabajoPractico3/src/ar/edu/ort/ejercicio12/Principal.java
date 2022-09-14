package ar.edu.ort.ejercicio12;
// Testeado con exito en 2022-09-14
public class Principal {
    public static void main(String[] args) {
        Centro c = new Centro();
        Dia d1 = new Dia("2022-09-12");
        Dia d2 = new Dia("2022-09-13");
        Dia d3 = new Dia("2022-09-14");
        d1.agregarPersona(new Persona("Mariano", 39, Motivo.CONTACTO_ESTRECHO));
        d1.agregarPersona(new Persona("Ana", 60, Motivo.VIAJE));
        d1.agregarPersona(new PersonaConObraSocial("Luciano", 61, Motivo.VIAJE));
        d1.agregarPersona(new PersonaConObraSocial("Carlos", 49, Motivo.CONTACTO_ESTRECHO));
        d2.agregarPersona(new PersonaConObraSocial("Carla", 49, Motivo.CONTACTO_ESTRECHO));
        d2.agregarPersona(new Persona("Marta", 39, Motivo.VIAJE));
        d2.agregarPersona(new Persona("Isabel", 59, Motivo.REPETICION_POR_ERROR));
        d2.agregarPersona(new PersonaConObraSocial("Gaston", 57, Motivo.VIAJE));
        d3.agregarPersona(new Persona("Fermin", 79, Motivo.VIAJE));
        d3.agregarPersona(new PersonaConObraSocial("Marcela", 99, Motivo.VIAJE));
        d3.agregarPersona(new PersonaConObraSocial("Anderson", 57, Motivo.CONTACTO_ESTRECHO));
        d3.agregarPersona(new Persona("Raul", 59, Motivo.REPETICION_POR_ERROR));
        c.agregarDia(d1);
        c.agregarDia(d2);
        c.agregarDia(d3);
        System.out.printf("Hubo %.2f%% cancelaciones.\n", c.revisar());
        c.mostrarDiaConMasPrioritarios();
        System.out.println("El promedio de edad sin OS en el dia 1 es: " + d1.promedioEdadPersonasSinOS());
    }
}
