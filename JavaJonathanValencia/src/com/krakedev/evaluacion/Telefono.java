package com.krakedev.evaluacion;

public class Telefono {

	private String numero;
	private String tipo;
	private String estado;

	public Telefono(String numero, String tipo) {
		boolean verifiacion = false;
		this.numero = numero;
		this.tipo = tipo;
		if (numero != null && tipo != null) {
			if (tipo.equals("Movil") || (tipo.equals("Convencional"))) {

				if (tipo.equals("Movil") && numero.length() == 10) {
					verifiacion = true;
				}
				if (tipo.equals("Convencional") && numero.length() == 7) {
					verifiacion = true;
				}
			}
		}

		if (verifiacion) {
			estado = "C";
		}

		else {
			estado = "E";
		}
	}

	public String getNumero() {
		return numero;
	}

	public String getTipo() {
		return tipo;
	}

	public String getEstado() {
		return estado;
	}

}
