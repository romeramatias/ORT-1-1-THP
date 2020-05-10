/*
 * ENUNCIADO
1. Realizá un programa que lea por teclado 10 números enteros positivos y los guarde en un
ArrayList. A continuación,
a. Calculá y mostrá el promedio de los valores ingresados
b. Calculá y mostrá el promedio de los números que estén en las posiciones pares 
 */
package edu.ort.thp.tp4.ex;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		ArrayList<Integer> numPositivos = new ArrayList<>();
		agregarDiezNumerosPositivos(numPositivos);
		System.out.println("Size/Tamaño de ArrayList: " + numPositivos.size() + " numeros");
		System.out.println("Mostramos toda la ArrayList: " + numPositivos);
		System.out.println("Tomamos el primer número de la ArrayList: " + numPositivos.get(0));

		//a. Calculá y mostrá el promedio de los valores ingresados
		double promedio = promedioNumeros(numPositivos);
		System.out.println("El promedio es: " + promedio);
		;
		//b. Calculá y mostrá el promedio de los números que estén en las posiciones pares
		double promedioPosicionesPares = promedioNumerosPosicionesPares(numPositivos);
		System.out.println("El promedio de numeros de las posiciones pares es de: " + promedioPosicionesPares);
		
		}
	
	
	public static double promedioNumerosPosicionesPares(ArrayList<Integer> numeros){
		double promedio;
		double totalNotas = 0;
		int totalNumeros = 0;
		int indice = 0;
		
		for(int n: numeros){
			if(indice % 2 == 0){
				totalNotas += n;
				totalNumeros++;
			}
			indice++;
		}
		
		promedio = totalNotas / totalNumeros;
		return promedio;
	}
	
	public static double promedioNumeros(ArrayList<Integer> numeros){

		double promedio;
		double totalNumeros = 0;

		for(int n: numeros){  // <--- Foreach
			totalNumeros += n; 
		}
		promedio = totalNumeros / numeros.size();
		return promedio;
	}
	
	public static void agregarDiezNumerosPositivos(ArrayList<Integer> a){
		for (int i = 0; i < 10; i++) {
			int indice = i + 1;
			int num = leerNumeroPositivo(indice);
			a.add(num);
		}
	}
	
	public static int leerNumeroPositivo(int indice){
		int num;
		System.out.println("Ingrese " + indice + "° numero positivo:");
		num = scan.nextInt();
		while (num < 0){
			System.out.println("Error. Ingrese numero positivo:");
			num = scan.nextInt();
		}
		return num;
	}

}
