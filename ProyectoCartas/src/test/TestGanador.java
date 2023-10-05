package test;

import servicios.Juego;

public class TestGanador {

	public static void main(String[] args) {
		
		String [] jugadores ={"jugador 1","jugador 2","jugador 3"};
		Juego juego = new Juego(jugadores);

        // Entregar las cartas a los jugadores
        juego.entregarCartas(5); // Por ejemplo, entregar 5 cartas a cada jugador

        for (String jugador : jugadores) {
            int total = juego.devolverTotal(jugador);
            System.out.println("Total de " + jugador + ": " + total);
        }

        String ganador = juego.determinarGanador();
        System.out.println("El ganador es: " + ganador);
		

	}

}
