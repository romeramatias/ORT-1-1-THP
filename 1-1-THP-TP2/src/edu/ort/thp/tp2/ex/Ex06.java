package edu.ort.thp.tp2.ex;
import java.util.Scanner;
public class Ex06 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int cont, cantAlumnos;
		double promedios = 0, mejorProm;
		cont = 1;
		cantAlumnos = 3;
		String mejorAlumn, alumnos = null;
	
		do {	
		System.out.println("Ingresa nombre de alumno " + cont + "°:");
		mejorAlumn = scan.next();
		System.out.println("Ingrese el promedio del alumno N° " + cont + ":");
		mejorProm = scan.nextDouble();
		cont++;
		if (promedios > mejorProm){
			mejorProm = promedios;
			mejorAlumn = alumnos;}
		} while (cont <= cantAlumnos);

		System.out.println("El mejor promedio lo tiene " + mejorAlumn + " con un promedio de " + mejorProm);
		
		scan.close();
		
		
	}

}
