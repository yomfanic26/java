package com.krakedev.persistencia.test;

import com.krakedev.persistencia.servicios.AdminEmpleado;

public class TestEliminarEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero_cuenta = (00215);

		try {

			AdminEmpleado.eliminar(numero_cuenta);
			System.out.println("Ejucute eliminar");

		} catch (Exception e) {
			System.out.println(" error en el sistema: " + e.getMessage());
		}

	}

	}

