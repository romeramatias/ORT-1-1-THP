package edu.ort.thp.clase03;

import java.util.Scanner;

public class Clase2 {

	public static void main(String[] args) {

		int cantMaterias, cont;
		double nota, sumNotas, promedios;
		cont = 1;
		sumNotas = 0;
		Scanner scan = new Scanner(System.in);

		System.out.println("Ingrese la cantidad de materias aprobadas:");
		cantMaterias = scan.nextInt();

		/*
		 * if (!valorMaterias){ valorMaterias = true;} else{
		 * System.out.println("Ingrese un numero del 1 al 30 por favor"); cantMaterias =
		 * scan.nextInt();}
		 */

		while (cont <= cantMaterias) {
			System.out.println("Ingrese nota " + cont + ":");
			nota = scan.nextInt();
			sumNotas = nota + sumNotas;
			cont++;
		}

		promedios = sumNotas / cantMaterias;
		System.out.println("El promedio general es: " + promedios);

		scan.close();
	}
}
