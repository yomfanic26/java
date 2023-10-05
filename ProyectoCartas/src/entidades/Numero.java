package entidades;

public class Numero {
	private String numeroCarta;
	private int valor;

	public Numero(String numeroCarta, int valor) {
		this.numeroCarta = numeroCarta;
		this.valor = valor;
	}

	// Sobrescribir el método toString para que muestre la info de la carta en el
	// formato: numeroCarta - valor Por ejemplo: A-11 Q-10 4-4
	public String toString() {
		return numeroCarta + " - " + valor;
	}

	public String getNumeroCarta() {
		return numeroCarta;
	}

	public void setNumeroCarta(String numeroCarta) {
		this.numeroCarta = numeroCarta;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

}
