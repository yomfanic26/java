package com.krakedev.persistencia.test;

import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestEliminar {

	public static void main(String[] args) {
	
		String cedula = ("0803473722");

		try {
			
			AdminPersonas.eliminar(cedula);
			System.out.println("Ejucute eliminar");

		} catch (Exception e) {
			System.out.println(" error en el sistema: " + e.getMessage());
		}

	}

}
