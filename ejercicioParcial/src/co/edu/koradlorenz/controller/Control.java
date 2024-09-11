package co.edu.koradlorenz.controller;

import java.util.LinkedList;

import co.edu.koradlorenz.model.Educativo;
import co.edu.koradlorenz.model.Video;
import co.edu.koradlorenz.model.Videojuego;
import co.edu.koradlorenz.view.Vista;

public class Control {
	Videojuego objVideojuego = new Videojuego();
	Educativo objEducativo = new Educativo();
	LinkedList<Video> lista = new LinkedList<>();
	int opcion = 0;

	public void run() {

		do {
			opcion = Vista.mensajeInicial();
			if (opcion < 1 || opcion > 3) {
				Vista.mostrarMensaje("🚫 Opción no válida. Por favor, elige una opción del menú para continuar.");
			}
			switch (opcion) {
			case 1:
				boolean a = false;
				Vista.mostrarMensaje("🎥 ¿Qué tipo de video te gustaría registrar? (Videojuego o Educativo)\n"
						+ "Por favor, escribe tu elección:");
				while (!a) {
					String tipo = Vista.pedirString();
					if (tipo.equalsIgnoreCase("Videojuego")) {

						Videojuego nuevo = new Videojuego();
						nuevo.setClasificacion(tipo);

						Vista.mostrarMensaje(
								"🎮 ¿Cuál es el nombre del video de tipo videojuego que quieres registrar?");
						nuevo.setNombreVideo(Vista.pedirString());

						Vista.mostrarMensaje("🌍 ¿En qué idioma está disponible el video de videojuego?");
						nuevo.setIdioma(Vista.pedirString());

						a = true;
						lista.add(nuevo);

					} else if (tipo.equalsIgnoreCase("Educativo")) {

						Educativo nuevo = new Educativo();
						nuevo.setClasificacion(tipo);

						Vista.mostrarMensaje("📚 ¿Cuál es el nombre del video educativo que deseas registrar?");
						nuevo.setNombreVideo(Vista.pedirString());

						Vista.mostrarMensaje("🗣️ ¿En qué idioma se presenta el video educativo?");
						nuevo.setIdioma(Vista.pedirString());

						a = true;
						lista.add(nuevo);
					} else {
						Vista.mostrarMensaje("🚫 El tipo de video ingresado no está disponible. "
								+ "Por favor, ingresa 'Videojuego' o 'Educativo'.");
					}

				}
				break;

			case 2:
				if (lista.isEmpty()) {
					Vista.mostrarMensaje("📁 Actualmente, no hay videos registrados en la lista.");
				} else {
					Vista.mostrarMensaje("📋 Aquí está la lista de videos registrados:");
					for (int i = 0; i < lista.size(); i++) {
						String videoDatos = (i + 1) + "). " + lista.get(i).toString() + "\n";
						Vista.mostrarMensaje(videoDatos);
					}
				}
				break;
			case 3:
				int cont = 0;
				for (int i = 0; i < lista.size(); i++) {
					if (lista.get(i) instanceof Educativo) {
						cont += 1;
					}
				}
				if (cont == 0) {
					Vista.mostrarMensaje("📚 Actualmente, no hay videos educativos registrados en la lista.");
				} else {
					Vista.mostrarMensaje("📚 Actualmente, hay " + cont + " video(s) educativo(s) registrado(s).");
				}
				Vista.mensajeFinal();
				break;
			}
		} while (opcion != 3);

	}
}
