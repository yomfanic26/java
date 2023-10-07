package com.cmc.evaluacion.entidades;

import java.util.ArrayList;

public class CalculadoraAmortizacion {

	/**
	 * Método para calcular la cuota de un préstamo.
	 */
	public static double calcularCuota(Prestamo prestamo) {
		double cuota;
		double monto = prestamo.getMonto();
		double interes = prestamo.getInteres();
		int plazo = prestamo.getPlazo();

		cuota = (monto * (interes / 12 / 100)) / (1 - Math.pow(1 + ((interes / 12 / 100)), -plazo));
		return cuota;
	}

	/**
	 * Calculae los valores de una cuota.
	 */
	private static void calcularValoresCuota(double interes, Cuota cuotaActual, Cuota cuotaSiguiente) {
		double valorInteres = cuotaActual.getInicio() * (interes / 12 / 100);
		double abonoCapital = cuotaActual.getCuota() - valorInteres;
		double saldo = cuotaActual.getInicio() - abonoCapital;

		cuotaActual.setInteres(valorInteres);
		cuotaActual.setAbonoCapital(abonoCapital);
		cuotaActual.setSaldo(saldo);
		cuotaActual.setCapital(cuotaActual.getInicio()); // Actualizamos el capital

		if (cuotaSiguiente != null) {
			cuotaSiguiente.setInicio(saldo);
		} else {
			cuotaActual.setSaldo(0); // Ajuste para la última cuota
			cuotaActual.setAbonoCapital(cuotaActual.getInicio());
		}
	}

	/**
	 * Genera la tabla de amortización y la carga en el préstamo.
	 */
	public static void generarTabla(Prestamo prestamo) {
		double interes = prestamo.getInteres();
		double valorCuota = calcularCuota(prestamo);
		double monto = prestamo.getMonto();

		for (int i = 1; i <= prestamo.getPlazo(); i++) {
			Cuota nuevaCuota = new Cuota(i);
			nuevaCuota.setCuota(valorCuota);
			nuevaCuota.setInicio(monto);

			prestamo.getCuotas().add(nuevaCuota);

			if (i != prestamo.getPlazo()) {
				Cuota cuotaSiguiente = new Cuota(i + 1); // Crear la siguiente cuota
				calcularValoresCuota(interes, nuevaCuota, cuotaSiguiente);
			} else {
				calcularValoresCuota(interes, nuevaCuota, null); // Última cuota
			}

			monto = nuevaCuota.getSaldo(); // Actualizamos el monto para la siguiente iteración
		}
	}

	/**
	 * Muestra la tabla de amortización del préstamo.
	 */
	public static void mostrarTabla(Prestamo prestamo) {
		System.out.println("Número | Cuota | Capital | Interés | Abono Capital | Saldo");
		ArrayList<Cuota> cuotas = prestamo.getCuotas();

		if (cuotas != null) {
			for (int i = 0; i < cuotas.size(); i++) {
				Cuota elementoCuota = cuotas.get(i);
				elementoCuota.mostrarPrestamo();
			}
		} else {
			System.out.println("La lista de cuotas está vacía");
		}
	}
}
