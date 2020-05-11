package edu.ort.thp.clase06;

import edu.ort.thp.clase06.clases.*;;

public class Clase6 {

	public static void main(String[] args) {

		// Llamando al constructor de 4 parametros
		Auto miAuto = new Auto("Focus", "Blanco", "1.6", "Nafta");
		System.out.println(miAuto); // Sin la funcion "toString" muestra el espacio en la memoria

		// Llamando al constructor sin parametros
		Auto miAuto2 = new Auto();
		System.out.println(miAuto2);

		// Cambiamos el atributo de color
		miAuto.repintar("Verde");
		System.out.println(miAuto);

		// Usamos un get para ver un atributo, se almacena en una variable
		String miMarca = miAuto.getMarca();
		System.out.println("Mi marca de auto es: " + miMarca);

		// Usamos el metodo devolver marca pasando un valor para ver si es valido
		String miMarca2 = miAuto.devolverMarca(55); // NO valido
		System.out.println(miMarca2);
		String miMarca3 = miAuto.devolverMarca(2); // Valido
		System.out.println(miMarca3);

	}

}