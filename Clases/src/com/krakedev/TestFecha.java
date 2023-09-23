package com.krakedev;

public class TestFecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Fecha fecha1 = new Fecha();
		fecha1.setAnio(200);
		fecha1.setMes(12);
		fecha1.setDia(12);*/
		
		Fecha fecha1=new Fecha(2022,03,24);
		
System.out.println("La fecha es :"+fecha1.getAnio()+"/"+fecha1.getMes()+"/"+fecha1.getDia());

	}

}
 