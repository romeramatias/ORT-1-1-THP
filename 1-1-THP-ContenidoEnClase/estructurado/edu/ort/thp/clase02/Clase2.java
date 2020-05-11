package edu.ort.thp.clase02;

import java.util.Scanner;

public class Clase2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int dia;
		final int DOMINGO = 1;
		final int LUNES = 2;
		final int MARTES = 3;
		final int MIERCOLES = 4;
		final int JUEVES = 5;
		final int VIERNES = 6;
		final int SABADO = 7;

		System.out.println("Ingrese un numero del 1 al 7:");
		dia = scan.nextInt();

		if (dia == DOMINGO) {
			System.out.println("El dia es Domingo");
		} else if (dia == LUNES) {
			System.out.println("El dia es Lunes");
		} else if (dia == MARTES) {
			System.out.println("El dia es Martes");
		} else if (dia == MIERCOLES) {
			System.out.println("El dia es Miercoles");
		} else if (dia == JUEVES) {
			System.out.println("El dia es Jueves");
		} else if (dia == VIERNES) {
			System.out.println("El dia es Viernes");
		} else if (dia == SABADO) {
			System.out.println("El dia es Sabado");
		} else {
			System.out.println("Error, no indica un dia valido");
		}
		scan.close();
	}
}
