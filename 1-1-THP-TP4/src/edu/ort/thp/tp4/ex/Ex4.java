package edu.ort.thp.tp4.ex;

import edu.ort.thp.tp4.ex.ex4.clases.Concesionario;

public class Ex4 {

	public static void main(String[] args) {
		
		Concesionario c = new Concesionario();
		
		c.mostrarAutos();
		System.out.println();
		
		c.mostrarAutosMenosKmQue(5000);
		System.out.println();
		
		c.mostrarAutoMayorKms();
		System.out.println();
		
		c.mostrarAutosPorMarca("Bugatti");
		System.out.println();
	
	
	}

}
