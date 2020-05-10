package edu.ort.thp.tp1.ex;
import java.util.Scanner;
public class Ex12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int dado1, dado2, dado3;
		System.out.println("Dado 1:");
		dado1 = scan.nextInt();
		System.out.println("Dado 2:");
		dado2 = scan.nextInt();
		System.out.println("Dado 3:");
		dado3 = scan.nextInt();
		
		if (dado1 == 6 && dado2 == 6 && dado3 == 6){
			System.out.println("Excelente");}
		else if (dado1 == 6 || dado2 == 6 || dado3 == 6){
			System.out.println("Muy bien");}
		else if (dado1 > 6 && dado2 > 6 && dado3 > 6)
			System.out.println("Insuficiente");
		else
			System.out.println("Regular");
		
		scan.close();
		
		
		
	}

}
