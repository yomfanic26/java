package com.krakedev.persistencia.entidades;

import java.math.BigDecimal;
import java.util.Date;

public class Cuenta {
	private String numero_cuenta;
	private Usuario usuario;
	private Date fecha_creacion;
	private BigDecimal saldo;

	public Cuenta() {
		super();
	}

	public Cuenta(String numero_cuenta, Usuario usuario) {
		super();
		this.numero_cuenta = numero_cuenta;
		this.usuario = usuario;

	}

	public String getNumero_cuenta() {
		return numero_cuenta;
	}

	public void setNumero_cuenta(String numero_cuenta) {
		this.numero_cuenta = numero_cuenta;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Date getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(Date fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cuenta [numero_cuenta=" + numero_cuenta + ", usuario=" + usuario + ", fecha_creacion=" + fecha_creacion
				+ ", saldo=" + saldo + "]";
	}

}
