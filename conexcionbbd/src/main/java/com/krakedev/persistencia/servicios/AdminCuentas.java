package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Cuenta;
import com.krakedev.persistencia.util.ConexcionBDD;

public class AdminCuentas {

	private static final Logger LOGGER = LogManager.getFormatterLogger(AdminCuentas.class);

	public static void insertar(Cuenta cuenta) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		LOGGER.trace("Cuenta a insertar >>>> " + cuenta);

		try {
			// abriendo conexcionS
			con = ConexcionBDD.conectar();
			ps = con.prepareStatement("INSERT INTO cuentas(numero_cuenta, cedula_propietario, fecha_creacion,saldo)"
					+ "VALUES (?,?,?,?)");
			ps.setString(1, cuenta.getNumero_cuenta());
			ps.setString(2, cuenta.getUsuario().getCedula());
			ps.setDate(3, new java.sql.Date(cuenta.getFecha_creacion().getTime()));
			ps.setBigDecimal(4, cuenta.getSaldo());

			ps.executeUpdate();

		} catch (Exception e) {

			LOGGER.error("Error al insertar", e);

			throw new Exception("Error al insertar");

		} finally {

			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error enla base de datos", e);
				throw new Exception("Error en la base de datos");
			}

		}

	}

	public static void actualizar(Cuenta cuenta) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		LOGGER.trace("Cuenta a actualizar >>>> " + cuenta);

		try {
			// abriendo conexcionS
			con = ConexcionBDD.conectar();
			ps = con.prepareStatement(
					"update cuentas  set  cedula_propietario=?, fecha_creacion=?,saldo=? where numero_cuenta=?");

			ps.setString(4, cuenta.getNumero_cuenta());
			ps.setString(1, cuenta.getUsuario().getCedula());
			ps.setDate(2, new java.sql.Date(cuenta.getFecha_creacion().getTime()));
			ps.setBigDecimal(3, cuenta.getSaldo());

			ps.executeUpdate();

		} catch (Exception e) {

			LOGGER.error("Error al actualizar", e);
			throw new Exception("Error al actulizar");

		} finally {

			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error enla base de datos", e);
				// en SQLEXEPTIOn debeo instancia el objeto por que tienen un erro tecnico
				throw new Exception("Error en la base de datos");
			}

		}

	}
	
	
	public static void eliminar(String numero_cuenta) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		LOGGER.trace("Cuenta a eliminar con numero >>>> " + numero_cuenta);

		try {
			con = ConexcionBDD.conectar();
			ps = con.prepareStatement("delete from cuentas where numero_cuenta=?");

			ps.setString(1, numero_cuenta);
			ps.executeUpdate();

		} catch (Exception e) {

			LOGGER.error("Error al eliminar", e);

			throw new Exception("Error al eliminar");

		} finally {

			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error enla base de datos", e);
				throw new Exception("Error en la base de datos");
			}
		}
	}
	
	
}
