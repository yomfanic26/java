package com.krakedev;

public class Producto {
	private String nombre;
	private String descripcion;
	private double precio;
	private int stokActual;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getStokActual() {
		return stokActual;
	}
	public void setStokActual(int stokActual) {
		this.stokActual = stokActual;
	}

}
