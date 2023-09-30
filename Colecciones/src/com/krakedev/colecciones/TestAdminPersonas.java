package com.krakedev.colecciones;

import java.util.ArrayList;

public class TestAdminPersonas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AdminPersona admin = new AdminPersona();
		admin.agregar(new Persona("Mario", "Bennedeti", 25));
		admin.agregar(new Persona("JUan", "Valencia", 40));
		admin.agregar(new Persona("Longo", "Martir", 10));

		admin.imprimir();
		Persona p1 = admin.buscarPorNombre("xx");
		if (p1 != null) {
			System.out.println("Persona Encontrada: " + p1.getApellido() + ":" + p1.getEdad());

		}else {
			System.out.println("No Existe la persona con ese nombre :");
		}
		
		ArrayList<Persona> personasMayores;
		personasMayores=admin.buscarMayores(2);

		System.out.println("Mayores : "+personasMayores.size());
	}

}
