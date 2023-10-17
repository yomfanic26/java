package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private ArrayList<Contacto> contactos;
	private Date fechaModificacion;
	private ArrayList<Contacto> correctos;
	private ArrayList<Contacto> incorrectos;

	public Directorio() {
		contactos = new ArrayList<>();
		fechaModificacion = new Date();
	}

	public boolean agregarContacto(Contacto contacto) {
		if (contactos == null) {
			contactos = new ArrayList<>();
		}
		Contacto resultadoBusqueda = buscarPorCedula(contacto.getCedula());

		if (resultadoBusqueda == null) {
			contactos.add(contacto);
			fechaModificacion = new Date(); // Actualizar fecha de modificación
			return true;
		} else {
			return false;
		}
	}

	public Contacto buscarPorCedula(String cedula) {
		Contacto contactoEncontrado = null;
		boolean existeContacto = false;

		if (contactos != null) {
			for (int i = 0; i < contactos.size(); i++) {
				if (contactos.get(i).getCedula().equals(cedula)) {
					contactoEncontrado = contactos.get(i);
					existeContacto = true;
					break;
				}

			}
		} else {
			System.out.println("La lista conactos esta vacia");
		}

		if (existeContacto) { // si contacto es verdadero
			return contactoEncontrado;

		} else {

			return null;

		}
	}

	public String consultarUltimaModificacion() {
		SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss"); // delcaro una favriame de tipo
																				// SimpelFormato qu permite obtener la
																				// fecha
		return formato.format(fechaModificacion);
	}

	public int contarPerdidos() {
		int acu = 0;
		if (contactos == null) {
			contactos = new ArrayList<>();
		}
		for (int i = 0; i < contactos.size(); i++) {
			Direccion direccion = contactos.get(i).getDireccion();
			if (direccion == null || direccion.getCallePrincipal() == null || direccion.getCalleSecundaria() == null) {
				acu += 1;
			}
		}
		return acu;
	}

	public int contarFijos() {
		int acu = 0;
		if (contactos == null) {
			contactos = new ArrayList<>();
		}
		for (int i = 0; i < contactos.size(); i++) {
			ArrayList<Telefono> telefonos = contactos.get(i).getTelefonos(); // obteno la lista de telfono

			if (telefonos != null) { // verifico que telefono no sean null
				for (int j = 0; j < telefonos.size(); j++) {
					Telefono telefono = telefonos.get(j); // ontemgo laposicion de cada telfono
					String tipo = telefono.getTipo();
					String estado = telefono.getEstado();
					if (tipo.equals("Convencional") && estado.equals("C")) {
						acu += 1;
					}
				}
			}
		}
		return acu;

	}

	// Agrgero los contacto correctos e incorrecto a su respectivos arrays y elimino
	// la lista de contactos
	public void depurar() {
		correctos = new ArrayList<>();
		incorrectos = new ArrayList<>();
		if (contactos == null) {
			contactos = new ArrayList<>();
		}
		for (int i = 0; i < contactos.size(); i++) {
			Direccion direccion = contactos.get(i).getDireccion();
			if (direccion == null || direccion.getCallePrincipal() == null || direccion.getCalleSecundaria() == null) {

				incorrectos.add(contactos.get(i));

			} else {
				correctos.add(contactos.get(i));

			}
		}
		contactos.clear();
	}

	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}

	public void setCorrectos(ArrayList<Contacto> correctos) {
		this.correctos = correctos;
	}

	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}

	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}

	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}

}
