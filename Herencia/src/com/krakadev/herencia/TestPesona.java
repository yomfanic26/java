package com.krakadev.herencia;

public class TestPesona {
	public static void main(String[] args) {
		Persona p = new Persona("0803473784", "Jonathan");

		System.out.println(p.toString());
		System.out.println(p); // cuando ponge el apuntador del objeto solo impliciatme estoy haciendo una
								// llamda a toString

	}
}
