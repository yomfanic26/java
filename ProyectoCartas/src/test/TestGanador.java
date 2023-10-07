package test;

import java.util.ArrayList;
import java.util.Collections;

import servicios.Juego;

public class TestGanador {

	public static void main(String[] args) {
		
		ArrayList<String> jugadores = new ArrayList<>();
		
		//Permite agregar multiples elementos a un ArrayList usamos addAll
        Collections.addAll(jugadores, "Jugador 1", "Jugador 2", "Jugador 3");

		
		Juego juego = new Juego(jugadores);

        // Entregar las cartas a los jugadores;
        juego.entregarCartas(5); // Por ejemplo, entregar 5 cartas a cada jugador

        for (String jugador : jugadores) {
            int total = juego.devolverTotal(jugador);
            System.out.println("Total de " + jugador + ": " + total);
        }

        String ganador = juego.determinarGanador();
        System.out.println("El ganador es: " + ganador);
		

	}

}
