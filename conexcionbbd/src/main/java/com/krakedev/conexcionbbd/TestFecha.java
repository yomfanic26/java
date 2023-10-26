package com.krakedev.conexcionbbd;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFecha {

	public static void main(String[] args) {
		// Date java.util.Date
		// Date java.sql.Date

		// convetir de string date
		// para aumenta hora minuto y segundo modifico el formatio 
		SimpleDateFormat sdf = new SimpleDateFormat("yyy/MM/dd hh:mm:ss");
		String fechaStr = "2020/03/22 10:05:04";

		try {
			Date fecha = sdf.parse(fechaStr);// parse devuelve un objeto Date del paquete java.util
			System.out.println(fecha);
			long fechaMilis = fecha.getTime();
			System.out.println(fechaMilis);

			// Creo java.sql.Date partiendo de un java.util.Date despues de convertilon en milisegundos
			java.sql.Date fechaSQl = new java.sql.Date(fechaMilis);
			System.out.println(fechaSQl);
			
			//para obtener la hora uso la misma convercion a milisegundos
			Time timeSql = new Time (fechaMilis);
			System.out.println(timeSql);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
