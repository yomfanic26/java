package com.krakdev.estaticos.ejercicio.utils;

public class Util {

	public static String FormatearHora(int entero) {
		String numero = entero + "";
		if (numero.length() == 1) {
			numero = "0" + entero;
			return numero;
		} else {
			return numero;
		}
	}

	public static String FormatearDia(int entero) {
		String dia;
		if (entero == 0) {
			return dia = "LUNES";
		} else if (entero == 1) {
			return dia = "MARTES";
		} else if (entero == 2) {
			return dia = "Miercoles";
		} else if (entero == 3) {
			return dia = "JUEVES";
		} else if (entero == 4) {
			return dia = "VIERNES";
		} else if (entero == 5) {
			return dia = "SABADO";
		} else {
			return dia = "DOMINGO";
		}

	}

}
