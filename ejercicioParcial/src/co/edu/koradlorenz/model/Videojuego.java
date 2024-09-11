package co.edu.koradlorenz.model;

public class Videojuego extends Video {

	public Videojuego() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Videojuego(String nombreVideo, String clasificacion, String idioma) {
		super(nombreVideo, clasificacion, idioma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "El título del video es: " + getNombreVideo() + ", su clasificación o tipo es: " + getClasificacion()
				+ ", y su idioma es: " + getIdioma() + ".";
	}

}
