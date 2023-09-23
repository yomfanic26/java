package com.krakedev;

public class TestAuto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Auto auto1 = new Auto();
				Auto auto2 = new Auto();

				// modicar los atributos de auto1
				auto1.setMarca("MACLAREN");
				auto1.setAnio(2020);
				auto1.setPrecio(450.458);

				// modicar los atributos de auto2
				auto2.setMarca("CHEVROLET");
				auto2.setAnio(2022); 
				auto2.setPrecio(50.458);

				System.out.println("Marca :" + auto1.getMarca());
				System.out.println("Año :" + auto1.getAnio());
				System.out.println("Precio :" + auto1.getPrecio());

				System.out.println("----------------------");
				System.out.println("Marca :" + auto2.getMarca());
				System.out.println("Año :" + auto2.getAnio());
				System.out.println("Precio :" + auto2.getPrecio());

	}

}
