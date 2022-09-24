package clasesPrincipales;

public class OpcionDeSalida extends OpcionDeMenu {
    private static final String DESCRIPCION_SALIDA = "SALIR";
    private static final char CARACTER_SALIDA = 'X';

    public OpcionDeSalida() {
        super(DESCRIPCION_SALIDA, CARACTER_SALIDA);
    }

    public void ejecutar(){}
    public void mostrar(){}
}
