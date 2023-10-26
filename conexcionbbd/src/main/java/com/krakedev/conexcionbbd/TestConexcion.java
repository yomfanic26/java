package com.krakedev.conexcionbbd;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestConexcion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection connection = null;
		PreparedStatement ps = null;

		try {
			// armando la conexcion
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
					"LOkitopv10");
			System.out.println("Conexcion existosa");

			ps = connection.prepareStatement(
					"INSERT INTO personas(cedula, nombre, apellido,estado_civil_codigo,numero_hijos,estatura,cantidad_ahorrada,fecha_nacimiento,hora_nacimiento)"
							+ "VALUES (?,?,?,?,?,?,?,?,?)");
			ps.setString(1, "1234567899");
			ps.setString(2, "Juan");
			ps.setString(3, "Harturo");
			ps.setString(4, "C");
			ps.setInt(5, 2);
			ps.setDouble(6, 1.56);
			ps.setBigDecimal(7, new BigDecimal(1202.35));

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String fechaStr = "2020/03/22 10:05:04";

			try {
				Date fecha = sdf.parse(fechaStr);
				long fechaMilis = fecha.getTime();
				java.sql.Date fechaSQl = new java.sql.Date(fechaMilis);
				Time timeSql = new Time(fechaMilis);

				ps.setDate(8, fechaSQl);
				ps.setTime(9, timeSql);
				// ejecutando los insert
				ps.executeUpdate();
				System.out.println("Ejucute insert");

			} catch (ParseException e) {
				e.printStackTrace();
			}

			// armando setencia para insertar datos enla tabla cuentas
			ps = connection.prepareStatement(
					"Insert into cuentas (numero_cuenta,cedula_propietario,fecha_creacion,saldo)" + "VALUES (?,?,?,?)");
			ps.setString(1, "56522");
			ps.setString(2, "0803473784");
			ps.setBigDecimal(4, new BigDecimal(100.35));

			SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
			String fechaStr1 = "2023/03/22 ";

			try {
				Date fecha = sdf1.parse(fechaStr1);
				long fechaMilis = fecha.getTime();

				java.sql.Date fechaSQl = new java.sql.Date(fechaMilis);

				ps.setDate(3, fechaSQl);
				ps.executeUpdate();
				System.out.println("Ejecutado insert  de cuenta");

			} catch (ParseException e) {
				e.printStackTrace();
			}

			// armando setencia para insertar datos enla tabla empleafos

			ps = connection
					.prepareStatement("insert into empleados (codigo_empleado,nombre,fecha,hora)" + "VALUES (?,?,?,?)");
			ps.setInt(1, 32);
			ps.setString(2, "SANTIAGO");

			SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
			String fechaStr2 = "2023/12/30 10:00:15";

			try {
				Date fecha = sdf2.parse(fechaStr2);
				long fechaMilis = fecha.getTime();

				java.sql.Date fechaSQl = new java.sql.Date(fechaMilis);
				Time timeSQL = new Time(fechaMilis);

				ps.setDate(3, fechaSQl);
				ps.setTime(4, timeSQL);

				ps.executeUpdate();
				System.out.println("Ejecutado insert de empleado");

			} catch (ParseException e) {
				e.printStackTrace();
			}

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
