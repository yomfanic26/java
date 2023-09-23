package com.krakedev;

public class TesMensajeria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mensajeria mensaje = new Mensajeria();
		mensaje.saludar();
		mensaje.setNombre("MARCOS");
		mensaje.setApellido("Angulo");

		mensaje.saludarAmigo(mensaje.getNombre(),mensaje.getApellido());

	}

}
