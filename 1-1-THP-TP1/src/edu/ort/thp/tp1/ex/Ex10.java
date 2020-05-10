package edu.ort.thp.tp1.ex;
import java.util.Scanner;
public class Ex10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int horaIngresada;
		final int HORA_APERTURA = 10;
		final int HORA_CIERRE = 18;
		boolean estaAbierto = false;
		
		System.out.println("Ingrese horario:");
		horaIngresada = scan.nextInt();
		
		if ((horaIngresada > HORA_APERTURA && horaIngresada < HORA_CIERRE)) {
			estaAbierto = true;
			System.out.println("Esta abierto: " + estaAbierto);}
		else 
			System.out.println("Esta abierto: " + estaAbierto);
		
		if (horaIngresada < 0 || horaIngresada > 24)
			System.out.println("Ha ingresado una hora incorrecta");
		
		
		scan.close();
	}

}
