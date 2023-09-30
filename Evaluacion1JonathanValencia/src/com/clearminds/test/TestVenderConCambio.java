package com.clearminds.test;

import com.clearminds.componentes.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestVenderConCambio {

	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.agregarCelda("A");
        maquina.agregarCelda("B");
        maquina.agregarCelda("C");
        maquina.agregarCelda("D");			
		Producto producto=new Producto("CH01","Chuleta",2.55);
		maquina.cargarProducto(producto, "B", 4);
		
		Producto producto2=new Producto("L123","Lomo",2.75);
		maquina.cargarProducto(producto2, "C", 6);
		
		maquina.vender("B");
		double cambio=maquina.venderConCambio("B",10);
		
		maquina.mostrarProductos();
			
		System.out.println("SU CAMBIO ES:"+cambio);
		
	}

}
