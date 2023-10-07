package servicios;

import java.util.ArrayList;

import entidades.Carta;
import entidades.Naipe;

public class Juego {

	private Naipe naipe;
	private ArrayList<ArrayList<Carta>> cartasJugadores;

	// CONTRUCTOR SIN PARAMTROS
	public Juego() {
		naipe = new Naipe();
		ArrayList<Carta> naipeBarajeado = naipe.barajar();
	}

	public Juego(ArrayList<String> idsJugadores) {
		cartasJugadores = new ArrayList<>();
		naipe = new Naipe();

		for (int i = 0; i < idsJugadores.size(); i++) {
			ArrayList<Carta> cartas = new ArrayList<>();
			cartasJugadores.add(cartas);
		}
	}

	/*
	 * PARA CONOCIMIENTO El uso de un arreglo de listas anidado
	 * (ArrayList<ArrayList<Carta>>) puede ser beneficioso en situaciones en las que
	 * se necesita organizar y acceder a elementos en una estructura de datos de
	 * múltiples niveles.
	 * 
	 * En este caso,  cartasJugadores es un arreglo donde cada elemento es
	 * una lista de cartas pertenecientes a un jugador específico. El arreglo en sí
	 * permite acceder a cada jugador individualmente, y cada lista dentro del
	 * arreglo contiene las cartas asociadas a ese jugador.
	 */

	public ArrayList<ArrayList<Carta>> getCartasJugadores() {
		return cartasJugadores;
	}

	// METODO ENTREGAR CARTAS
	public void entregarCartas(int cartasPorJugador) {
		// Barajar el naipe antes de entregar las cartas
		ArrayList<Carta> barajaBarajada = naipe.barajar();
		int totalJugadores = cartasJugadores.size();
		int cartaActual = 0;

		// Iterando a través de las cartas que se deben entregar a cada jugador
		for (int i = 0; i < cartasPorJugador; i++) {
			// Iterar a través de los jugadores
			for (int j = 0; j < totalJugadores; j++) {
				if (cartaActual < barajaBarajada.size()) {
					// Obtener la carta actual de la baraja ya barajada
					Carta carta = barajaBarajada.get(cartaActual);
					// Agregar la carta al conjunto de cartas del jugador j
					cartasJugadores.get(j).add(carta);
					cartaActual++;
				}
			}
		}
	}

	// METODO DEVOLVER TOTAL
	public int devolverTotal(String idJugador) {
		// Obtener el índice del jugador a partir del ID del jugador
		// convirtiendo el identificador del jugador (que esta en formato de
		// texto) en un número entero que puede ser utilizado como índice para acceder a
		// la lista de cartas del jugador.
		int id = Integer.parseInt(idJugador.substring(idJugador.length() - 1)) - 1; // el menos 1 al final es para tener
																					// un indice basado en 0

		// Obtener las cartas del jugador
		ArrayList<Carta> cartasJugador = cartasJugadores.get(id);
		int sumaValores = 0;

		// Calcular la suma de los valores de las cartas del jugador
		for (int i = 0; i < cartasJugador.size(); i++) {
			Carta carta = cartasJugador.get(i);
			sumaValores += carta.getNumero().getValor();
		}

		return sumaValores;
	}

	// METODO DETERMINAR GANADOR
	public String determinarGanador() {
		int idGanador = 0;
		int sumaGanador = devolverTotal("jugador 1");

		// Determinar al ganador comparando las sumas de los valores de las cartas
		for (int i = 1; i < cartasJugadores.size(); i++) {
			int sumaJugador = devolverTotal("jugador " + (i + 1));

			if (sumaJugador > sumaGanador) {
				idGanador = i;
				sumaGanador = sumaJugador;
			} else {

			}
		}

		String ganador = "jugador " + (idGanador + 1);
		return ganador;
	}
}