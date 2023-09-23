package com.krakedev.demo;

public class Producto {
	public int codigo;
	public String nombre;
	public String descripcion;
	public double peso;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
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
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public Producto (int codigo, String nombre) {
		
		this.codigo=codigo;
		this.nombre=nombre;
	}

}

	