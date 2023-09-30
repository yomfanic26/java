package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestVender {

	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.agregarCelda("A");
        maquina.agregarCelda("B");
        maquina.agregarCelda("C");
        maquina.agregarCelda("D");		
		Producto producto=new Producto("T458","Tomae",0.95);
		maquina.cargarProducto(producto, "B", 4);
		
		Producto producto2=new Producto("C423","Cebolla",1.70);
		maquina.cargarProducto(producto2, "A", 6);
		
		maquina.vender("A");
		maquina.vender("B");
		
		maquina.mostrarProductos();

	}

}
