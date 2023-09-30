package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestIncrementarProductos {
	public static void main(String[] args) {
		MaquinaDulces maquina = new MaquinaDulces();
		maquina.agregarCelda("A");
		maquina.agregarCelda("B");
		maquina.agregarCelda("C");
		maquina.agregarCelda("D");

		Producto producto = new Producto("KE34", "Papitas", 0.85);
		Producto producto1 = new Producto("CE35", "Papitas", 2.54);

		maquina.cargarProducto(producto, "B", 4);
		maquina.cargarProducto(producto1, "D", 5);


		maquina.mostrarProductos();

		maquina.incrementarProductos("KE34", 6);

		System.out.println("------------LUEGO DEL INCREMENTO-------------");

		maquina.mostrarProductos();

	}
}
