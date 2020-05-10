package edu.ort.thp.tp3.ex;

import edu.ort.thp.tp3.ex.ex5.clases.Hotel;

public class Ex5 {

	public static void main(String[] args) {
		
		Hotel hilton = new Hotel("Hilton", "CABA", 200, 200);
		System.out.println(hilton.ocuparHabitaciones(300));
		System.out.println(hilton.ocuparHabitaciones(10));
		System.out.println(hilton.getHabDisp());
		System.out.println(hilton.desocuparHabitaciones(10));
		System.out.println(hilton.getHabDisp());
		

	}

}
