package com.cmc.evaluacion.entidades;

import java.util.ArrayList;

public class Prestamo {
	private double monto;
	private double interes;
	private int plazo;
	private ArrayList<Cuota> cuotas;
	private ArrayList<Clientes> clientes;

	public Prestamo() {
		this.cuotas = new ArrayList<>(); // Inicializa la lista de cuotas
		this.clientes = new ArrayList<>(); // Inicializa la lista de clientes
	}

	//
	public Prestamo(double monto, double interes, int plazo) {
		this.monto = monto;
		this.interes = interes;
		this.plazo = plazo;
		this.cuotas = new ArrayList<>(plazo); // Crear un ArrayList con tamaño inicial igual al plazo
		this.clientes = new ArrayList<>(); // Asegúrate de inicializar clientes aquí.

	}

	// Mostrar prestamo
	public void mostarPrestamo() {
		if (!clientes.isEmpty()) {
			System.out.println("Monto: " + monto + ", Interés: " + interes + ", Plazo: " + plazo);
		} else {
			System.out.println("No hay cliente asociado a este préstamo.");
		}
	}

	// asociar cliente
	public void asociarCliente(Clientes cliente) {
		this.clientes.add(cliente);
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public int getPlazo() {
		return plazo;
	}

	public void setPlazo(int plazo) {
		this.plazo = plazo;
	}

	public ArrayList<Cuota> getCuotas() {
		return cuotas;
	}

	public ArrayList<Clientes> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Clientes> clientes) {
		this.clientes = clientes;
	}

	public void setCuotas(ArrayList<Cuota> cuotas) {
		this.cuotas = cuotas;
	}

}
