package edu.ort.thp.tp1.ex;
import java.util.Scanner;
public class Ex09 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese capital aportado por socio 1:");
		int socio1 = scan.nextInt();
		System.out.println("Ingrese capital aportado por socio 2:");
		int socio2 = scan.nextInt();
		System.out.println("Ingrese capital aportado por socio 3:");
		int socio3 = scan.nextInt();
		
		int capital = socio1 + socio2 + socio3;
		System.out.println("El socio 1 aportó: " + ((socio1 * 100) / capital) + "% del capital");
		System.out.println("El socio 2 aportó: " + ((socio2 * 100) / capital) + "% del capital");
		System.out.println("El socio 3 aportó: " + ((socio3 * 100) / capital) + "% del capital");
		System.out.println("El total del capital aportado es: $" + capital);
		
		scan.close();
	}

}
