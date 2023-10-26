package com.krakedev.persistencia.test;

import java.util.Date;

import com.krakedev.persistencia.entidades.Empleado;
import com.krakedev.persistencia.servicios.AdminEmpleado;
import com.krakedev.persistencia.util.Convertidor;

public class TestActualizarEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado emAct = new Empleado(00215, "Miguel");

		try {
			Date fecha = Convertidor.convertirFecha("2022/11/30");
			Date hora = Convertidor.convertirHora("15:36");

			emAct.setFecha(fecha);
			emAct.setHora(hora);

			AdminEmpleado.actualizar(emAct);
			System.out.println("Ejucute Actualizar empleao");

		} catch (Exception e) {
			System.out.println(" error en el sistema: " + e.getMessage());
		}

	}

}
