package com.krakedev;

public class TestProducto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto producto1 = new Producto();
		Producto producto2 = new Producto();
		Producto producto3 = new Producto();

		// Modificando atribruto de productos1
		producto1.setNombre("Paracetamol"); 
		producto1.setDescripcion("Pastilla para todo");
		producto1.setPrecio(0.45);
		producto1.setStokActual(250);

		// Modificando atribruto de productos2
		producto2.setNombre ("Apronax");
		producto2.setDescripcion ("Pastilla para la cabeza");
		producto2.setPrecio (0.35);
		producto2.setStokActual( 50);

		// Modificando atribruto de productos3
		producto3.setNombre("Pharmaton");
		producto3.setDescripcion("Pastilla para la energia");
		producto3.setPrecio(0.55); 
		producto3.setStokActual(75);
		
		System.out.println("Los datos del producto 1 son:");
		System.out.println("Nombre: "+producto1.getNombre());
		System.out.println("Descripcion: "+producto1.getDescripcion());
		System.out.println("Precio: "+producto1.getPrecio());
		System.out.println("Stock: "+producto1.getStokActual());
		System.out.println("---------------------------");

		System.out.println("Los datos del producto 2 son:");
		System.out.println("Nombre: "+producto2.getNombre());
		System.out.println("Descripcion: "+producto2.getDescripcion());
		System.out.println("Precio: "+producto2.getPrecio());
		System.out.println("Stock: "+producto2.getStokActual());

		System.out.println("---------------------------");

		System.out.println("Los datos del producto 3 son:");
		System.out.println("Nombre: "+producto3.getNombre());
		System.out.println("Descripcion: "+producto3.getDescripcion());
		System.out.println("Precio: "+producto3.getPrecio());
		System.out.println("Stock: "+producto3.getStokActual());


	}

}
