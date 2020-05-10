package edu.ort.thp.tp1.ex;
import java.util.Scanner;
public class Ex06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un numero mayor que cero:");
		int num1 = scan.nextInt();
		
		if(num1 > 0 && num1 % 2 == 0){
			System.out.println("El numero es par");
		} else {
			System.out.println("El numero es impar");}
		
		scan.close();

	}

}
