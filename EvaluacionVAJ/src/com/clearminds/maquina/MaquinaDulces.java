package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1, celda2, celda3, celda4;
	private double saldo;

	public MaquinaDulces() {

	}

	public void configurarMaquina(String codigo1, String codigo2, String codigo3, String codigo4) {
		this.celda1 = new Celda(codigo1);
		this.celda2 = new Celda(codigo2);
		this.celda3 = new Celda(codigo3);
		this.celda4 = new Celda(codigo4);

	}

	public void mostrarConfiguracion() {
		System.out.println("CODIGO DE CELDA");
		System.out.println("Celda 1: " + celda1.getCodigo() + " " + saldo);
		System.out.println("Celda 2: " + celda2.getCodigo() + " " + saldo);
		System.out.println("Celda 3: " + celda3.getCodigo() + " " + saldo);
		System.out.println("Celda 4: " + celda4.getCodigo() + " " + saldo);

	}

	public Celda buscarCelda(String codigo) {
		if (celda1.getCodigo() == codigo) {
			return celda1;
		} else if (celda2.getCodigo() == codigo) {
			return celda2;
		} else if (celda3.getCodigo() == codigo) {
			return celda3;
		} else if (celda4.getCodigo() == codigo) {
			return celda4;
		} else {
			return null;
		}
	}

	public void cargarProducto(Producto producto, String codigo, int cantidaItems) {
		Celda celdaRecuperada = buscarCelda(codigo);
		celdaRecuperada.ingresarProducto(producto, cantidaItems);

	}

	public void mostrarProductos() {
		System.out.println("******CELDA A1");
		System.out.println("Stock :" + celda1.getStock());
		if (celda1.getProducto() != null) {
			System.out.println("Nombre pododucto : " + celda1.getProducto().getNombre());
			System.out.println("Precio producto : " + celda1.getProducto().getPrecio());
			System.out.println("Codigo producto : " + celda1.getProducto().getCodigo());
		} else {
			System.out.println("LA CEDLA NO TIEN PRODUCTOS");
		}

		System.out.println("******CELDA A2");
		System.out.println("Stock :" + celda2.getStock());

		if (celda2.getProducto() != null) {
			System.out.println("Nombre pododucto : " + celda2.getProducto().getNombre());
			System.out.println("Precio producto : " + celda2.getProducto().getPrecio());
			System.out.println("Codigo producto : " + celda2.getProducto().getCodigo());
		} else {
			System.out.println("LA CEDLA NO TIEN PRODUCTOS");
		}

		System.out.println("******CELDA B1");
		System.out.println("Stock :" + celda3.getStock());

		if (celda3.getProducto() != null) {
			System.out.println("Nombre pododucto : " + celda3.getProducto().getNombre());
			System.out.println("Precio producto : " + celda3.getProducto().getPrecio());
			System.out.println("Codigo producto : " + celda3.getProducto().getCodigo());

		} else {
			System.out.println("LA CEDLA NO TIEN PRODUCTOS");
		}

		System.out.println("******CELDA B2");
		System.out.println("Stock :" + celda4.getStock());

		if (celda4.getProducto() != null) {
			System.out.println("Nombre pododucto : " + celda4.getProducto().getNombre());
			System.out.println("Precio producto : " + celda4.getProducto().getPrecio());
			System.out.println("Codigo producto : " + celda4.getProducto().getCodigo());
		} else {
			System.out.println("LA CEDLA NO TIEN PRODUCTOS");
		}

		System.out.println("Saldo :" + this.getSaldo());

	}

	public Producto buscarProductoEnCelda(String codigo) {
		if (celda1.getCodigo() == codigo) {
			return celda1.getProducto();
		} else if (celda2.getCodigo() == codigo) {
			return celda2.getProducto();
		} else if (celda3.getCodigo() == codigo) {
			return celda3.getProducto();
		} else if (celda4.getCodigo() == codigo) {
			return celda4.getProducto();
		} else {
			return null;
		}
	}

	public double consultarPrecio(String codigo) {
		if (celda1.getCodigo() == codigo) {
			return celda1.getProducto().getPrecio();
		} else if (celda2.getCodigo() == codigo) {
			return celda2.getProducto().getPrecio();
		} else if (celda3.getCodigo() == codigo) {
			return celda3.getProducto().getPrecio();
		} else if (celda4.getCodigo() == codigo) {
			return celda4.getProducto().getPrecio();
		} else {
			System.out.println("Celda no encontrada");
			return 0;
		}
	}

	public Celda buscarCeldaProducto(String codigo) {
		if (celda1.getProducto() != null && celda1.getProducto().getCodigo() == codigo) {
			return celda1;
		} else if (celda2.getProducto() != null && celda2.getProducto().getCodigo() == codigo) {
			return celda2;
		} else if (celda3.getProducto() != null && celda3.getProducto().getCodigo() == codigo) {
			return celda3;
		} else if (celda4.getProducto() != null && celda4.getProducto().getCodigo() == codigo) {
			return celda4;
		} else {
			return null;
		}
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

	public Celda getCelda1() {
		return celda1;
	}

	public void setCelda1(Celda celda1) {
		this.celda1 = celda1;
	}

	public Celda getCelda2() {
		return celda2;
	}

	public void setCelda2(Celda celda2) {
		this.celda2 = celda2;
	}

	public Celda getCelda3() {
		return celda3;
	}

	public void setCelda3(Celda celda3) {
		this.celda3 = celda3;
	}

	public Celda getCelda4() {
		return celda4;
	}

	public void setCelda4(Celda celda4) {
		this.celda4 = celda4;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
