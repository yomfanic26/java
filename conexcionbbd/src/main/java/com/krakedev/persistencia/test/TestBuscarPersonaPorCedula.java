package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;

public class TestBuscarPersonaPorCedula {

	public static void main(String[] args) {
		try {
			Persona p = AdminPersonas.buscarPorPk("0803473789");
			
			System.out.println(p);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
