package edu.ort.thp.clase03;

import java.util.Scanner;

public class Clase1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int num1;
		int cont;
		int mult;
		final int TOPE = 10;

		System.out.println("Ingrese un numero:");
		num1 = scan.nextInt();
		System.out.println("Ingrese un contador:");
		cont = scan.nextInt();

		while (cont <= TOPE) {
			mult = num1 * cont;
			System.out.println(num1 + "*" + cont + "=" + mult);
			cont++;
		}

		scan.close();
	}

}
