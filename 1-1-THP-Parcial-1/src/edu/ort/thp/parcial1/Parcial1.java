package edu.ort.thp.parcial1;

import java.util.Scanner;

public class Parcial1 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		final int VAL_CORTE = 0;
		int numCliente, cantidad, porcDesc, clienteMayor = 0;
		double descuento, importeVenta, totalDescuentos = 0, totalVentas = 0, ventaMayor = 0;
		String prenda;
		
		
		numCliente = leerEntero("Ingrese numero de cliente:");
		while (numCliente != VAL_CORTE){
			
			prenda = leerPrenda();
			cantidad = leerEntero("Ingrese cantidad a comprar:");
			importeVenta = calcularCosto(prenda, cantidad);
			porcDesc = funcionAzar();
			descuento = obtenerDescuentoCompra(importeVenta, porcDesc);	
			importeVenta = importeVenta - descuento;
			System.out.println("Su descuento en esta compra será de " + (porcDesc*10) + "% = " + descuento );
			System.out.println("El importe de su compra es de $" + importeVenta);
			if (importeVenta > ventaMayor){
				clienteMayor = numCliente;
			 	ventaMayor = importeVenta; }
			totalDescuentos = totalDescuentos + descuento;	
			totalVentas = totalVentas + importeVenta;
			numCliente = leerEntero("Ingrese numero de cliente nuevamente:");

		}
			
			System.out.println("El total de ventas fue de $" + totalVentas);
			System.out.println("El cliente que mas facturó fue el numero: " + clienteMayor);
			System.out.println("La suma de dinero total que se descontó de los clientes fue de $" + totalDescuentos);
			
			
	}

	public static int leerEntero(String cartel) {
		int valor;
		System.out.println(cartel);
		valor = scan.nextInt();
		return valor;
	}
	
	public static String leerPrenda(){
		String valor;
		final String REM = "A1";
		final String BUZ = "A2";
		final String PAN = "A3";
		System.out.println("Ingrese prenda a comprar A1 para REMERA, A2 para BUZO o A3 para PANTALON");
		valor = scan.next();
		while (!(valor.contentEquals(REM) || valor.contentEquals(BUZ) || valor.contentEquals(PAN))) {
			System.out.println("Error. Ingrese REMERA=A1, BUZO=A2 o PANTALON=A3");
			valor = scan.next();}
		return valor;	
		
	}
	
	public static int funcionAzar(){
		int result;
		final int BASE = 1;
		final int TOPE = 5;
		result =(int)((Math.random())*(TOPE+1-BASE))+BASE;
		return result;}

	public static int calcularCosto(String prenda, int cant){
		int precio = 0, costo;
		
		switch (prenda){
		case "A1":
			precio = 200;
			break;
		case "A2":
			precio = 300;
			break;
		case "A3":
			precio = 400;
			break;
		}
		
		costo = precio * cant;
		return costo;
		
	}
	
	public static double obtenerDescuentoCompra(double costo, int desc){
		double valor;
		valor = costo * (desc*10) / 100;
		return valor;
	}
	
}
