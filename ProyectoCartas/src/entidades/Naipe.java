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

		// creo un strign llamdo palo que va obtener cada uno de los palos posibles
		String palo1 = palos.CORAZON_ROJO;
		String palo2 = palos.CORAZON_DIMANTE;
		String palo3 = palos.DIAMANTE;
		String palo4 = palos.TREBOL;

		// agregar en array de cartas los 13 numeros posibles combinados con cada palo
		// debe salir 52 combinaciones
		for (int i = 0; i < numeroPosibles.size(); i++) {

			Numero numero = numeroPosibles.get(i);
			cartas.add(new Carta(numero, palo1));
			cartas.add(new Carta(numero, palo2));
			cartas.add(new Carta(numero, palo3));
			cartas.add(new Carta(numero, palo4));

		}

	}

	// Metodo barajar

	public ArrayList<Carta> barajar() {
		int posicion = 0;
		Carta elementoCarta;
		ArrayList<Carta> auxiliar = new ArrayList();
		for (int i = 0; i <= 100; i++) {
			posicion = randon.obtenerPosicion();
			elementoCarta = cartas.get(posicion);
			if (elementoCarta.getEstado().equals("N")) {
				elementoCarta.setEstado("C");
				auxiliar.add(elementoCarta);

			} else {

			}
		}
//
		for (int i = 0; i < cartas.size(); i++) {
			elementoCarta = cartas.get(posicion);

			if (elementoCarta.getEstado().equals("N")) {
				auxiliar.add(elementoCarta);
				elementoCarta.setEstado("C");
			}
		}

		return auxiliar;
	}

}
