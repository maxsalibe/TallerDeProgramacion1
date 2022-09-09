package ar.edu.ort.ejercicio02Prueba;

import java.util.ArrayList;

import ar.edu.ort.ejercicio02Prueba.archivos.ArchivoAudio;
import ar.edu.ort.ejercicio02Prueba.archivos.ArchivoTexto;
import ar.edu.ort.ejercicio02Prueba.archivos.ArchivoVideo;

public class Principal {

	public static void main(String[] args) {
		Computadora c = new Computadora();
		c.agregarArchivo(new ArchivoAudio("Bohemian Rapsody", 8954, "C:/Mi buena música", 365, "Queen", "A Night At The Opera", FormatoAudio.MP3));
		c.agregarArchivo(new ArchivoVideo("Volver al futuro", 3800000, "D:/Pelis", 7256, new Dimension(1280,720), FormatoVideo.MPG));
		c.agregarArchivo(new ArchivoVideo("El Padrino", 4975000, "D:/Pelis", 10000, new Dimension(1920,1080), FormatoVideo.MP4));
		c.agregarArchivo(new ArchivoTexto("Machete", 3, "ORT", "windows-1232"));
		c.agregarArchivo(new ArchivoAudio("Uptown Girl", 4500, "C:/Mi buena música", 202, "Billy Joel", "An Innocent Man", FormatoAudio.MP3));
		c.agregarArchivo(new ArchivoTexto("Lista de compras", 5, "Escritorio", "UTF-8"));
		//c.cerrarTodos();
		//System.out.println("Cant de texto: " + c.cantArchivosDeTexto());
		
		//System.out.println("Duracion promedio multimedia: " + c.duracionPromedio());
		//c.verArchivos();
		//c.cifrarArchivos();
		ArrayList<ArchivoVideo> deVideo = c.videosFullHD();
		System.out.println(deVideo);
	}

}
