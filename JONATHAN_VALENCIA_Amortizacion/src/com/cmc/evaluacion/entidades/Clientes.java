package com.cmc.evaluacion.entidades;

public class Clientes {
	private String cedula;
	private String nombre;
	private String apellido;
	
	

	public Clientes() {
	}

	public Clientes(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public void mostarCliente() {
		System.out.println("Cliente registrado :" + nombre + " " + apellido + "[cedula=" + cedula + ", " + "Nombre="
				+ nombre + ", " + "Apellido=" + apellido);

	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	

}
