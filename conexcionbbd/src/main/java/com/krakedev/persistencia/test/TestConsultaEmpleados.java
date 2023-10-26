package com.krakedev.persistencia.test;

import java.util.ArrayList;
import java.util.Date;

import com.krakedev.persistencia.entidades.Empleado;
import com.krakedev.persistencia.servicios.AdminEmpleado;
import com.krakedev.persistencia.util.Convertidor;

public class TestConsultaEmpleados {

	public static void main(String[] args) {
		try {
			
			Date fechaNac = Convertidor.convertirFecha("2016/08/14");

			ArrayList<Empleado> empleados = AdminEmpleado.buscarPorParametrps("Miguel",fechaNac);
			if (empleados.size() > 0) {
				System.out.println(empleados);

			} else {
				System.out.println("No se encontraron resultado de la busqueda");

			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
