package com.cmc.evaluacion.test;

import java.util.ArrayList;

import com.cmc.evaluacion.entidades.CalculadoraAmortizacion;
import com.cmc.evaluacion.entidades.Clientes;
import com.cmc.evaluacion.entidades.Prestamo;
import com.cmc.evaluacion.servicio.Banco;

public class TestPrestamo {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Clientes cliente1 = new Clientes("1234567890", "Juan", "Perez");
        
        Clientes cliente2 = new Clientes("0987654321", "Maria", "Lopez");

        banco.getClientes().add(cliente1);
        banco.getClientes().add(cliente2);

        
            Prestamo prestamo1 = new Prestamo(4000,12,16);
            banco.asignarPrestamo("1234567890", prestamo1);
            CalculadoraAmortizacion.generarTabla(prestamo1);
            
            Prestamo prestamo2 = new Prestamo(50000,10,11);
            banco.asignarPrestamo("1234567890", prestamo2);

            Prestamo prestamo3 = new Prestamo(2000,8,14);
            banco.asignarPrestamo("0987654321", prestamo3);

            ArrayList<Prestamo> prestamosCliente1 = banco.buscarPrestamos("1234567890");
            for (Prestamo prestamo : prestamosCliente1) {
            	cliente1.mostarCliente();
            	prestamo.mostarPrestamo();
            	
            }
            ArrayList<Prestamo> prestamosCliente2 = banco.buscarPrestamos("0987654321");
            for (Prestamo prestamo : prestamosCliente2) {
            cliente2.mostarCliente();
            prestamo.mostarPrestamo();
            }

          
           

            
            
 
 
        }
    
}
