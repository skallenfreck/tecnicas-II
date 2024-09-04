package edu.co.konradlorenz.controller;

import edu.co.konradlorenz.model.Circulo;
import edu.co.konradlorenz.model.Rectangulo;
import edu.co.konradlorenz.view.Vista;

public class Control {
	Circulo objCirculo = new Circulo();
	Rectangulo objRectangulo = new Rectangulo();

	public void run() {
		boolean a = false;
		int opcion = 0;

		while (!a) {
			opcion = Vista.pedir("🔷 ¡Bienvenido al Menú de Figuras Geométricas! 🔶\n" +
   				 "Por favor, elige la figura que deseas seleccionar:\n" +
   				 "╔════════════════════════════════════╗\n" +
   				 "║ 1. ⚪  Círculo                     ║\n" +
   				 "║ 2. ▭  Rectángulo                   ║\n" +
   				 "╚════════════════════════════════════╝\n" +
   				 "➡️  Elige una opción: ");
			if (opcion < 3 && opcion > 0) {
				switch (opcion) {
				case 1:
					circulo();
					break;
				case 2:
					rectangulo();
					break;
				}
				a = true;
			} else {
				Vista.mostarMensaje("🚫 Opción no válida. Por favor, elige una opción del "
						+ "menú de figuras geométricas para continuar.");
			}
		}
	}

	public void circulo() {
		Vista.mostarMensaje(
				"⚪ ¡Has elegido el círculo! 🟠\n" + "Por favor, ingresa las coordenadas del centro (x, y) y "
						+ "el radio del círculo para calcular su perímetro y área:");

		Vista.mostarMensaje("🟠 Primero, ingresa la coordenada x del centro del círculo:");
		objCirculo.setX(Vista.pedirDouble());

		Vista.mostarMensaje("🟠 Ahora, ingresa la coordenada y del centro del círculo:");
		objCirculo.setY(Vista.pedirDouble());

		Vista.mostarMensaje("🟠 Finalmente, ingresa el radio del círculo para calcular su perímetro y área:");
		objCirculo.setRadio(Vista.pedirDouble());

		objCirculo.area();
		objCirculo.perimetro();

		Vista.mostarMensaje(objCirculo.toString());

	}

	public void rectangulo() {
		Vista.mostarMensaje("▭ ¡Has seleccionado el rectángulo! 📏\n"
				+ "Por favor, ingresa las coordenadas del vértice inferior izquierdo (x, y) "
				+ "y los lados del rectángulo para calcular su área y perímetro.");

		Vista.mostarMensaje("📍 Primero, ingresa la coordenada x del rectángulo:");
		objRectangulo.setX(Vista.pedirDouble());

		Vista.mostarMensaje("📍 Ahora, ingresa la coordenada y del rectángulo:");
		objRectangulo.setY(Vista.pedirDouble());

		Vista.mostarMensaje("📐 Ingresa el valor del primer lado o base del rectángulo:");
		objRectangulo.setLado1(Vista.pedirDouble());

		Vista.mostarMensaje("📐 Finalmente, ingresa el valor del segundo lado del rectángulo:");
		objRectangulo.setLado2(Vista.pedirDouble());

		Vista.mostarMensaje(objRectangulo.toString());
	}
}
