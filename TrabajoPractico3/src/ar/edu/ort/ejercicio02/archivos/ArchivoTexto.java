package ar.edu.ort.ejercicio02.archivos;

public class ArchivoTexto extends Archivo {
	private String codificacion;

	public ArchivoTexto(String nombre, double peso, String path, String codificacion) {
		super(nombre, peso, path);
		setCodificacion(codificacion);
	}

	public void setCodificacion(String codificacion) {
		this.codificacion = codificacion;
	}
	
	public void cifrar() {
		// Cifrar de mentiritas...
	}

	public String getCodificacion() {
		return codificacion;
	}
	
	
	
}
