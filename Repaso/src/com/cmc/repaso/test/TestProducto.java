package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Producto;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double precioFinal;
		Producto producto = new Producto("GATORADE",-20);
		
		
		producto.setPrecio(-61);
		//obtener precio
		System.out.println(producto.getPrecio());

        // Pobrando calcular precio promo
		precioFinal=producto.calcularPrecioPromo(18);
		System.out.println("EL precio final es : "+precioFinal);
	}

}
