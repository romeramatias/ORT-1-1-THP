package edu.ort.thp.clase07;
import java.util.Scanner;

import edu.ort.thp.clase07.clases.*; // El asterisco importa todas las clases del paquete "Clases"
public class Clase7 {

	public static void main(String[] args) {

		int dia, mes, anio;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Ingrese dia de nacimiento:");
		dia = scan.nextInt();
		System.out.println("Ingrese mes de nacimiento:");
		mes = scan.nextInt();
		System.out.println("Ingrese año de nacimiento:");
		anio = scan.nextInt();
		
		
		Fecha fechaNac = new Fecha(dia,mes,anio);
		Domicilio miCasa = new Domicilio("Yatay", 240, "Almagro");
		Persona matias = new Persona("39645204", "Matias", "Romera", miCasa, fechaNac);
		CuentaBancaria cuenta = new CuentaBancaria("CA$", matias);
		
		cuenta.mostrarInfo();
		
		System.out.println("Saldo actual: " + cuenta.getSaldo());
		cuenta.depositar(500);
		System.out.println("Saldo actual: " + cuenta.getSaldo());
		cuenta.extraer(400);
		System.out.println("Saldo actual: " + cuenta.getSaldo());
		
		scan.close();
	}

}
