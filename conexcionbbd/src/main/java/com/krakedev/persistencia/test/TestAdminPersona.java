package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.util.Convertidor;

public class TestAdminPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creo apuntado e intancion utilizando el contructor con parametro
		EstadoCivil ec = new EstadoCivil("U", "Union Libre");
		Persona p = new Persona("0803473723", "Julio", "Jraramillo", ec);
		try {
			Date fechaNac = Convertidor.convertirFecha("2020/12/31");
			Date horaNac = Convertidor.convertirHora("10:00");

			p.setFecha_nacimiento(fechaNac);
			p.setHora_nacimiento(horaNac);
			p.setCantidad_ahorrada(new BigDecimal(1230.45));
			p.setNumero_hijos(50);


			AdminPersonas.insertar(p);
			System.out.println("Ejucute insert");

			
			
		} catch (Exception e) {
				System.out.println(" error en el sistema: "+e.getMessage());
		}
	
			}

}
