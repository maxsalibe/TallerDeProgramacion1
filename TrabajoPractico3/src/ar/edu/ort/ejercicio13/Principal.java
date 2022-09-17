package ar.edu.ort.ejercicio13;

// Testeado en 2022-09-17. Pruebas OK.
public class Principal {
    public static void main(String[] args) {
        Analizador a = new Analizador();
        Programa p1 = new Programa("ab1",
                "Super tablas",
                "Juan Manuel",
                false);
        Programa p2 = new Programa("ab2",
                "Estilos",
                "Angelina",
                true);
        Programa p3 = new Programa("ab3",
                "Textos 3000",
                "Simon",
                false);
        Programa p4 = new Programa("ab4",
                "Base de datos 2022",
                "Maximiliano",
                true);
        Metodo m1 = new Metodo("Calcular algo", 5, 1, 1);
        Metodo m2 = new Metodo("Sumar algo", 15, 7, 5);
        Metodo m3 = new Metodo("Subrayar algo", 3, 12, 2);
        Metodo m4 = new Metodo("Almacenar algo", 2, 10, 10);
        Metodo m5 = new Metodo("Formatear algo", 0, 9, 20);
        FuenteProgramacion f1 = new FuenteProgramacion("Java", "~/Sources/JDK18");
        FuenteProgramacion f2 = new FuenteProgramacion("Python", "~/Sources/Python3_0");
        FuenteProgramacion f3 = new FuenteProgramacion("JavaScript", "~/Sources/ES2016");
        FuenteProgramacion f4 = new FuenteProgramacion("SQL", "~/Sources/DB");
        FuenteProgramacion f5 = new FuenteProgramacion("C#", "~/Sources/dotNET");
        f1.agregarMetodo(m1);
        f1.agregarMetodo(m2);
        f1.agregarMetodo(m5);
        f2.agregarMetodo(m2);
        f2.agregarMetodo(m4);
        f3.agregarMetodo(m2);
        f3.agregarMetodo(m4);
        f3.agregarMetodo(m5);
        f4.agregarMetodo(m3);
        f5.agregarMetodo(m1);
        f5.agregarMetodo(m2);
        FuenteMarcado f10 = new FuenteMarcado("HTML", "~/Sources/HTML5", 4500);
        FuenteMarcado f11 = new FuenteMarcado("XML", "~/Sources/XML", 300);
        p1.agregarFuente(f1);
        p1.agregarFuente(f4);
        p1.agregarFuente(f10);
        p2.agregarFuente(f3);
        p2.agregarFuente(f5);
        p3.agregarFuente(f11);
        p3.agregarFuente(f2);
        p3.agregarFuente(f5);
        p4.agregarFuente(f1);
        p4.agregarFuente(f2);
        p4.agregarFuente(f3);
        p4.agregarFuente(f4);
        p4.agregarFuente(f5);
        a.agregarPrograma(p1);
        a.agregarPrograma(p2);
        a.agregarPrograma(p3);
        a.agregarPrograma(p4);
        System.out.println(a.programasPorDebajoDe(8));
    }
}
