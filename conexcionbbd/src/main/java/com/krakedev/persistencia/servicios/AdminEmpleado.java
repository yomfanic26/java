package com.krakedev.persistencia.servicios;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.krakedev.persistencia.entidades.Cuenta;
import com.krakedev.persistencia.entidades.Empleado;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.util.ConexcionBDD;

public class AdminEmpleado {

	private static final Logger LOGGER = LogManager.getFormatterLogger(AdminEmpleado.class);

	public static void insertar(Empleado empleado) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		LOGGER.trace("Empleado a insertar >>>> " + empleado);

		try {
			// abriendo conexcionS
			con = ConexcionBDD.conectar();
			ps = con.prepareStatement(
					"INSERT INTO empleados(codigo_empleado, nombre, fecha,hora)" + "VALUES (?,?,?,?)");
			ps.setInt(1, empleado.getCodigo_empleado());
			ps.setString(2, empleado.getNombre());
			ps.setDate(3, new java.sql.Date(empleado.getFecha().getTime()));
			ps.setTime(4, new java.sql.Time(empleado.getHora().getTime()));

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

	public static void actualizar(Empleado empleado) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		LOGGER.trace("Cuenta a actualizar >>>> " + empleado);

		try {
			// abriendo conexcionS
			con = ConexcionBDD.conectar();
			ps = con.prepareStatement("update empleados  set   nombre=?,fecha=?,hora=? where codigo_empleado=?");

			ps.setInt(4, empleado.getCodigo_empleado());
			ps.setString(1, empleado.getNombre());
			ps.setDate(2, new java.sql.Date(empleado.getFecha().getTime()));
			ps.setTime(3, new java.sql.Time(empleado.getHora().getTime()));

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

	public static void eliminar(int codigo_empleado) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		LOGGER.trace("Empleado a eliminar con codigo >>>> " + codigo_empleado);

		try {
			con = ConexcionBDD.conectar();
			ps = con.prepareStatement("delete from empleados where codigo_empleado=?");

			ps.setInt(1, codigo_empleado);
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

	public static ArrayList<Empleado> buscarPorParametrps(String nombreBusqueda, Date fechaBusqueda)
			throws Exception {
		ArrayList<Empleado> empleados = new ArrayList();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = ConexcionBDD.conectar();
			ps = con.prepareStatement("select * from empleados where nombre like ? and fecha>?");
			ps.setString(1, "%" + nombreBusqueda + "%");
			ps.setDate(2, new java.sql.Date(fechaBusqueda.getTime()));

			rs = ps.executeQuery();

			while (rs.next()) {
				int codigo = rs.getInt("codigo_empleado");
				String nombre = rs.getString("nombre");
				Date fech = rs.getDate("fecha");
				Time hora = rs.getTime("hora");

				Empleado empleado = new Empleado();
				empleado.setCodigo_empleado(codigo);
				empleado.setNombre(nombre);
				empleado.setFecha(fech);
				empleado.setHora(hora);
				empleados.add(empleado);

			}

		} catch (Exception e) {
			LOGGER.error("Error al consultar por nombre y fecha", e);
			throw new Exception("Error al consultar por nombre y fecha");
		} finally {

			try {
				con.close();
			} catch (SQLException e) {
				LOGGER.error("Error enla base de datos", e);
				throw new Exception("Error en la base de datos");
			}
		}
		return empleados;
	}

}
