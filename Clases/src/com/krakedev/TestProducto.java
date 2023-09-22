package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto producto1 = new Producto();
		Producto producto2 = new Producto();
		Producto producto3 = new Producto();

		// Modificando atribruto de productos1
		producto1.nombre = "Paracetamol";
		producto1.descripcion = "Pastilla para todo";
		producto1.precio = 0.45;
		producto1.stokActual = 250;

		// Modificando atribruto de productos2
		producto2.nombre = "Apronax";
		producto2.descripcion = "Pastilla para la cabeza";
		producto2.precio = 0.35;
		producto2.stokActual = 50;

		// Modificando atribruto de productos3
		producto3.nombre = "Pharmaton";
		producto3.descripcion = "Pastilla para la energia";
		producto3.precio = 0.55;
		producto3.stokActual = 75;
		
		System.out.println("Los datos del producto 1 son:");
		System.out.println("Nombre: "+producto1.nombre);
		System.out.println("Descripcion: "+producto1.descripcion);
		System.out.println("Precio: "+producto1.precio);
		System.out.println("Stock: "+producto1.stokActual);
		System.out.println("---------------------------");

		System.out.println("Los datos del producto 2 son:");
		System.out.println("Nombre: "+producto2.nombre);
		System.out.println("Descripcion: "+producto2.descripcion);
		System.out.println("Precio: "+producto2.precio);
		System.out.println("Stock: "+producto2.stokActual);

		System.out.println("---------------------------");

		System.out.println("Los datos del producto 3 son:");
		System.out.println("Nombre: "+producto3.nombre);
		System.out.println("Descripcion: "+producto3.descripcion);
		System.out.println("Precio: "+producto3.precio);
		System.out.println("Stock: "+producto3.stokActual);


	}

}
