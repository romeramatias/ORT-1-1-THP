package edu.ort.thp.tp3.ex;

import edu.ort.thp.tp3.ex.ex3.clases.Superheroe;

public class Ex3 {

	public static void main(String[] args) {
		
		Superheroe batman = new Superheroe("Batman", 90, 70, 0);
		Superheroe superman = new Superheroe("Superman", 95, 60, 70);
		
		int duelo1 = superman.jugar(batman);
		System.out.println(duelo1);
		int duelo2 = batman.jugar(superman);
		System.out.println(duelo2);
		
	}

}
