package edu.ort.thp.tp1.ex;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int horasTrabajadas, sueldo, horasExtrasTrabajadas, salarioExtraTrabajado;
		final int SALARIO = 16;
		final int SALARIOEXTRA = 20;

		
		System.out.println("Ingrese horas trabajadas:");
		horasTrabajadas = scan.nextInt();
		
		if (horasTrabajadas > 40){
			horasExtrasTrabajadas = (horasTrabajadas - 40);	
			salarioExtraTrabajado = horasExtrasTrabajadas * SALARIOEXTRA;
			sueldo = (40 * SALARIO) + salarioExtraTrabajado;} 
		else {
			sueldo = horasTrabajadas * SALARIO; }
		
		System.out.println("Su sueldo es de $" + sueldo);
		
		scan.close();
		
	}

}
