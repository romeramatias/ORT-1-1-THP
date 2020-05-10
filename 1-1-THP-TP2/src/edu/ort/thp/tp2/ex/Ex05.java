package edu.ort.thp.tp2.ex;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		int cantNums = 0;
		double promedio, sumatoria = 0;
		final double PROM = 20.0;
		Scanner scan = new Scanner(System.in);

		do {
			System.out.println("Ingrese un numero:");
			int num = scan.nextInt();
			cantNums++;
			sumatoria += num;
			promedio = sumatoria / cantNums;
		} while (promedio <= PROM);

		System.out.println("Promedio de " + PROM + " excedido");
		System.out.println("Promedio actual: " + promedio);
		System.out.println("Cantidad de numeros leidos: " + cantNums);
		
		scan.close();
	}
}
