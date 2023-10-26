package com.krakedev.excepcciones;

import java.io.File;
import java.io.IOException;

public class Ejercicio2 {
		public void metodo2() {
		File f = new File("arhivo1.txt");
		try {
			f.createNewFile();// IoException - CHEKED

		} catch (IOException ex) {
			System.out.println("error");
		}

	}
}
