package edu.co.konradlorenz.model;

public class Forma {
	private double x;
	private double y;
	
	
	public Forma() {
		super();
	}

	public Forma(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Forma [x=" + x + ", y=" + y + "]";
	}
	
	public double area() {
		
		return 0;
	}
	
	public double perimetro() {
		
		return 0;
	}
}
