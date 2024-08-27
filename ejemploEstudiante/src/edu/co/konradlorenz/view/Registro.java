package edu.co.konradlorenz.view;

import java.util.Scanner;


public class Registro {
	public static Scanner sc = new Scanner(System.in);

	public static long pedirCodigo() {
		System.out.println("Escribe el codigo del estudiante, por favor :)");
		return sc.nextLong();
	}

	public static String pedirNombre() {
		System.out.println("🗂️ Por favor, ingresa el nombre del estudiante");
		sc.nextLine();
		return sc.nextLine();
	}

	public static String pedirCarrera() {
		System.out.println("Escribe el nombre de la carrera, por favor <3");
		return sc.nextLine();
	}

	public void mostrarEstudiante(String datosEstudiante) {

	}

	public static void menuInicial() {
		System.out.println("    ");
		System.out.println("🌟 ¡Bienvenido al Sistema de Gestión de Estudiantes! 🌟");
		System.out.println("    ");
		System.out.println(
				"Estamos aquí para ayudarte a gestionar la información de nuestros estudiantes de la mejor manera.");
		System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
		System.out.println("┃    🎓  Sistema de Estudiantes   🎓 ┃");
		System.out.println("┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫");
		System.out.println("┃ 1. 📝  Registrar estudiante        ┃");
		System.out.println("┃ 2. ❌  Eliminar estudiante         ┃");
		System.out.println("┃ 3. ✏️  Editar datos de estudiante  ┃");
		System.out.println("┃ 4. 🔎  Buscar estudiante           ┃");
		System.out.println("┃ 5. 📋  Mostrar lista de estudiantes┃");
		System.out.println("┃ 6. ⏏️  Salir del menú              ┃");
		System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
		System.out.println("➡️  Por favor, seleccione una opción: ");
	}

	public static void menuRegistrar() {
		System.out.println("🎉 ¡Genial! Vamos a registrar un nuevo estudiante en nuestra base de datos.");
	}

	public static void menuRegistrarSalida() {
		System.out.println("    ");
		System.out.println("🌟 ¡Felicidades! El estudiante ha sido registrado con éxito. 🌟");
	}

	public static void menuEliminar() {
		System.out.println("🚫 Vamos a eliminar un estudiante que ya no necesita estar en la base de datos.");
	}
	
	public static void menuEliminarMal() {
		System.out.println("❗ Lo siento, no hemos encontrado ningún estudiante con ese codigo en la lista. ¿Podrías intentarlo de nuevo?");
	}
	
	public static void menuEliminarSalida() {
		System.out.println("✅ ¡El estudiante ha sido eliminado exitosamente de la lista! 👍");

	}
	
	public static void listaVacia() {
		System.out.println("📋 \"La lista de estudiantes está vacía en este momento. ¡Añade algunos para que podamos verlos aquí! 😊");
		System.out.println("   ");
	}

	public static void menuEditar() {
		System.out.println("✏️ ¡Vamos a actualizar los datos del estudiante! Por favor, proporciona elcodigo que deseas modificar.");
	}
	public static void menuEditarSalida() {
		System.out.println("✅ ¡Los datos del estudiante han sido actualizados exitosamente! Si necesitas hacer más cambios, no dudes en seleccionarlos del menú.");
	}
	public static void menuMal() {
		System.out.println("✏️ ¡Vamos a actualizar los datos del estudiante! Por favor, proporciona elcodigo que deseas modificar.");
	}
	
	public static void menuBuscar() {
		System.out.println("🔍 ¡Vamos a encontrar la información del estudiante que necesitas!");
	}
	
	public static void menuLista() {
		System.out.println("📋 ¡Aquí está la lista completa de nuestros maravillosos estudiantes!");
		
	}

	public static void menuListaSalida(String a) {
		System.out.println("   ");
		System.out.println(a);
	}

	public static void menuSalir() {
		System.out.println("👋 ¡Hasta luego! Esperamos verte de nuevo pronto.");
	}

	public static void opcionMal() {
		System.out.println("    ");
		System.out.println("⚠️ Opción no válida. Por favor, selecciona una opción del menú y vuelve a intentarlo. 😊");
		System.out.println("    ");
	}

	
	public static int pedirEntero() {
		return sc.nextInt();
		
	}
}
