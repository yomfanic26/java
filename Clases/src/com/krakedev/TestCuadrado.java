package com.krakedev;

public class TestCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double area1, perimetro1;
		double area2, perimetro2;
		double area3, perimetro3;

		Cuadrado c1 = new Cuadrado();
		Cuadrado c2 = new Cuadrado();
		Cuadrado c3 = new Cuadrado();

		c1.lado = 4;
		c2.lado = 5;
		c3.lado = 3;

		area1 = c1.calcularArea();
		area2 = c2.calcularArea();
		area3 = c3.calcularArea();

		perimetro1 = c1.calcularPerimetro();
		perimetro2 = c2.calcularPerimetro();
		perimetro3 = c3.calcularPerimetro();

		System.out.println("El area uno: " + area1);
		System.out.println("El area dos: " + area2);
		System.out.println("El area tres: " + area3);

		System.out.println("---------------");

		System.out.println("El perimtero del cuadrado 1 es: " + perimetro1);
		System.out.println("El perimtero del cuadrado 2 es: " + perimetro2);
		System.out.println("El perimtero del cuadrado 3 es: " + perimetro3);


	}

}
