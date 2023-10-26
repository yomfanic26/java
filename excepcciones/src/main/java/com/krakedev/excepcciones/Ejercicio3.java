package com.krakedev.excepcciones;

import java.io.File;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Ejercicio3 {
	private static final Logger LOGGER = LogManager.getLogger(Ejercicio3.class);

	public void metodo1() {
		String a = null;
		
		try {
			a.substring(0);// IoException - CHEKED

		} catch (Exception ex) {
			System.out.println("error");
			LOGGER.error("Error al obtener la subcadena",ex); //logea el mensaje de erro y admas va ha dar el stack trace(rastreo de pila)
		}

	}
	
	public static void main (String [] args) {
		Ejercicio3 eje = new Ejercicio3();
		eje.metodo1();
	}
	
}
