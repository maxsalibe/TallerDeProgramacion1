package ar.edu.ort.ejercicio03.cartas;

import ar.edu.ort.ejercicio03.Palo;

public class CartaFigura extends CartaConPalo {
    private char letra;

    public CartaFigura(Palo palo, char letra) {
        super(palo);
        this.letra = letra;
    }
}
