package edu.ort.thp.tp1.ex;
import java.util.Scanner;
public class Ex07 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un numero:");
		int num1 = scan.nextInt();
		System.out.println("Ingrese otro numero:");
		int num2 = scan.nextInt();
		System.out.println("Ingrese por ultima vez un numero:");
		int num3 = scan.nextInt();
		int numMax = 0;
		
		if (num1 > num2 && num1 > num3){
			numMax = num1;}
		else if (num2 > num1 && num2 > num3){
			numMax = num2;}
		else if (num3 > num1 && num3 > num2){
			numMax = num3;}
		else if (num1 == num2 && num1 == num3 && num2 == num3){
			System.out.println("Los tres numeros son iguales");}
	
		if (numMax != 0)
		System.out.println("El mayor de los numeros es: " + numMax);
		
		scan.close();
	}

}
