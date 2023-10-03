package com.krakedev.test;

import com.krakedev.evaluacion.Contacto;
import com.krakedev.evaluacion.Direccion;

public class TestContacto2 {

	public static void main(String[] args) {
		// Crear una instancia de Direccion
		Direccion direccion = new Direccion("Av. siempre Viva", "Calle 4");
		Direccion direccion2 = new Direccion();

		// Crear una instancia de Contacto
		Contacto contacto = new Contacto("1234567890", "Juan", "Pérez", direccion);
		Contacto contacto2 = new Contacto("1234567890", "Ernesto", "Montoya", direccion2);

		// Mostrar información usando el método imprimir
		System.out.println("Información del Contacto:");
		contacto.imprimir2();

		// Mostrar la informacion del contaccto 2
		contacto2.setDireccion(direccion2);

		contacto2.imprimir2();
	}
}
