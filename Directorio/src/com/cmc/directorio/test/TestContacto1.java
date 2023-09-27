package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telf = new Telefono ("Movi","096756511",10);
		Contacto c = new Contacto();
		c.setNombre("MIGUEL");
		c.setActivo(true);
		c.setPeso(30.5);
		c.setTelefono(telf);
		
		System.out.println("Datos del contacto");

		System.out.println("Nombre: " + c.getNombre() + " Activo: " + c.isActivo() + " Operadora: "
				+ telf.getOperadora() + " Telef: " + telf.getNumero() + " Peso: " + c.getPeso());


	}

}
