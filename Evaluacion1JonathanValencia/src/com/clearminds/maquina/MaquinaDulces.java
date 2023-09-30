package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private ArrayList<Celda> celdas;
	private double saldo;

	public MaquinaDulces() {
		celdas = new ArrayList<>(); // creo un array como atributo
	}

	public void agregarCelda(String codigo) {
		Celda celda = new Celda(codigo);
		celdas.add(celda);

	}

	public void mostrarConfiguracion() {
		Celda elementoCelda;
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			System.out.println("Celda :" + elementoCelda.getCodigo());
		}
	}

	public Celda buscarCelda(String codigo) {
		Celda elementoCelda = null;
		Celda celdaEncontrada = null;

		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if (elementoCelda.getCodigo().equals(codigo)) {
				celdaEncontrada = elementoCelda;
			}
		}
		return celdaEncontrada;
	}

	public void cargarProducto(Producto produto, String codigo, int cantidad) {
		Celda celdaRecuperada = buscarCelda(codigo);
		if (celdaRecuperada != null) {
			celdaRecuperada.ingresarProducto(produto, cantidad);

		} else {
			System.out.println("No esxiste la celda");
		}

	}

	public void mostrarProductos() {
		for (int i = 0; i < celdas.size(); i++) {
			if (celdas.get(i).getProducto() != null) {
				System.out.println("CELDA :" + celdas.get(i).getCodigo() + " Stock  " + celdas.get(i).getStock()
						+ " Producto " + celdas.get(i).getProducto().getCodigo() + "  "
						+ celdas.get(i).getProducto().getPrecio());

			} else {
				System.out.println("CELDA :" + celdas.get(i).getCodigo() + " Stock: 0 " + "Sin producto asignado ");
			}

		}
		System.out.println("Saldo :" + this.getSaldo());

	}

	public Producto buscarProductoEnCelda(String codigo) {

		Celda elementoCelda = null;
		Celda celdaEncontrada = null;
		Producto productoEncontrado = null;

		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if (elementoCelda.getCodigo().equals(codigo)) {
				celdaEncontrada = elementoCelda;
				productoEncontrado = celdaEncontrada.getProducto();
			}

		}
		if (productoEncontrado != null) {
			return productoEncontrado;

		} else {
			return productoEncontrado;
		}
	}

	public double consultarPrecio(String codigo) {

		Celda elementoCelda = null;
		Celda celdaEncontrada = null;
		Producto productoEncontrado = null;

		double precio = 0;

		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if (elementoCelda.getCodigo().equals(codigo)) {
				celdaEncontrada = elementoCelda;
				precio = celdaEncontrada.getProducto().getPrecio();
			}

		}
		if (productoEncontrado != null) {
			return precio;

		} else {
			return precio;
		}
	}

	public Celda buscarCeldaProducto(String codigo) {

		Celda elementoCelda = null;
		Celda celdaEncontrada = null;

		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			if ((elementoCelda.getProducto() != null) && (elementoCelda.getProducto().getCodigo() == codigo)) {
				celdaEncontrada = elementoCelda;

				return celdaEncontrada;

			}

		}

		return celdaEncontrada;

	}

	public void incrementarProductos(String codigo, int cantidadIncremento) {

		Celda celdaEncontrada = buscarCeldaProducto(codigo);
		celdaEncontrada.setStock(cantidadIncremento);

	}

	public void vender(String codigo) {
		Celda celdaEncontrada = buscarCelda(codigo);
		celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
		this.saldo += celdaEncontrada.getProducto().getPrecio();

	}

	public double venderConCambio(String codigo, double valorIngresado) {
		Celda celdaEncontrada = buscarCelda(codigo);
		celdaEncontrada.setStock(celdaEncontrada.getStock() - 1);
		this.saldo += celdaEncontrada.getProducto().getPrecio();
		double vuelto = valorIngresado - celdaEncontrada.getProducto().getPrecio();

		return vuelto;

	}

	public ArrayList<Producto> buscarMenores(double limite) {
		Celda elementoCelda;
		Producto productoEncontrado;
		ArrayList<Producto> productosEncontrados = new ArrayList<>();
		for (int i = 0; i < celdas.size(); i++) {
			elementoCelda = celdas.get(i);
			// Verificar si hay un producto en la celda antes de verificar el precio
			if (elementoCelda.getProducto() != null && elementoCelda.getProducto().getPrecio() <= limite) {

				productoEncontrado = elementoCelda.getProducto();
				productosEncontrados.add(productoEncontrado);
			}
		}

		return productosEncontrados;
	}

	// Metodos get andd Set

	public ArrayList<Celda> getCeldas() {
		return celdas;
	}

	public void setCeldas(ArrayList<Celda> celdas) {
		this.celdas = celdas;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
