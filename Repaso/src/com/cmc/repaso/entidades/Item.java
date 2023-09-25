package com.cmc.repaso.entidades;

public class Item {
 private String nombre;
 private int productosActuales;
 private int productosVendidos;
 private int productosDevueltos;
 
 public void imprimir() {
	 System.out.println("**********************");
	 System.out.println(nombre+"\n");
	 System.out.println("Productos Actuales de "+nombre+" "+productosActuales);
	 System.out.println("Productos Vendidos de "+nombre+" "+productosVendidos);
	 System.out.println("Productos Devueltos de "+nombre+" "+productosDevueltos);

 }
 
 public void vender (int productosVendidos) {
	 this.productosActuales-=productosVendidos;
	 this.productosVendidos+=productosVendidos;
	 
 }
 
 public void devolver (int productosVendidos) {
	 this.productosActuales+=productosVendidos;
	 this.productosVendidos-=productosVendidos;
	 this.productosDevueltos+=productosVendidos;

	 
 }

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getProductosActuales() {
	return productosActuales;
}

public void setProductosActuales(int productosActuales) {
	this.productosActuales = productosActuales;
}

public int getProductosVendidos() {
	return productosVendidos;
}

public void setProductosVendidos(int productosVendidos) {
	this.productosVendidos = productosVendidos;
}

public int getProductosDevueltos() {
	return productosDevueltos;
}

public void setProductosDevueltos(int productosDevueltos) {
	this.productosDevueltos = productosDevueltos;
}
 
 
}
