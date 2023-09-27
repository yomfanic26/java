package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContacto;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telf = new Telefono("Movi", "096756511", 10);

		Contacto c = new Contacto();
		// contacto1
		c.setNombre("MIGUEL");
		c.setPeso(30.5);
		c.setTelefono(telf);

		// Datos del contacto sin ws
		System.out.println("Datos del contacto");

		System.out.println("Nombre: " + c.getNombre() + " ACTIVO: " + c.isActivo() + " Operadora: "
				+ telf.getOperadora() + " Telef: " + telf.getNumero() + "Tiene WS " + telf.isTieneWhatsapp() + " Peso: "
				+ c.getPeso());

		// Datos del contacto invocando al metodo activar w
		AdminContacto ac = new AdminContacto();
		telf.setTieneWhatsapp(true);
		c.setTelefono(telf);

		ac.activarUsuario(c);

		System.out.println("Datos del contacto");
		System.out.println("Nombre: " + c.getNombre() + " ACTIVO: " + c.isActivo() + " Operadora: "
				+ telf.getOperadora() + " Telef: " + telf.getNumero() + "Tiene WS " + telf.isTieneWhatsapp() + " Peso: "
				+ c.getPeso());

	}

}
