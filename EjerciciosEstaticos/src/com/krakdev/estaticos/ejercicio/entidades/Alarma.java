package com.krakdev.estaticos.ejercicio.entidades;

import com.krakdev.estaticos.ejercicio.utils.Util;

public class Alarma {
	private int dia;
	private int hora;
	private int minuto;

	public Alarma(int dia, int hora, int minuto) {
		super();
		this.dia = dia;
		this.hora = hora;
		this.minuto = minuto;
	}

	// sobresescribiendo el metodo toString
	@Override
	public String toString() {
		String fortmatoDia= Util.FormatearDia(dia);
		 String formatoHora = Util.FormatearHora(hora);
		return "Alarma [" + fortmatoDia + "," + formatoHora+":"+minuto +"]\n";
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

}
