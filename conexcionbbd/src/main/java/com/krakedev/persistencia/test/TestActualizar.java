package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;

import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersonas;
import com.krakedev.persistencia.util.Convertidor;

public class TestActualizar {

	public static void main(String[] args) {
		
		// para actulizar una persona creo otra instancia con la misma cédula
				EstadoCivil ecAct = new EstadoCivil("S", "Soltero");
			    Persona pActualizada = new Persona("0803473723", "Miguel", "Pacho", ecAct);

				try {
					Date fechaAct = Convertidor.convertirFecha("2022/12/31");
					Date horacAct = Convertidor.convertirHora("11:00");
					pActualizada.setFecha_nacimiento(fechaAct);
					
					pActualizada.setHora_nacimiento(horacAct);
					pActualizada.setCantidad_ahorrada(new BigDecimal(1250.10));
					pActualizada.setNumero_hijos(30);
					
				    // Llamas al método actualizar con la nueva instancia
					AdminPersonas.actualizar(pActualizada);
					System.out.println("Ejucute actulizar");

				} catch (Exception e) {
					System.out.println(" error en el sistema: "+e.getMessage());
				}
				

	}

}
