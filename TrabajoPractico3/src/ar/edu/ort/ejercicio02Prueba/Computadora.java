package ar.edu.ort.ejercicio02Prueba;

import java.util.ArrayList;
import java.util.Collections;

import ar.edu.ort.ejercicio02Prueba.archivos.Archivo;
import ar.edu.ort.ejercicio02Prueba.archivos.ArchivoMultimedia;
import ar.edu.ort.ejercicio02Prueba.archivos.ArchivoTexto;
import ar.edu.ort.ejercicio02Prueba.archivos.ArchivoVideo;

public class Computadora {
	private ArrayList<Archivo> archivos;
	
	public Computadora() {
		this.archivos = new ArrayList<>();
	}
	
	public void agregarArchivo(Archivo a) {
		this.archivos.add(a);
		Collections.shuffle(archivos);
	}
	
	public void cerrarTodos() {
		for (Archivo archivo : archivos) {
			archivo.cerrar();
		}
	}
	
	public int cantArchivosDeTexto () {
		int cant = 0;
		for (Archivo archivo : archivos) {
			if (archivo instanceof ArchivoTexto) {
				cant++;
			}
		}
		return cant;
	}
	
	public void cifrarArchivos () {
		for (Archivo archivo : archivos) {
			// Opción 1 
			if (archivo instanceof ArchivoTexto && ((ArchivoTexto) archivo).getCodificacion().equals("UTF-8")) {				
				((ArchivoTexto) archivo).cifrar();
			}
			// Opción 2 
			/*if (archivo instanceof ArchivoTexto) {
				ArchivoTexto at = (ArchivoTexto) archivo;
				if(at.getCodificacion().equals("UTF-8")) {
					at.cifrar();
				}
			}*/
		}
	}
	public double duracionPromedio () {
		int cont = 0;
		double acu = 0;
		for (Archivo archivo : archivos) {
			if (archivo instanceof ArchivoMultimedia) {
				cont++;
				acu += ((ArchivoMultimedia) archivo).getDuracion();
			}
		}
		return (cont > 0 ? acu / cont : 0);
	}
	public ArrayList<ArchivoVideo> videosFullHD () {
		ArrayList<ArchivoVideo> videosFullHD = new ArrayList<>();
		for (Archivo archivo : archivos) {
			if (archivo instanceof ArchivoVideo) {
				ArchivoVideo av = (ArchivoVideo) archivo;
				if(av.sosFullHD()) {
					videosFullHD.add(av);
				}
			}
		}
		return videosFullHD;
	}
	
	public void verArchivos () {
		for (Archivo archivo : archivos) {
			System.out.println(archivo);
		}
	}
}
