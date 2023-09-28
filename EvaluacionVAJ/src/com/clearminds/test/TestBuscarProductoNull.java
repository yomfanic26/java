package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarProductoNull {
	public static void main(String[] args) {
		MaquinaDulces maquina = new MaquinaDulces();
		maquina.configurarMaquina("A1", "A2", "B1", "B2");

		Producto producto = new Producto("KE34", "Papitas", 0.85);
		maquina.cargarProducto(producto, "B1", 4);

		Producto prod = maquina.buscarProductoEnCelda("A1");
		System.out.println("Producto encontrado:" + prod.getNombre());

		// el error se encuentra en la linea 15 donde se esta imprimineo el nombre de un
		// producto que no existe en la varibale maquina especificamente en la celda A1,
		// ya que esta en la primera posicion pero tambien existria el erroa para las
		// celda A2 y B2

	}
}
