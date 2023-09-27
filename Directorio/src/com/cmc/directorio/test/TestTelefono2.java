package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Telefono telf = new Telefono("movi","098234234",20);
		
		//2) Crear un objeto AdminTelefono y referenciarlo con la variable at
		AdminTelefono at = new AdminTelefono();
		
		//3) Invocar al método activarMensajería y pasarle como parámetro el objeto referenciado por telf
		at.activarMensajeria(telf);
		
		System.out.println("TELEFONO INICIAL");
		System.out.println(telf.getOperadora()+" "+telf.getNumero()+" "+telf.getCodigo()+" "+telf.isTieneWhatsapp());


	}

}
