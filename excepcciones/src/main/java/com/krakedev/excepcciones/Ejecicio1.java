package com.krakedev.excepcciones;

public class Ejecicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("inicio");

		String a = "xxx";
		try {
			a.substring(3);
			System.out.println("fin");

		} catch (Exception ex) {
			System.out.println("Entra al catch");

		}finally {
			System.out.println("ingresa a finally");

		}
		System.out.println("Fuera del catch");

	}

}
