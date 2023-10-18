package com.krakdev.estaticos.ejercicio.logica;

import java.util.ArrayList;

import com.krakdev.estaticos.ejercicio.entidades.Alarma;

public class AdminAlarmas {
	private ArrayList<Alarma> alarmas;

	public AdminAlarmas() {
		alarmas = new ArrayList();
	}

	public void argegarAlarma(Alarma alarma) {
		alarmas.add(alarma);
	}

	public ArrayList<Alarma> getAlarmas() {
		return alarmas;
	}

	public void getAlarmas(ArrayList<Alarma> alarmas) {
		this.alarmas = alarmas;
	}

}
