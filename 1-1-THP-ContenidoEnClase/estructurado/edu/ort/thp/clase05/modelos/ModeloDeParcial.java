package edu.ort.thp.clase05.modelos;

import java.util.Scanner;

public class ModeloDeParcial {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		final int VALOR_CORTE = 0;
		int denominacionBillete, cantBilletes, contBi10, contBi20, contBi50, contBi100, totalBilletes;
		contBi10 = 0;
		contBi20 = 0;
		contBi50 = 0;
		contBi100 = 0;

		denominacionBillete = leerDenominacion(VALOR_CORTE);
		while (denominacionBillete != VALOR_CORTE) {
			cantBilletes = leerCantidad();
			switch (denominacionBillete) {
			case 10:
				contBi10 = contBi10 + cantBilletes;
				break;
			case 20:
				contBi20 = contBi20 + cantBilletes;
				break;
			case 50:
				contBi50 = contBi50 + cantBilletes;
				break;
			case 100:
				contBi100 = contBi100 + cantBilletes;
				break;
			}
			denominacionBillete = leerDenominacion(VALOR_CORTE);
		}

		totalBilletes = contBi10 + contBi20 + contBi50 + contBi100;
		mostrarRecaudacion(contBi10, contBi20, contBi50, contBi100);
		mostrarMax(contBi10, contBi20, contBi50, contBi100);
		System.out.println("Tenemos un total de " + totalBilletes + " billetes compuestos por:");
		mostrarPorcentaje(contBi10, totalBilletes, 10);
		mostrarPorcentaje(contBi20, totalBilletes, 20);
		mostrarPorcentaje(contBi50, totalBilletes, 50);
		mostrarPorcentaje(contBi100, totalBilletes, 100);

	}

	public static int leerDenominacion(int CORTE) {
		final int DIEZ = 10;
		final int VEINTE = 20;
		final int CINCUENTA = 50;
		final int CIEN = 100;
		int den;

		System.out.println("Ingrese denominacion del billete (10, 20, 50, 100):");
		den = scan.nextInt();
		while (!(den == DIEZ || den == VEINTE || den == CINCUENTA || den == CIEN || den == CORTE)) {
			System.out.println("Error, ingrese un billete valido:");
			den = scan.nextInt();
		}
		return den;
	}

	public static int leerCantidad() {
		int cantidad;
		System.out.println("Ingrese cantidad de billetes:");
		cantidad = scan.nextInt();
		while (cantidad < 0) {
			System.out.println("Error. Ingrese cantidad de billetes:");
			cantidad = scan.nextInt();
		}
		return cantidad;
	}

	public static void mostrarMax(int C10, int C20, int C50, int C100) {
		if (C10 > C20 && C10 > C50 && C10 > C100) {
			System.out.println("Tenemos mas billetes de $10 pesos (" + C10 + ")");
		} else if (C20 > C10 && C20 > C50 && C20 > C100) {
			System.out.println("Tenemos mas billetes de $10 pesos (" + C20 + ")");
		} else if (C50 > C10 && C50 > C20 && C50 > C100) {
			System.out.println("Tenemos mas billetes de $10 pesos (" + C50 + ")");
		} else {
			System.out.println("Tenemos mas billetes de $10 pesos (" + C100 + ")");
		}

	}

	public static void mostrarRecaudacion(int C10, int C20, int C50, int C100) {
		int DIEZ = C10 * 10;
		int VEINTE = C20 * 20;
		int CINCUENTA = C50 * 50;
		int CIEN = C100 * 100;
		int total = DIEZ + VEINTE + CINCUENTA + CIEN;
		System.out.println("Se recaudaron $" + total + " pesos");
	}

	private static void mostrarPorcentaje(int cont, int total, int i) {

		int porc;
		porc = (cont * 100) / total;
		System.out.println(i + " pesos %" + porc);
	}

}