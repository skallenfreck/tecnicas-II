package co.edu.konradlorenz.view;

import java.util.Scanner;

public class Ventana {
	Scanner sc= new Scanner(System.in);
	
	public static int menu() {
		Ventana objVentana= new Ventana();
		System.out.println("------Menú Principal------\n"
						  +" [1] Error\n"
						  + " [2] Solución\n"
						  + "-------------------------");
		return objVentana.sc.nextInt();
	}
	
	public static void mostranMensaje(String mensaje) {
		System.out.println(mensaje);	
	}
	
	public static String pedirString(String info) {
		Ventana objVentana= new Ventana();
		System.out.println(info);
		return objVentana.sc.nextLine();
	}
	
	public static void espacioVisual() {
		System.out.println("\n");
	}
}
