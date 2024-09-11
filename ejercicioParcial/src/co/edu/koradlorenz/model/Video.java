package co.edu.koradlorenz.model;

public class Video {
	private String nombreVideo;
	private String clasificacion;
	private String idioma;
	
	public Video() {
	}

	public Video(String nombreVideo, String clasificacion, String idioma) {
		super();
		this.nombreVideo = nombreVideo;
		this.clasificacion = clasificacion;
		this.idioma = idioma;
	}

	public String getNombreVideo() {
		return nombreVideo;
	}

	public void setNombreVideo(String nombreVideo) {
		this.nombreVideo = nombreVideo;
	}

	public String getClasificacion() {
		return clasificacion;
	}

	public void setClasificacion(String clasificacion) {
		this.clasificacion = clasificacion;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	@Override
	public String toString() {
		return "Video [nombreVideo=" + nombreVideo + ", clasificacion=" + clasificacion + ", idioma=" + idioma + "]";
	}
	
	
	
}
