package com.krakedev.estaticos.ejercicio.test;

import java.util.ArrayList;

import com.krakdev.estaticos.ejercicio.entidades.Alarma;
import com.krakdev.estaticos.ejercicio.logica.AdminAlarmas;
import com.krakdev.estaticos.ejercicio.utils.DiasSemana;

public class TestAlarmas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alarma a1 = new Alarma(DiasSemana.LUNES, 58, 51);
		Alarma a2 = new Alarma(DiasSemana.LUNES, 7, 51);
		Alarma a3 = new Alarma(DiasSemana.MARTES, 56, 51);
		Alarma a4 = new Alarma(DiasSemana.MIERCOLES, 55, 51);
		Alarma a5 = new Alarma(DiasSemana.VIERNES, 54, 51);

//Recuperar la lista de alarmas

		AdminAlarmas admin = new AdminAlarmas();
		// agregar alarmas
		admin.argegarAlarma(a1);
		admin.argegarAlarma(a2);
		admin.argegarAlarma(a3);
		admin.argegarAlarma(a4);
		admin.argegarAlarma(a5);

//obtener las alrmas
		ArrayList<Alarma> alarmaActuales = admin.getAlarmas();
		System.out.println(alarmaActuales);
	}

}
