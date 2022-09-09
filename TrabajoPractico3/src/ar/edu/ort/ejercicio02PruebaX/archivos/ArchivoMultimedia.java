package ar.edu.ort.ejercicio02PruebaX.archivos;

public abstract class ArchivoMultimedia extends Archivo {
	private int duracion;
	private boolean reproduciendo;
	
	public ArchivoMultimedia(String nombre, double peso, String path, int duracion) {
		super(nombre, peso, path);
		setDuracion(duracion);
	}
	
	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	
	public int getDuracion() {
		return duracion;
	}

	public void reproducir() {
		reproduciendo = true;
	}
	
	public void parar() {
		reproduciendo = false;
	}
}
