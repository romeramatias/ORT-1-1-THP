package edu.ort.thp.clase01;

import java.util.Scanner;

public class Clase3 {

	public static void main(String[] args) {

		int edad;
		final int MAYORIA = 16;
		// int precio;
		String nombre;
		Scanner info = new Scanner(System.in);

		System.out.println("Ingrese nombre:");
		nombre = info.nextLine();
		System.out.println(nombre + ", ingrese edad:");
		edad = info.nextInt();
		System.out.println("Ingrese precio de subte");
		// precio = (int)info.nextDouble();

		if (edad > 0 && edad < 120) {
			if (edad >= MAYORIA) {
				System.out.println(nombre + ", puedes votar porque tenes " + edad + " años");
			} else {
				System.out.println(nombre + ", tenes que volver en " + (MAYORIA - edad) + " años");
			}
		} else {
			System.out.println("Edad fuera de rango");
		}
		info.close();
	}

}
