package com.krakedev;

public class Rectangulo {
	int base;
	int altura;
	
	public int calcularArea () {
		int area;
		area=base*altura;
		return area;
	}
	
	public double calcularPerimetro () {
		double perimetro;
		perimetro=(base+altura)*2;
		return perimetro;
	   
	}

}
