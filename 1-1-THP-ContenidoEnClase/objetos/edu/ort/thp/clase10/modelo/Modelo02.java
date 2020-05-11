package edu.ort.thp.clase10.modelo;

import java.util.Scanner;

import edu.ort.thp.clase10.modelo.clases.*;

public class Modelo02 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		// Modelo de parcial Academia de Ingles
		
		// Creacion del objeto Academia
		Academia ComoSeDice = new Academia("Como Se Dice");

		// Inscripcion de algunos alumnos harcodeando
		ComoSeDice.incribirAlumno("Matias", "39645204", Conocimiento.INTERMEDIO);
		ComoSeDice.incribirAlumno("Juan", "40123456", Conocimiento.AVANZADO);
		ComoSeDice.incribirAlumno("Pedro", "30123456", Conocimiento.BASICO);
		ComoSeDice.incribirAlumno("Alberto", "20123456", Conocimiento.BASICO);

		System.out.println();

		// Inscripcion de alumnos por teclado modularizado
		inscribirAlumnosPorTeclado(ComoSeDice);

		// Inscribo nuevamente a un alumno existente para que de "Alumno existente"
		ComoSeDice.incribirAlumno("Matias", "39645204", Conocimiento.INTERMEDIO);

		// Doy de BAJA a un alumno
		ComoSeDice.ingresarBajaAlumno("39645204");

		// Ingreso por teclado el nivel de conocimiento
		// Y muestro la cantidad de alumnos en ese nivel
		Enum<Conocimiento> conocimiento = leerConocimiento();
		ComoSeDice.listarAlumnosNivel(conocimiento);

		// Pruebo el metodo de cargar pagos
		ComoSeDice.cargarPago("39645204", 1500);

	}

	public static void inscribirAlumnosPorTeclado(Academia academia) {
		final String VAL_CORTE = "0";
		String nombre, dni;
		Enum<Conocimiento> conocimiento;

		dni = leerString("Ingrese numero de documento para incribir un alumno:");
		while (!(dni.equals(VAL_CORTE))) {
			nombre = leerString("Ingrese nombre:");
			conocimiento = leerConocimiento();
			academia.incribirAlumno(nombre, dni, conocimiento);
			dni = leerString("Ingrese dni de nuevo alumno o 0 para terminar de inscribir alumnos:");
		}
	}

	public static String leerString(String cartel) {
		String valor;
		System.out.println(cartel);
		valor = scan.next();
		return valor;
	}

	public static Enum<Conocimiento> leerConocimiento() {
		Enum<Conocimiento> conocimiento = null;
		String c;
		System.out.println("Ingrese nivel de conocimiento: B=BASICO, I=INTERMEDIO O A=AVANZADO");
		c = scan.next().toUpperCase();
		while (!(c.equals("B") || c.equals("I") || c.equals("A"))) {
			System.out.println("ERROR. Ingrese nivel de conocimiento: B=BASICO, I=INTERMEDIO O A=AVANZADO");
			c = scan.next().toUpperCase();
		}

		switch (c) {
		case "B":
			conocimiento = Conocimiento.BASICO;
			break;
		case "I":
			conocimiento = Conocimiento.INTERMEDIO;
			break;
		case "A":
			conocimiento = Conocimiento.AVANZADO;
			break;
		}

		return conocimiento;
	}

}
