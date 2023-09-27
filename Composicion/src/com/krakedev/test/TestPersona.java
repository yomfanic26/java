package com.krakedev.test;

import com.krakedev.composicion.Direccion;
import com.krakedev.composicion.Persona;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona persona1 = new Persona();
	
		persona1.setNombre("MIGUEL");
		
		// creo una nueva direccio y seteo sus atrivutos
		Direccion d1= new Direccion();	
		d1.setCallePrincipal("AV Jaime Hurtado Gonzales");
		d1.setCalleSecundaria("CAlle I");
		d1.setNumero("M-25");
		d1.setLatitud(45.10);
		d1.setLongitud(10);
		
		//seteo altributo tipo clase de direccion
		persona1.setDireccion(d1);
		
	
	
		String nombre=persona1.getNombre();
		Direccion dir=persona1.getDireccion();
		
		System.out.println(nombre);
		System.out.println(dir.getCallePrincipal());
		
		//null.algunMetodo();
		// esto se da cuando la variable esta null y trato de invocar a un metodo con esa variablke
		
		
		persona1.imprimir();
		
		Persona p2 = new Persona();
		p2.setApellido("LONGO");

		
		Direccion d2= new Direccion("LON MANGO","CALLE T","M-20");
		p2.setDireccion(d2);
		p2.imprimir();
		
		Persona p3 = new Persona();
		p3.setDireccion(new Direccion("MUNDO","Calle x","T-50"));// puedo setear y le pase el objeto direccion
		p3.imprimir();

	}

}
