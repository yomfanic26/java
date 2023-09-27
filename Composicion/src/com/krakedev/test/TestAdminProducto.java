package com.krakedev.test;

import com.krakedev.composicion.AdminProducto;
import com.krakedev.composicion.Producto;

public class TestAdminProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto mc;
		AdminProducto admin=new AdminProducto();
		Producto productoA = new Producto("Doritos",0.50);
		Producto productoB = new Producto("Papitas",0.50);
		
		mc=admin.BuscarMasCaro(productoA, productoB);
		
		if (mc==null) {
			System.out.println("SON IGUALES");
		}else {
			System.out.println("EL mas caro es : "+mc.getNombre());

		}


	}

}
