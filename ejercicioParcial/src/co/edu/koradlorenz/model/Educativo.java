package co.edu.koradlorenz.model;

public class Educativo extends Video {

	public Educativo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Educativo(String nombreVideo, String clasificacion, String idioma) {
		super(nombreVideo, clasificacion, idioma);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Detalles del video:\n" + "• Título: " + getNombreVideo() + "\n" + "• Tipo: " + getClasificacion() + "\n"
				+ "• Idioma: " + getIdioma() + ".";
	}

}
