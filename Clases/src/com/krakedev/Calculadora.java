package com.krakedev;

public class Calculadora {
	private int valor1, valor2, valor3;

	public int getValor1() {
		return valor1;
	}

	public void setValor1(int valor1) {
		this.valor1 = valor1;
	}

	public int getValor2() {
		return valor2;
	}

	public void setValor2(int valor2) {
		this.valor2 = valor2;
	}

	public int getValor3() {
		return valor3;
	}

	public void setValor3(int valor3) {
		this.valor3 = valor3;
	}

	public int sumar(int valor1, int valor2) {
		int resultado;
		resultado = valor1 + valor2;
		return resultado;

	}

	public int restar(int valor1, int valor2) {
		int resultado;
		resultado = valor1 - valor2;
		return resultado;
	}

	public double multiplicar(double valor1, double valor2) {
		double resultado;
		resultado = valor1 * valor2;
		return resultado;
	}

	public double dividir(double valor1, double valor2) {
		double resultado;
		resultado = valor1 / valor2;
		return resultado;
	}

	public double promediar(double valor1, double valor2, double valor3) {
		double resultado;
		resultado = (valor1 + valor2 + valor3) / 3;
		return resultado;
	}

}
