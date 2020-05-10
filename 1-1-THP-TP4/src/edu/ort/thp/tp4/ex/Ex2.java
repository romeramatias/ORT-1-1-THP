/*
 * ENUNCIADO
2. Desarroll� una clase CD con los siguientes atributos:
a. canciones: un arraylist de objetos de la clase Cancion.
b. contador: la siguiente posici�n libre del array canciones.
y los siguientes m�todos:
 c. CD(): constructor predeterminado (crear� el array canciones).
 d. numeroCanciones(): devuelve el valor del contador de canciones.
 e. dameCancion(int): devuelve la Cancion que se encuentra en la posici�n indicada.
 f. grabaCancion(int, Cancion): cambia la Cancion de la posici�n indicada por la nueva
Cancion proporcionada.
 g. agrega(Cancion): agrega al final del array la Cancion proporcionada.
 h. elimina(int): elimina la Cancion que se encuentra en la posici�n indicada.
 */

package edu.ort.thp.tp4.ex;

import edu.ort.thp.tp4.ex.ex2.clases.Cancion;
import edu.ort.thp.tp4.ex.ex2.clases.Cd;

public class Ex2 {

	public static void main(String[] args) {
		
		// c. CD(): constructor predeterminado (crear� el array canciones).
		Cd cd1 = new Cd("x100pre");
		
		// Creo 10 objetos de tipo Cancion 
 		Cancion cancion1 = new Cancion("Canci�n 1");
		Cancion cancion2 = new Cancion("Canci�n 2");
		Cancion cancion3 = new Cancion("Canci�n 3");
		Cancion cancion4 = new Cancion("Canci�n 4");
		Cancion cancion5 = new Cancion("Canci�n 5");
		Cancion cancion6 = new Cancion("Canci�n 6");
		Cancion cancion7 = new Cancion("Canci�n 7");
		Cancion cancion8 = new Cancion("Canci�n 8");
		Cancion cancion9 = new Cancion("Canci�n 9");
		Cancion cancion10 = new Cancion("Canci�n 10");
		
		// g. agrega(Cancion): agrega al final del array la Cancion proporcionada.
		cd1.agrega(cancion1);
		cd1.agrega(cancion2);
		cd1.agrega(cancion3);
		cd1.agrega(cancion4);
		cd1.agrega(cancion5);
		cd1.agrega(cancion6);
		cd1.agrega(cancion7);
		cd1.agrega(cancion8);
		cd1.agrega(cancion9);
		cd1.agrega(cancion10);
		System.out.println("");

		// d. numeroCanciones(): devuelve el valor del contador de canciones.
		System.out.println("Cantidad de canciones: " + cd1.numeroCanciones());
		
		// e. dameCancion(int): devuelve la Cancion que se encuentra en la posici�n indicada.
		cd1.dameCancion(6);
		
		// f. grabaCancion(int, Cancion): cambia la Cancion de la posici�n indicada por la nueva
		// cancion proporcionada.
		Cancion cancion11 = new Cancion("Canci�n 11");
		cd1.grabaCancion(0, cancion11);
	
		// h. elimina(int): elimina la Cancion que se encuentra en la posici�n indicada.
		cd1.elimina(0);
		
		
		
	}

}
