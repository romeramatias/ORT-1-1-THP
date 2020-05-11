package edu.ort.thp.clase04;

import java.util.Scanner;

public class Clase1 {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		String usuario, contra, usuarioOk, contraOk;
		usuarioOk = "abc";
		contraOk = "123";
		int contador = 1;
		final int TOPE = 3;
		boolean usuarioVal = false;
		boolean contraVal = false;

		usuario = ingreseTexto("usuario");
		contra = ingreseTexto("contraseña");
		usuarioVal = validacionTexto(usuario, usuarioOk);
		contraVal = validacionTexto(contra, contraOk);

		while ((!usuarioVal || !contraVal) && contador < TOPE) {
			System.out.println("Error de datos, tiene 3 intentos");
			usuario = ingreseTexto("usuario nuevamente. " + (contador + 1) + "° intento:");
			contra = ingreseTexto("contraseña nuevamente");
			usuarioVal = validacionTexto(usuario, usuarioOk);
			contraVal = validacionTexto(contra, contraOk);
			contador++;
		}

		if (!usuarioVal && !contraVal) {
			System.out.println("Se ha bloqueado su cuenta");
		} else {
			System.out.println("Ha ingresado correctamente");
		}

	}

	public static String ingreseTexto(String cartel) {
		String texto;
		System.out.println("Por favor ingresa tu " + cartel);
		texto = scan.nextLine();
		return texto;

	}

	public static Boolean validacionTexto(String texto, String textoOk) {
		boolean valido = false;
		if (texto.equals(textoOk)) {
			valido = true;
		}
		return valido;
	}

}
