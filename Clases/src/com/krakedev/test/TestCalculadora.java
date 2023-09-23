package com.krakedev.test;

import com.krakedev.Calculadora;

public class TestCalculadora {

	public static void main(String[] args) {
		Calculadora calcular = new Calculadora();
		calcular.setValor1(8);
        calcular.setValor2(6);
        calcular.setValor3(10);
		double resultadoSuma,resultadoResta,resultadoMultiplicacion,resultadoDivision,resultadoPromedio;

         resultadoSuma = calcular.sumar(calcular.getValor1(), calcular.getValor2());
         resultadoResta = calcular.restar(calcular.getValor1(), calcular.getValor2());
         resultadoMultiplicacion = calcular.multiplicar(calcular.getValor1(), calcular.getValor2());
         resultadoDivision = calcular.dividir(calcular.getValor1(), calcular.getValor2());
         resultadoPromedio = calcular.promediar(calcular.getValor1(), calcular.getValor2(),calcular.getValor3());

      
        System.out.println("SUMA : " + resultadoSuma);
        System.out.println("RESTA : " + resultadoResta);
        System.out.println("MULTIPLICACION : " + resultadoMultiplicacion);
        System.out.println("DIVISION : " + resultadoDivision);
        System.out.println("PROMEDIO : " + resultadoPromedio);

    }
}