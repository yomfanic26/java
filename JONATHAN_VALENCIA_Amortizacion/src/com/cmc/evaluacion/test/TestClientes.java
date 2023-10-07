package com.cmc.evaluacion.test;

import com.cmc.evaluacion.entidades.Clientes;
import com.cmc.evaluacion.servicio.Banco;

public class TestClientes {
    public static void main(String[] args) {
        Banco banco = new Banco();
            Clientes cliente1 = new Clientes("1234567890", "Juan", "Perez");
            banco.registrarCliente(cliente1);
            cliente1.mostarCliente();

            Clientes cliente2 = new Clientes("0987654321", "Maria", "Lopez");
            banco.registrarCliente(cliente2);
            cliente2.mostarCliente();

           

            // Intentar registrar un cliente duplicado
            Clientes cliente3 = new Clientes("1234567890", "Pedro", "Gomez");
            banco.registrarCliente(cliente3);
            
            
        }
    }

