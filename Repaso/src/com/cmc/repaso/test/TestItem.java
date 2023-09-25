package com.cmc.repaso.test;

import com.cmc.repaso.entidades.Item;

public class TestItem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Item item = new Item();
		item.setProductosActuales(20);
		item.setNombre("BOLO");
		item.imprimir();

		// Probando metodo vender
		System.out.println("VENDIENDO");
		item.vender(5);
		item.imprimir();

		// Probando metodo devolver
		System.out.println("DEVOLVER");

		item.devolver(2);
		item.imprimir();

		// Creando otro producto
		Item producto2 = new Item();
		producto2.setNombre("AGUA");
		producto2.setProductosActuales(10);
		producto2.imprimir();

		// Probando metodo vender
		System.out.println("VENDER");

		producto2.vender(6);
		producto2.imprimir();

		// Probando metodo DEVOLVER
		System.out.println("DEVOLVER");

		producto2.devolver(2);
		producto2.imprimir();

	}

}
