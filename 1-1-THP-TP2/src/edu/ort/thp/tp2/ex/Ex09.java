package edu.ort.thp.tp2.ex;

import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int contCiclo = 0, contNums = 0, num, sumatoria = 0;
		double promedio;

		while (contCiclo < 5) {
			while (contNums < 3) {
				System.out.println("Grupo numero " + (contCiclo + 1));
				System.out.println("Ingrese un numero:");
				num = scan.nextInt();
				contNums++;
				sumatoria += num;

			}
			promedio = sumatoria / contNums;
			System.out.println("Promedio del grupo numero " + (contCiclo + 1) + ": " + promedio);
			contCiclo++;
			contNums = 0;
			sumatoria = 0;
		}
		
		scan.close();
	}
}
