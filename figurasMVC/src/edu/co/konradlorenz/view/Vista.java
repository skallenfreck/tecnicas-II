package edu.co.konradlorenz.view;

import java.util.Scanner;

	public class Vista {
	static Scanner sc= new Scanner(System.in);
	
	public static int pedir(String frase) {
		System.out.println(frase);
		return sc.nextInt();
	}
	
	public static void mostarMensaje(String frase) {
		System.out.println(frase);	
	}
	
	public static double pedirDouble() {
		return sc.nextDouble();
	}
}
