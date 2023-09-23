package com.krakedev;

public class Mensajeria {
	private String nombre,apellido;

 public void saludar() {
	 System.out.println("HOLA ESTAMOS PROBANDO");
 }
 public void saludarAmigo(String nombre, String apellido) {
	 System.out.println("Hola "+nombre+" "+apellido);
	 
 }
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
 
 
}
