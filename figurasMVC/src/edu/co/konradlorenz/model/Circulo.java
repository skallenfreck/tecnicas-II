package edu.co.konradlorenz.model;

public class Circulo extends Forma{
	protected double radio;

	public Circulo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Circulo(double x, double y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	public Circulo(double x, double y, double radio) {
		super(x, y);
		this.radio = radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	

	@Override
	public String toString() {
		return "Tu círculo esta comformado por: radio= " + radio + ", área= " + area() + ", perímetro= " + perimetro() + ", X= " + getX()
				+ ", Y= " + getY();
	}
	

	public double area() {
		
		return Math.PI*Math.pow(radio, 2);
	}
	
	public double perimetro() {
		
		return (2*Math.PI)*radio;
	}
}
