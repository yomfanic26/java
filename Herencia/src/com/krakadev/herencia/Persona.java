package com.krakadev.herencia;

public class Persona {
	private String cedula;
	private String nombre;

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

	public Persona(String cedula, String nombre) {
		// super();
		this.cedula = cedula;
		this.nombre = nombre;
	}

	// para sobreecribir un metodo se usa mismo nombre misma parametro y mismo
	// retorno
	@Override // arroba con una palabra se conoce como antocion Override: sirve para hacer una
				// validacion este caso valida el nombre y los parametros
	public String toString() {
		return "Persona [cedula=" + cedula + ", nombre=" + nombre + "]";
	}

}
