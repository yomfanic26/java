package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		Telefono telf = new Telefono("movi", "098234234", 20);
		Telefono telf2 = new Telefono("claro", "0969293599", 5);
		Telefono telf3 = new Telefono("movi", "054879856", 2);


		// 2) Crear un objeto AdminTelefono y referenciarlo con la variable at
		AdminTelefono at = new AdminTelefono();

		// 3) Invocar al método activarMensajería y pasarle como parámetro el objeto
		// referenciado por telf
		int resultado = at.contarMovi(telf,telf2,telf3);

		
		System.out.println("Ek total de numero de telfonos de la compañia movi son:"+resultado);
	}

}
