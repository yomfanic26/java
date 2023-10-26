package com.krakedev.persistencia.test;

import com.krakedev.persistencia.servicios.AdminCuentas;

public class TestEliminarCuenta {

	public static void main(String[] args) {
		String numero_cuenta = ("01126");

		try {

			AdminCuentas.eliminar(numero_cuenta);
			System.out.println("Ejucute eliminar");

		} catch (Exception e) {
			System.out.println(" error en el sistema: " + e.getMessage());
		}

	}

}
