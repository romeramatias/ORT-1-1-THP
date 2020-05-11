package edu.ort.thp.clase01;

public class Clase1 {

	public static void main(String[] args) {
		int edad = 18;
		final int MAYORIA = 16; // Final es necesario si la variable es constante, deja de ser variable y pasa a
								// ser constante tiene que estar en mayusculas
		String nombre = "Florencia";

		if (edad > 0 && edad < 120) {
			if (edad >= MAYORIA) {
				System.out.println(nombre + ", puede votar");
			} else
				System.out.println(nombre + ", tenes que volver en " + (MAYORIA - edad) + " años");
		} else
			System.out.println("Edad fuera de rango");
	}
}
