package com.clearminds.test;

import com.clearminds.maquina.MaquinaDulces;
import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class TestBuscarCeldaProducto {
	public static void main(String[] args) {
		MaquinaDulces maquina = new MaquinaDulces();

		maquina.agregarCelda("A");
        maquina.agregarCelda("B");
        maquina.agregarCelda("C");
        maquina.agregarCelda("D");
        
        Producto producto=new Producto("KE34","Papitas",0.85);
		maquina.cargarProducto(producto, "D", 5);
		
		
		Celda celda=maquina.buscarCeldaProducto("KE34");
		System.out.println("Celda :"+celda.getCodigo()+" Stock : "+celda.getStock());
		
		

		
	}
}
