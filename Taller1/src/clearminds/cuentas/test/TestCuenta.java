package clearminds.cuentas.test;

import clearminds.cuentas.Cuenta;

public class TestCuenta {

	public static void main(String[] args) {
		// Creo el objeto cuenta y lo referencio con cuenta1
		Cuenta cuenta1= new Cuenta("03476");
		//Coloco el valor de saldo a la cuenta1
		cuenta1.setSaldo(675);
		
		//Creo el objeto cuenta y lo referencio con cuenta2
		Cuenta cuenta2=new Cuenta("03476","C",98);
		
		//Creo el objeto cuenta y los refencion con cuenta3
		
		Cuenta cuenta3=new Cuenta("03476");
		//Modifico el tipo de cuenta
		cuenta1.setTipo("C");
		
		//Imprimo cuent1 cuenta2 y cuenta 3
		
		System.out.println("-------VALORES INICIALES---------");
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		
		
		System.out.println("-------VALORES MODIFICADOS---------");
		//Modificar los datos de la cuenta
		cuenta1.setSaldo(444);
		cuenta3.setSaldo(567);
		cuenta2.setTipo("D");

		//Imprimir los nuevos valores
		cuenta1.imprimir();
		cuenta2.imprimir();
		cuenta3.imprimir();
		
		
		//Crear una cuenta4 utilizando el contrusctor que recibe el id de cuenta y modificar los atributos de ser necesario
		Cuenta cuenta4= new Cuenta("0987");
		cuenta4.setSaldo(10);
		cuenta4.setTipo("A");
		

		//Crear una cuenta5 utilizando el contrusctor que recibe los tres parametros y modficar los  de ser necesario
		Cuenta cuenta5= new Cuenta("0557","C",10);
		

		//Crear una cuenta6 utilizando el contrusctor que recibe los tres parametros y modficar los  de ser necesario
		Cuenta cuenta6= new Cuenta("0666","A",0);
		
		cuenta4.imprimirConMiEstilo();
		cuenta5.imprimirConMiEstilo();
		cuenta6.imprimirConMiEstilo();
	}

}
