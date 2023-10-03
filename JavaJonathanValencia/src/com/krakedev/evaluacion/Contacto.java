package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private ArrayList<Telefono> telefonos;

	public Contacto(String cedula, String nombre, String apellido, Direccion direccion) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		
		
		
	}

	public void imprimir() {

		System.out.println("Informacion del contaco:");
		System.out.println("Cedula: " + cedula);
		System.out.println("Nombre: " + nombre);
		System.out.println("Apellido: " + apellido);
		System.out.println("Direccion:");
		System.out.println("  Calle Principal: " + direccion.getCallePrincipal());
		System.out.println("  Calle Secundaria: " + direccion.getCalleSecundaria());

		System.out.println();

	}

	public void imprimir2() {

		System.out.println("***" + nombre + " " + apellido + "***");
		if (direccion.getCallePrincipal() != null || direccion.getCalleSecundaria() != null) {
			System.out.println("Direccion:" + direccion.getCallePrincipal() + " y " + direccion.getCalleSecundaria());
			System.out.println("  Calle Secundaria: " + direccion.getCalleSecundaria());

		} else {
			System.out.println("No tiene asociada una direccion");
		}

	}

	public void agregarTelefono(Telefono telefono) {

		boolean telefonoExistente = false;

		// Crear la lista si aún no existe
		if (telefonos == null) {
			telefonos = new ArrayList<>();
		}
		for (int i = 0; i < telefonos.size(); i++) {
			if (telefonos.get(i).getNumero().equals(telefono.getNumero())) {
				telefonoExistente = true;
				break;
			}
		}

		if (!telefonoExistente) {
			telefonos.add(telefono);
		} else {
			System.out.println("Ya existe el telefono");
		}
	}

	// Mostrar telefonos
	public void mostrarTelefonos() {
		System.out.println("Telefonos con estado 'C' :");

		for (int i = 0; i < telefonos.size(); i++) {
			if (telefonos.get(i).getEstado().equals("C")) {
				System.out.println(
						"Numero: " + telefonos.get(i).getNumero() + ", " + " Tipo: " + telefonos.get(i).getTipo());

			}
		}
	}

	// recuperar incorrectos

	public ArrayList<Telefono> recuperarIncorrectos() {
		 ArrayList<Telefono>  telefonosIncorrectos = new ArrayList<>();
		

		for (int i = 0; i < telefonos.size(); i++) {
			if (telefonos.get(i).getEstado().equals("E")) {
				telefonosIncorrectos.add(telefonos.get(i));

			}

		}
		return telefonosIncorrectos;
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

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}

}
