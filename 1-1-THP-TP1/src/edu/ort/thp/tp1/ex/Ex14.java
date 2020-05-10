package edu.ort.thp.tp1.ex;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		final String S = "s";
		final String R = "r";
		final String M = "m";
		final String D = "d";
		final String operacion;
		int num1, num2;
		
		System.out.println("Ingrese un numero:");
		num1 = scan.nextInt();
		System.out.println("Ingrese otro numero:");
		num2 = scan.nextInt();
		System.out.println("Ingrese operacion a realizar (s, r, m, d):");
		operacion = scan.next();
		
		switch (operacion){
		case S:
			System.out.println(num1 + num2);
			break;
		case R:
			System.out.println(num1 - num2);
			break;
		case M:
			System.out.println(num1 * num2);
			break;	
		case D:
			System.out.println(num1 / num2);
			break;
		default:
			System.out.println("Operacion incorrecta");
			break;
		}
	
		
		scan.close();
	}

}
