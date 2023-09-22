package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Auto auto1 = new Auto();
				Auto auto2 = new Auto();

				// modicar los atributos de auto1
				auto1.marca = "MACLAREN:";
				auto1.anio = 2020;
				auto1.precio = 450.458;

				// modicar los atributos de auto2
				auto2.marca = "CHEVROLET:";
				auto2.anio = 2022;
				auto2.precio = 50.458;

				System.out.println("Marca :" + auto1.marca);
				System.out.println("Año :" + auto1.anio);
				System.out.println("Precio :" + auto1.precio);

				System.out.println("----------------------");
				System.out.println("Marca :" + auto2.marca);
				System.out.println("Año :" + auto2.anio);
				System.out.println("Precio :" + auto2.precio);

	}

}
