package com.krakedev.persistencia.test;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestConsultaPersona {

	public static void main(String[] args) {

		try {
			ArrayList<Persona> personas = AdminPersonas.buscarPorNombre("Jonathan");
			if (personas.size() > 0) {
				System.out.println(personas);

			} else {
				System.out.println("No se encontraron resultado de la busqueda");

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		

	}

}
