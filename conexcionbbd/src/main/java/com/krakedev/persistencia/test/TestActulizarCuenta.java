package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.Cuenta;
import com.krakedev.persistencia.entidades.Usuario;
import com.krakedev.persistencia.servicios.AdminCuentas;
import com.krakedev.persistencia.util.Convertidor;

public class TestActulizarCuenta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Usuario usuAct = new Usuario("0803473784", "Jonathan", "EDUARDO", "CORRIENTE",new BigDecimal(1230.45));
	

		Cuenta cAct = new Cuenta("01126", usuAct);

		try {
			Date fechaAct = Convertidor.convertirFecha("2025/12/31");
			cAct.setFecha_creacion(fechaAct);
			cAct.setSaldo(new BigDecimal(1250.10));

			// Llamas al método actualizar con la nueva instancia
			AdminCuentas.actualizar(cAct);
			System.out.println("Ejucute actulizar");

		} catch (Exception e) {
			System.out.println(" error en el sistema: " + e.getMessage());
		}

	}

}
