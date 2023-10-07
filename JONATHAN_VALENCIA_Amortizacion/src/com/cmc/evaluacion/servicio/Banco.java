package com.cmc.evaluacion.servicio;

import java.util.ArrayList;

import com.cmc.evaluacion.entidades.CalculadoraAmortizacion;
import com.cmc.evaluacion.entidades.Clientes;
import com.cmc.evaluacion.entidades.Prestamo;

public class Banco {
	private ArrayList<Prestamo> prestamos;
	private ArrayList<Clientes> clientes;

	public Banco() {
		prestamos = new ArrayList<>();
		clientes = new ArrayList<>();
	}

	// Metodo buscar cliente
	public Clientes buscarCliente(String cedula) {
		for (int i = 0; i < clientes.size(); i++) {
			Clientes cliente = clientes.get(i);
			if (cedula.equals(cliente.getCedula())) {
				return cliente;
			}
		}
		return null;
	}

//metodo registrar cliente
	public void registrarCliente(Clientes cliente) {
		if (buscarCliente(cliente.getCedula()) == null) {
			clientes.add(cliente);
		} else {
			System.out.println("Cliente ya existe: " + cliente.getCedula());
		}
	}

	public void asignarPrestamo(String cedula, Prestamo prestamo) {
		Clientes cliente = buscarCliente(cedula);

		if (cliente != null) {
			prestamos.add(prestamo);
			prestamo.asociarCliente(cliente); // Asociar el cliente al préstamo

			CalculadoraAmortizacion.generarTabla(prestamo);
		} else {
			System.out.println("No es cliente del banco");
		}
	}

	public ArrayList<Prestamo> buscarPrestamos(String cedula) {
		ArrayList<Prestamo> prestamosCliente = new ArrayList<>();

		// Se itera a través de todos los préstamos
		for (Prestamo prestamo : prestamos) {
			ArrayList<Clientes> clientesPrestamo = prestamo.getClientes();

			// Si la lista de clientes no es nula
			if (clientesPrestamo != null) {
				// Se itera a través de los clientes asociados al préstamo
				for (Clientes cliente : clientesPrestamo) {
					if (cliente != null && cliente.getCedula().equals(cedula)) {
						prestamosCliente.add(prestamo);
						break;
					}
				}
			}
		}

		// Si no se encontraron prestmao devuelve null, de lo contrario se devuelve la
		// lista de préstamos

		if (prestamosCliente.isEmpty()) {
			return null;
		} else {
			return prestamosCliente;
		}
	}

	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}

	public void setPrestamos(ArrayList<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}

	public ArrayList<Clientes> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Clientes> clientes) {
		this.clientes = clientes;
	}
}
