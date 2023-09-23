package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcular = new Calculadora();
		double resultadoSuma,resultadoResta;
		double resultadoMultiplicacion,resultadoDivision,resultadoPromedio;
		resultadoSuma= calcular.sumar(10, 20);
		resultadoResta= calcular.restar(10, 20);
		resultadoMultiplicacion= calcular.multiplicar(10, 5);
		resultadoDivision= calcular.dividir(10, 2);
		resultadoPromedio= calcular.promediar(10, 8,9);

		System.out.println("SUMA : "+resultadoSuma);
		System.out.println("RESTA : "+resultadoResta);
		System.out.println("MULTIPLICACION : "+resultadoMultiplicacion);
		System.out.println("DIVISION : "+resultadoDivision);
		System.out.println("PROMEDIO : "+resultadoPromedio);


	}

}
