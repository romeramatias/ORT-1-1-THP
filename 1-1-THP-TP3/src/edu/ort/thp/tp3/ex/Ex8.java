package edu.ort.thp.tp3.ex;
import java.util.Scanner;

import edu.ort.thp.tp3.ex.ex8.clases.Gato;
import edu.ort.thp.tp3.ex.ex8.clases.Raton;
public class Ex8 {

	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese enegia del gato:");
		int energiaGato = scan.nextInt();
		System.out.println("Ingrese energia del raton:");
		int energiaRaton = scan.nextInt();
		
		Gato tom = new Gato(energiaGato);
		Raton jerry = new Raton(energiaRaton);

		System.out.println("Ingrese distancia de ventaja del raton al gato:");
		int distancia = scan.nextInt();
		
		boolean alcanzo = tom.alcanzar(jerry, distancia);
		
		if (alcanzo){
			System.out.println("Pobre Jerry");
		} else {
			System.out.println("Otra vez será...");
		}
		
		scan.close();
	}
}
