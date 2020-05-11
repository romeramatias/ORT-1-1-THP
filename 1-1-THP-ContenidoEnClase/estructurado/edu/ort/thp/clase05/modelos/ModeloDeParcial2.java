package edu.ort.thp.clase05.modelos;

import java.util.Scanner;

public class ModeloDeParcial2 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// int pedido;

		// pedido = leerPedido();

	}

	public static int leerPedido() {
		int valor;
		System.out.println("Ingrese numero de pedido:");
		valor = scan.nextInt();
		return valor;
	}

}
