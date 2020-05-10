package edu.ort.thp.tp3.ex;

import edu.ort.thp.tp3.ex.ex7.clases.Automovil;

public class Ex7 {

	public static void main(String[] args) {
		
		Automovil fiesta = new Automovil("Ford", "Fiesta", "ABC123");
		fiesta.setCapacidadTotalCombustible(40);
		fiesta.setCantidadCombustible(20);
		fiesta.setKmPorLitro(10);
		System.out.println(fiesta.cargarCombustible(10));
		System.out.println("CANT COMBUST: " + fiesta.getCantidadCombustible());
		System.out.println(fiesta.viajar(20));
		System.out.println("CANT COMBUST: " + fiesta.getCantidadCombustible());


	}

}
