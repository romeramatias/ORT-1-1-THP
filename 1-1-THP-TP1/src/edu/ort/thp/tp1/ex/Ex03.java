package edu.ort.thp.tp1.ex;
import java.util.Scanner;
public class Ex03 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Ingrese su nombre:");
		String nombre = scan.nextLine();
		System.out.println("Bienvenido, " + nombre);
		
		scan.close();
		
	}

}
