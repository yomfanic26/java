package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.Cuenta;
import com.krakedev.persistencia.entidades.Usuario;
import com.krakedev.persistencia.servicios.AdminCuentas;
import com.krakedev.persistencia.util.Convertidor;

public class TestInsertarCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Usuario usu = new Usuario("0803473784", "Jonathan", "Valencia", "Ahorro",new BigDecimal(1230.45));
	
		Cuenta c = new Cuenta("01126", usu);
		try {
			Date fechaCre = Convertidor.convertirFecha("2023/12/31");

			c.setFecha_creacion(fechaCre);
			c.setSaldo(new BigDecimal(1230.45));

			AdminCuentas.insertar(c);
			System.out.println("Ejucute insert");

		} catch (Exception e) {
			System.out.println(" error en el sistema: " + e.getMessage());
		}

	}

}
