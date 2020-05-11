package edu.ort.thp.clase02;

import java.util.Scanner;

public class Clase3 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		final int DOM = 1;
		final int LUN = 2;
		final int MAR = 3;
		final int MIE = 4;
		final int JUE = 5;
		final int VIE = 6;
		final int SAB = 7;
		System.out.println("Ingrese un numero de uno al siete:");
		int num1 = scan.nextInt();

		switch (num1) {
		case DOM:
			System.out.println("Domingo");
			break;
		case LUN:
			System.out.println("Lunes");
			break;
		case MAR:
			System.out.println("Martes");
			break;
		case MIE:
			System.out.println("Miercoles");
			break;
		case JUE:
			System.out.println("Jueves");
			break;
		case VIE:
			System.out.println("Viernes");
			break;
		case SAB:
			System.out.println("Sabado");
			break;
		default:
			System.out.println("Numero invalido");
			break;
		}
		scan.close();

	}
}
