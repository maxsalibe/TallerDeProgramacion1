package ar.edu.ort.ejercicio02.archivos;

public class Archivo {
	private String nombre;
	private double peso;
	private String path;
	private boolean abierto;
	
	public Archivo(String nombre, double peso, String path) {
		super(); // Invoca al constructor de Object
		setNombre(nombre);
		setPeso(peso);
		setPath(path);
		setAbierto(false);
	}
	
	public void cerrar() {
		if (abierto)
			abierto = false;
	}
	
	public void abrir() {
		if (!abierto)
			abierto = true;
	}
	
	/*public void botonEncendido() {
		abierto = !abierto;
	}*/

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setPeso(double peso) {
		this.peso = peso;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public void setAbierto(boolean abierto) {
		this.abierto = abierto;
	}

	@Override
	public String toString() {
		return "Archivo [nombre=" + nombre + ", peso=" + peso + ", path=" + path + ", abierto=" + abierto + "]";
	}
	
	
}
