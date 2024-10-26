package co.edu.konradlorenz.model;

import java.io.*;

public class ArchivoModel {
	
	 // Método para leer el archivo sin manejar la excepción
		public static void leerArchivo(String rutaArchivo) throws IOException {
			File archivo = new File(rutaArchivo);

			FileReader leerArchivo = new FileReader(archivo);
			BufferedReader leerBuffer = new BufferedReader(leerArchivo);

			String linea;
			while ((linea = leerBuffer.readLine()) != null) {
				System.out.println(linea);
			}

			leerBuffer.close(); // Cerramos el BufferedReader
		}
		
		// Método para leer el archivo con manejo de excepciones
		
		
	    public static void leerArchivoConManejo(String rutaArchivo) {
	        File archivo = new File(rutaArchivo);
	        
	        try {
	            FileReader leerArchivo = new FileReader(archivo);
	            BufferedReader leerBuffer = new BufferedReader(leerArchivo);
	            
	            String linea;
	            while ((linea = leerBuffer.readLine()) != null) {
	                System.out.println(linea);
	            }
	            
	            leerBuffer.close(); // Cerramos el BufferedReader
	        } catch (IOException e) {
	            System.err.println("Error al leer el archivo: " + e.getMessage());
	        }
	    }
	
}
