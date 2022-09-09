package ar.edu.ort.ejercicio03.cartas;

import ar.edu.ort.ejercicio03.Palo;

public class CartaNumeral extends CartaConPalo {
    private int numero;

    public CartaNumeral(Palo palo, int numero) {
        super(palo);
        this.numero = numero;
    }
}
