package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.util.ConexcionBDD;

public class AdminPersonas {
	private static final Logger LOGGER = LogManager.getFormatterLogger(AdminPersonas.class);

	public static void insertar(Persona persona) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		LOGGER.trace("Persona a insertar >>>> " + persona);

		try {
			// abriendo conexcionS
			con = ConexcionBDD.conectar();
			ps = con.prepareStatement(
					"INSERT INTO personas(cedula, nombre, apellido,estado_civil_codigo,numero_hijos,estatura,cantidad_ahorrada,fecha_nacimiento,hora_nacimiento)"
							+ "VALUES (?,?,?,?,?,?,?,?,?)");
			ps.setString(1, persona.getCedula());
			ps.setString(2, persona.getNombre());
			ps.setString(3, persona.getApellido());
			ps.setString(4, persona.getEstado_civil().getCodigo());
			ps.setInt(5, persona.getNumero_hijos());
			ps.setDouble(6, persona.getEstatura());
			ps.setBigDecimal(7, persona.getCantidad_ahorrada());
			ps.setDate(8, new java.sql.Date(persona.getFecha_nacimiento().getTime()));
			ps.setTime(9, new java.sql.Time(persona.getHora_nacimiento().getTime()));

			// ejecutando los insert
			ps.executeUpdate();

		} catch (Exception e) {

			// logger del error
			LOGGER.error("Error al insertar", e);

			// propago la exepcion
			throw new Exception("Error al insertar");

		} finally {

			try {
				// cerrando conexcion

				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error enla base de datos", e);
				// en SQLEXEPTIOn debeo instancia el objeto por que tienen un erro tecnico
				throw new Exception("Error en la base de datos");
			}

		}

	}

	public static void actualizar(Persona persona) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		LOGGER.trace("Persona a insertar >>>> " + persona);

		try {
			// abriendo conexcionS
			con = ConexcionBDD.conectar();
			ps = con.prepareStatement(
					"update personas  set nombre=?,apellido=?,estatura=?,fecha_nacimiento=?,hora_nacimiento=?,cantidad_ahorrada=?,numero_hijos=?,estado_civil_codigo=? where cedula=?");

			ps.setString(1, persona.getNombre());
			ps.setString(2, persona.getApellido());
			ps.setDouble(3, persona.getEstatura());
			ps.setDate(4, new java.sql.Date(persona.getFecha_nacimiento().getTime()));
			ps.setTime(5, new java.sql.Time(persona.getHora_nacimiento().getTime()));
			ps.setBigDecimal(6, persona.getCantidad_ahorrada());
			ps.setInt(7, persona.getNumero_hijos());
			ps.setString(8, persona.getEstado_civil().getCodigo());
			ps.setString(9, persona.getCedula());

			// ejecutando los uptadte
			ps.executeUpdate();

		} catch (Exception e) {

			// logger del error
			LOGGER.error("Error al actualizar", e);

			// propago la exepcion
			throw new Exception("Error al actulizar");

		} finally {

			try {
				// cerrando conexcion

				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error enla base de datos", e);
				// en SQLEXEPTIOn debeo instancia el objeto por que tienen un erro tecnico
				throw new Exception("Error en la base de datos");
			}

		}

	}

	public static void eliminar(String cedula) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		LOGGER.trace("Persona a eliminar con cedula >>>> " + cedula);

		try {
			con = ConexcionBDD.conectar();
			ps = con.prepareStatement("delete from personas where cedula=?");

			ps.setString(1, cedula);
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
