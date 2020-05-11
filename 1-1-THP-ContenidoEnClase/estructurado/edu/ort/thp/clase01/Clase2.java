package edu.ort.thp.clase01;

public class Clase2 {

	public static void main(String[] args) {

		final String INSTITUTO = "ORT";
		String lugar;
		lugar = "UP";

		if (lugar.equals(INSTITUTO)) { // (!lugar.equals... para negarlo
			// if(lugar == INSTITUTO){
			System.out.println("Esta en donde corresponde");
		} else {
			System.out.println("Es de otro lugar");
		}
	}
}
