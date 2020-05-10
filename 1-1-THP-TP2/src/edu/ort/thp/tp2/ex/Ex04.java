package edu.ort.thp.tp2.ex;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int num1, num2;
		String pregunta;
		
		System.out.println("Ingrese el primer numero:");
		num1 = scan.nextInt();
		System.out.println("Ingrese segundo numero, debe ser mayor que el anterior:");
		num2 = scan.nextInt();
		
		while (num1 > num2){
			
			System.out.println("Error. El primer numero debe ser menor que el segundo.");
			System.out.println("Ingrese nuevamente el primero numero:");
			num1 = scan.nextInt();
			System.out.println("Ingrese nuevamente el segundo numero:");
			num2 = scan.nextInt();}
		
		System.out.println("Si desea ver el conjunto de numeros INCLUYENDO los ingresados ponga: I");
		System.out.println("Si desea ver el conjunto de numeros EXCLUYENDO los ingresados ponga: E");
		pregunta = scan.next();
		
		while (!(pregunta.equals("E") || pregunta.equals("e") || pregunta.equals("I") || pregunta.equals("i"))){
			System.out.println("Ha ingresado una letra incorrecta, intente nuevamente:");
			pregunta = scan.next();}
			
		if (pregunta.equals("E") || pregunta.equals("e")){
		while (num1 < (num2-1)){
			System.out.println(num1+1);
			num1++;}}
		else if (pregunta.equals("I") || pregunta.equals("i")){
			while (num1 <= num2){
				System.out.println(num1);
				num1++;}}
		
		scan.close();
	}

}
