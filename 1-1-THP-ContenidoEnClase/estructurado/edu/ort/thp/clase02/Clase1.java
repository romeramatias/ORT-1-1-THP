package edu.ort.thp.clase02;

import java.util.Scanner;

public class Clase1 {

	public static void main(String[] args) {

		Scanner info = new Scanner(System.in);
		System.out.println("Ingrese un numero:");
		int num1 = info.nextInt();
		System.out.println("Ingrese otro numero:");
		int num2 = info.nextInt();
		System.out.println("Ingrese otro numero:");
		int num3 = info.nextInt();
		System.out.println("Ingrese otro numero:");
		int num4 = info.nextInt();
		int max;

		if (num1 > num2)
			max = num1;
		else
			max = num2;
		if (max < num3)
			max = num3;
		if (max < num4)
			max = num4;

		/*
		 * if(num1 > num2 && num1 > num3){ max = num1; }else if (num2 > num1 && num2 >
		 * num3){ max = num2; }else{ max = num3; }
		 */

		System.out.println("El mayor numero es: " + max);
		info.close();
	}
}
