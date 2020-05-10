package edu.ort.thp.tp3.ex;

import edu.ort.thp.tp3.ex.ex6.clases.Vuelo;

public class Ex6 {

	public static void main(String[] args) {
		
		Vuelo miVuelo = new Vuelo("Buenos Aires", "Miami", "01-11-2019", 717, 200);
		System.out.println(miVuelo);
		
		System.out.println(miVuelo.reservar(150));
		System.out.println(miVuelo);
		
		System.out.println(miVuelo.liberarAsientos(100));
		System.out.println(miVuelo);

	}

}
