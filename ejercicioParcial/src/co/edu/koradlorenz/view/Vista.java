package co.edu.koradlorenz.view;

import java.util.Scanner;

public class Vista {
	static Scanner sc= new Scanner(System.in);
	public static int mensajeInicial() {
		System.out.println("🎬 Bienvenido al Clasificador de Videos 📽️\n" +
                			"Por favor, selecciona una de las siguientes opciones:\n" +
                			"╔══════════════════════════════════╗\n" +
                			"║ 1. ➕ Añadir video               ║\n" +
                			"║ 2. 📋 Mostrar videos registrados ║\n" +
                			"║ 3. ⏏️ Salir                      ║\n" +
                			"╚══════════════════════════════════╝");
		int opcion=sc.nextInt();
		sc.nextLine();
		return opcion;
	}
	
	public static void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}
	
	public static String pedirString() {
		return sc.nextLine();
	}
	
	public static void mensajeFinal() {
		System.out.println("Esta bien, hasta luego");
	}
}
