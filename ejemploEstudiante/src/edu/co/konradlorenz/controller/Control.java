package edu.co.konradlorenz.controller;

import java.util.ArrayList;

import edu.co.konradlorenz.model.Estudiante;
import edu.co.konradlorenz.view.Registro;

public class Control {
	protected Estudiante objEstudiante = new Estudiante();
	ArrayList<Estudiante> lista = new ArrayList<>();

	public void run() {
		int opcion;
		do {
			boolean a = false;
			long codigoBusqueda = 0;
			Registro.menuInicial();
			opcion = Registro.pedirEntero();
			if (opcion < 1 || opcion > 6) {
				Registro.opcionMal();
				continue;
			}
			switch (opcion) {
			case 1:
				Registro.menuRegistrar();
				Estudiante objNuevoEstudiante = new Estudiante(Registro.pedirNombre(), Registro.pedirCarrera(),
						Registro.pedirCodigo());
				lista.add(objNuevoEstudiante);
				Registro.menuRegistrarSalida();
				break;
			case 2:
				if (lista.isEmpty()) {
					Registro.listaVacia();
					break;
				}
				Registro.menuEliminar();
				while (!a) {
					codigoBusqueda = Registro.pedirCodigo();
					for (int i = 0; i < lista.size(); i++) {
						if (codigoBusqueda == (lista.get(i).getCodigo())) {
							lista.remove(i);
							Registro.menuEliminarSalida();
							a = true;
							break;
						}
					}
					if (!a) {
						Registro.menuEliminarMal();
					}
				}
				break;
			case 3:
				if (lista.isEmpty()) {
					Registro.listaVacia();
					break;
				}
				Registro.menuEditar();
				while (!a) {
					codigoBusqueda = Registro.pedirCodigo();
					for (int i = 0; i < lista.size(); i++) {
						if (codigoBusqueda == (lista.get(i).getCodigo())) {
							lista.get(i).setNombre(Registro.pedirNombre());
							lista.get(i).setCarrera(Registro.pedirCarrera());
							lista.get(i).setCodigo(Registro.pedirCodigo());
							Registro.menuEditarSalida();
							a = true;
							break;
						}
					}
					if (!a) {
						Registro.menuEliminarMal();
					}
				}
				break;
			case 4:
				if (lista.isEmpty()) {
					Registro.listaVacia();
					break;
				}
				Registro.menuBuscar();
				Registro.pedirCodigo();
				while (!a) {
					codigoBusqueda = Registro.pedirCodigo();
					for (int i = 0; i < lista.size(); i++) {
						if (codigoBusqueda == (lista.get(i).getCodigo())) {
							lista.get(i).toString();
							a = true;
							break;
						} else {
							Registro.menuEliminarMal();
							a = false;
						}
					}

				}
				break;
			case 5:
				if (lista.isEmpty()) {
					Registro.listaVacia();
					break;
				}
				Registro.menuLista();
				for (int i = 0; i < lista.size(); i++) {
					String listaImpresa = lista.get(i).toString();
					Registro.menuListaSalida(listaImpresa);
				}
				break;
			case 6:
				Registro.menuSalir();
				break;
			}

		} while (opcion != 6);

	}

}
