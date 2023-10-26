package com.krakedev.persistencia.test;

import java.util.Date;

import com.krakedev.persistencia.entidades.Empleado;
import com.krakedev.persistencia.servicios.AdminEmpleado;
import com.krakedev.persistencia.util.Convertidor;

public class TestInsertarEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado em = new Empleado(00215, "JUAN");
		try {
			Date fecha = Convertidor.convertirFecha("2023/12/31");
			Date hora = Convertidor.convertirHora("14:36");

			em.setFecha(fecha);
			em.setHora(hora);

			AdminEmpleado.insertar(em);
			System.out.println("Ejucute insert");

		} catch (Exception e) {
			System.out.println(" error en el sistema: " + e.getMessage());
		}

	}

}
