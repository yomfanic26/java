package com.krakedev.demo.test;

import com.krakedev.demo.Producto;

public class TestPoducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto producto1 = new Producto(00012,"PARACETAMOL");
		producto1.descripcion="PASTILLA PARA TODO";
		producto1.peso=010;
		
		
		System.out.println("CODIGO : " +producto1.codigo);
		System.out.println("NOMBRE : " +producto1.nombre);
		System.out.println("DESCRIPCION : " +producto1.descripcion);
		System.out.println("PESO : " +producto1.peso);

		
		

	}

}
