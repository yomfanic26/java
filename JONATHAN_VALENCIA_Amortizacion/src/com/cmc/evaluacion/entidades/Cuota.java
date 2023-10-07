package com.cmc.evaluacion.entidades;

public class Cuota {
	private int numero;
	private double cuota, capital, Inicio, interes, abonoCapital, saldo;

	public Cuota(int numero) {
		this.numero = numero;
	}
	
	//Contructo que recibe todos los parametros
	public Cuota(int numero, double cuota, double capital, double interes, double abonoCapital, double saldo) {
        this.numero = numero;
        this.cuota = cuota;
        this.capital = capital;
        this.interes = interes;
        this.abonoCapital = abonoCapital;
        this.saldo = saldo;
    }

	public void mostrarPrestamo() {

		cuota = Utilitario.redondear(cuota);
		capital = Utilitario.redondear(capital);
		interes = Utilitario.redondear(interes);
		abonoCapital = Utilitario.redondear(abonoCapital);
		saldo = Utilitario.redondear(saldo);

		System.out.println(
				numero + "    | " + cuota + "    | " + capital + "   | " + interes + "    | " + abonoCapital + "    | " + saldo+"    |");
	}

	// metodos gey & set
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getCuota() {
		return cuota;
	}

	public void setCuota(double cuota) {
		this.cuota = cuota;
	}

	public double getCapital() {
		return capital;
	}

	public void setCapital(double capital) {
		this.capital = capital;
	}

	public double getInicio() {
		return Inicio;
	}

	public void setInicio(double inicio) {
		Inicio = inicio;
	}

	public double getInteres() {
		return interes;
	}

	public void setInteres(double interes) {
		this.interes = interes;
	}

	public double getAbonoCapital() {
		return abonoCapital;
	}

	public void setAbonoCapital(double abonoCapital) {
		this.abonoCapital = abonoCapital;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
