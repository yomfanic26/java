package com.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangulo r1 = new Rectangulo();
		Rectangulo r2 = new Rectangulo();

		int areaR1,areaR2;
		double perimetro1,perimetro2;
		r1.base=10;
		r1.altura=5;
		
		r2.base=3;
		r2.altura=15;
		
		
		areaR1 = r1.calcularArea();
		areaR2 = r2.calcularArea();
		
		perimetro1=r1.calcularPerimetro();
		perimetro2=r2.calcularPerimetro();


		System.out.println("El resultado es: "+areaR1);
		System.out.println("El resultado es: "+areaR2);
		System.out.println("---------------");
	    
		System.out.println("El perimtero del triangulo 1 es: "+perimetro1);
		System.out.println("El perimtero del triangulo 2 es: "+perimetro2);
	    
	}

}
