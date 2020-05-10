package edu.ort.thp.tp1.ex;
import java.util.Scanner;
public class Ex05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese un numero:");
		int num1 = scan.nextInt();
		System.out.println("Ingrese otro numero:");
		int num2 = scan.nextInt();
		
		if (num2==0){
			System.out.println("No se puede dividir por cero");
		}else{
			System.out.println("El resultado de la division es: " + (num1/num2));
		}
		
		scan.close();
		
	}

}
