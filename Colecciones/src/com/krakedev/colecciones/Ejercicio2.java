package com.krakedev.colecciones;

import java.util.ArrayList;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Persona> personas;
		personas = new ArrayList<Persona>();

		Persona p1 = new Persona("Jonahtan", "Valencia"); // ocpicone 1 instancia el objeto y luego el objeto lo
															// refernecio con la varibales y lueogf le paso el objeto
		personas.add(p1);

		personas.add(new Persona("Leo", "Mesi"));// opcion2 de añadir un objeto de tipo persona
		personas.add(new Persona("Cristiano", "Ronaldo"));
		personas.add(new Persona("Thiago", "Loor"));
		
		System.out.println(personas.size());
		Persona elementoPersona;
		for (int i=0;i<personas.size();i++) {
			elementoPersona=personas.get(i);
			System.out.println("Persona: "+elementoPersona.getNombre()+"--"+elementoPersona.getApellido());
		}

	}

}
