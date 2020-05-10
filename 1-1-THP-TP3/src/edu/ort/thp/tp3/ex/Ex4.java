package edu.ort.thp.tp3.ex;

import edu.ort.thp.tp3.ex.ex4.clases.Cafetera;

public class Ex4 {

	public static void main(String[] args) {
		
		Cafetera cafe = new Cafetera();
		System.out.println(cafe);
		cafe.llenarCafetera();
		System.out.println(cafe);
		cafe.servirTaza(1500);
		System.out.println(cafe);
		cafe.agregarCafe(1000);
		System.out.println(cafe);

	}

}
