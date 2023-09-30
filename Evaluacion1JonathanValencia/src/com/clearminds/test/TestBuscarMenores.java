package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaquinaDulces maquina = new MaquinaDulces();

		maquina.agregarCelda("A");
		maquina.agregarCelda("B");
		maquina.agregarCelda("C");
		maquina.agregarCelda("D");
		maquina.agregarCelda("E");
		maquina.agregarCelda("F");

		Producto producto1 = new Producto("CH01", "Chuleta", 2.55);
		maquina.cargarProducto(producto1, "A", 4);

		Producto producto2 = new Producto("L123", "Lomo", 2.75);
		maquina.cargarProducto(producto2, "B", 6);
		
		Producto producto3 = new Producto("P401", "Pollo", 1.55);
		maquina.cargarProducto(producto3, "C", 4);

		Producto producto4 = new Producto("L123", "Costilla", 2.75);
		maquina.cargarProducto(producto4, "D", 6);

		Producto producto5 = new Producto("CH01", "Chuleta", 2.55);
		maquina.cargarProducto(producto5, "E", 4);

		Producto producto6 = new Producto("L123", "Lomo", 1.75);
		maquina.cargarProducto(producto6, "F", 6);
		
		ArrayList<Producto> productoSMenores;
		productoSMenores=maquina.buscarMenores(2);
		

		for (int i=0;i<productoSMenores.size();i++) {
		    Producto producto = productoSMenores.get(i); // Obtener el producto actual

		    System.out.println("Código: " + producto.getCodigo());
		    System.out.println("Nombre: " + producto.getNombre());
		    System.out.println("Precio: " + producto.getPrecio());
		    System.out.println("************************");
		    System.out.println("");


		    
		}		

	}

}
