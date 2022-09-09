package ar.edu.ort.ejercicio02;

public class Dimension {
	private int alto;
	private int ancho;
	
	public Dimension(int alto, int ancho) {
		setAlto(alto);
		setAncho(ancho);
	}

	public void setAlto(int alto) {
		this.alto = alto;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	@Override
	public String toString() {
		return ancho + "x" + alto;
	}

	public boolean sosFullHD() {
		return alto == 1920 && ancho == 1080;
	}
}
