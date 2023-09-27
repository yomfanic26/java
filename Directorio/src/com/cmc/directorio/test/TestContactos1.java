package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContacto;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Telefono telf = new Telefono("Movi", "096756511", 10);
		Telefono telf2 = new Telefono("Claro", "054897", 5);

		Contacto c = new Contacto();
		Contacto c2 = new Contacto();

		// contacto1
		c.setNombre("MIGUEL");
		c.setPeso(30.5);
		c.setTelefono(telf);

		// contacto 2
		c2.setNombre("JUAN");
		c2.setPeso(60.5);
		c2.setTelefono(telf2);

		AdminContacto ac = new AdminContacto();

		System.out.println("EL CONTACTO MA SPESADO ES");
		Contacto cp = ac.buscarMasPesado(c, c2);
		System.out.println("Nombre: " + cp.getNombre() + " Activo: " + cp.isActivo() + " Operadora: "
				+ cp.getTelefono().getOperadora() + " Telef: " + cp.getTelefono().getNumero() + " Peso: "
				+ cp.getPeso());

		boolean resultado = ac.compararOperadoras(c, c2);
		System.out.println("Pertenecen a la misma operadora: " + resultado);

	}

}
