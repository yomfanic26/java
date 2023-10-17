package entidades;

import java.util.ArrayList;

public class Naipe {

	private ArrayList<Numero> numeroPosibles;
	private ArrayList<Carta> cartas;
	Random randon = new Random();

	public Naipe() {

		this.numeroPosibles = new ArrayList<>();
		this.cartas = new ArrayList<>();
		Palos palos = new Palos();

		// creo un arreglo con los nombre de las cartas
		String[] nombresNumeros = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		// reccoroot odo el arreglo
		for (int i = 0; i < nombresNumeros.length; i++) {
			// obtendo el nombre del arreglo en cada posicion
			String nombre = nombresNumeros[i];
			int valor;
			if (nombre.equals("A")) {
				valor = 11;
			} else if (nombre.equals("J") || nombre.equals("Q") || nombre.equals("K")) {
				valor = 10;
				// si no se cumple ninduna comvierto a entero el reto de los nombre para obtener
				// el valor que tienen
			} else {
				valor = Integer.parseInt(nombre);
			}
			// creo una nstancia de la clase Numero y luego se está añadiendo a la lista
			// numerosPosibles.
			numeroPosibles.add(new Numero(nombre, valor));
		}

		
		// agregar en array de cartas los 13 numeros posibles combinados con cada palo
		// debe salir 52 combinaciones
		for (int i = 0; i < numeroPosibles.size(); i++) {

			Numero numero = numeroPosibles.get(i);
			cartas.add(new Carta(numero, palos.CORAZON_ROJO));
			cartas.add(new Carta(numero, palos.CORAZON_DIMANTE));
			cartas.add(new Carta(numero, palos.DIAMANTE));
			cartas.add(new Carta(numero, palos.TREBOL));

		}

	}

	// Metodo barajar

	public ArrayList<Carta> barajar() {
	    int posicion = 0; // Variable que almacenará la posición de la carta seleccionada.
	    Carta elementoCarta; // Variable que representa una carta.
	    ArrayList<Carta> auxiliar = new ArrayList(); // ArrayList auxiliar para almacenar las cartas barajadas.

	    for (int i = 0; i <= 100; i++) {
	        posicion = randon.obtenerPosicion(); // Obtener una posición aleatoria.
	        elementoCarta = cartas.get(posicion); // Obtener la carta en esa posición.

	        if (elementoCarta.getEstado().equals("N")) { // Si la carta está en estado 'N' (no usada).
	            elementoCarta.setEstado("C"); // Cambiar el estado de la carta a 'C' (usada).
	            auxiliar.add(elementoCarta); // Agregar la carta al ArrayList auxiliar.
	        } else {
	            // No se hace nada si la carta ya estaba en estado 'C' (usada).
	        }
	    }

	    // Recorrer todas las cartas y cambiar las qu no han sido añadidas al auxiliar.
	    for (int i = 0; i < cartas.size(); i++) {
	        elementoCarta = cartas.get(posicion); // Obtener la carta en esa posición.

	        if (elementoCarta.getEstado().equals("N")) { // Si la carta está en estado 'N' (no usada).
	            auxiliar.add(elementoCarta); // Agregar la carta al ArrayList auxiliar.
	            elementoCarta.setEstado("C"); // Cambiar el estado de la carta a 'C' (usada).
	        }
	    }

	    return auxiliar; // Devolver el ArrayList con las cartas barajadas.
	}

}
