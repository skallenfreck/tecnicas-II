package edu.co.konradlorenz.model;

public class Estudiante {
	private String nombre;
	private String carrera;
	private long codigo;

	public Estudiante(String nombre, String carrera, long codigo) {
		this.nombre = nombre;
		this.carrera = carrera;
		this.codigo = codigo;
	}

	public Estudiante() {
		
	}

	

	@Override
	public String toString() {
		return "Estudiante [nombre= " + nombre + ", carrera= " + carrera + ", codigo= " + codigo + "]";
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
