package clasesPrincipales;

public class OpcionAccesoAMenu extends OpcionDeMenu {
    private Menu menuSecundario;

    public OpcionAccesoAMenu(String descripcion, char caracter, Menu menuSecundario) {
        super(descripcion, caracter);
        this.menuSecundario = menuSecundario;
    }

    public void ejecutar() {

    }

    public void mostrar() {

    }
}
