package co.edu.konradlorenz.controller;

import java.io.*;

import co.edu.konradlorenz.model.ArchivoModel;
import co.edu.konradlorenz.view.Ventana;

public class Controller {

	public void run() throws IOException {

		String rutaArchivo = Ventana.pedirString("Por favor ingresa la ruta del archivo.");
		Ventana.espacioVisual();
		int opcion = Ventana.menu();
		Ventana.espacioVisual();
		while (opcion != 0) {
			switch (opcion) {
			case 1:
				ArchivoModel.leerArchivo(rutaArchivo);
				opcion = Ventana.menu();
				break;

			case 2:
				ArchivoModel.leerArchivoConManejo(rutaArchivo);
				opcion = Ventana.menu();
				break;

			case 0:
				System.out.println("Saliendo...");
				break;
			default:
				break;
			}
		}
	}
}
