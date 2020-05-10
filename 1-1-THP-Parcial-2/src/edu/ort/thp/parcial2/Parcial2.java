package edu.ort.thp.parcial2;

import edu.ort.thp.parcial2.clases.Instalador;

public class Parcial2 {

	public static void main(String[] args) {
		
		Instalador instalador = new Instalador(450);
		instalador.Instalar("Whatsapp", 50, "2019-11-15 15:00:00");	
		System.out.println();
		instalador.Instalar("Instagram", 70, "2019-11-20 12:15:30");	
		System.out.println();
		instalador.Instalar("Whatsapp", 155, "2019-11-14 15:00:00");		
		System.out.println();
		instalador.Instalar("Twitter", 100, "2019-11-13 12:00:00");		

		System.out.println(instalador);
	}

}
