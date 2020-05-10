package edu.ort.thp.tp1.ex;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		boolean estaEnA = false;
		boolean estaEnB = false;
		boolean estaEnAmbos = false;
		boolean noEstaEnNinguno = false;
		int num;
		
		System.out.println("Ingrese un numero:");
		num = scan.nextInt();
		
		if (num > 0 && num < 10)
			estaEnA = true;
		if (!(num % 2 == 0))
			estaEnB = true;
		if ((num > 0 && num < 10) && !(num % 2 == 0))
			estaEnAmbos = true;
		if (!(num > 0 && num < 10) && (num % 2 == 0))
			noEstaEnNinguno = true;
		
		System.out.println("Es un numero de un digito: " + estaEnA);
		System.out.println("Es un numero impar: " + estaEnB);
		System.out.println("Es un numero de un digito y es impar: " + estaEnAmbos);
		System.out.println("No es un numero de  un digito y es par: " + noEstaEnNinguno);
		
		scan.close();
		
	}

}
