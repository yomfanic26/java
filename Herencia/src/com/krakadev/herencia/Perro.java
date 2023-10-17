package com.krakadev.herencia;

public class Perro extends Animal {
	
	public Perro () {
		System.out.println("Ejecutando constructor de perro");
	}
 public void ladrar () {
	 System.out.println("Ladrando el perro");
	 
 }
 @Override
 public void saludar() {
	 super.saludar(); //super sirve para llamar al metodo dormir de la clase padre
	 System.out.println("Perro dormido sobreecwito");
 }
}
