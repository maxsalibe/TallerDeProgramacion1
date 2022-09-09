package ar.edu.ort.ejercicio02Prueba.archivos;

import ar.edu.ort.ejercicio02Prueba.FormatoAudio;

public class ArchivoAudio extends ArchivoMultimedia {
	private String artista;
	private String album;
	private FormatoAudio formato;
	
	public ArchivoAudio(String nombre, double peso, String path, int duracion, String artista, String album,
			FormatoAudio formato) {
		super(nombre, peso, path, duracion);
		this.artista = artista;
		this.album = album;
		this.formato = formato;
	}
	
	
}
