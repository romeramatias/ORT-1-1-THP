package edu.ort.thp.tp1.ex;
import java.util.Scanner;
public class Ex11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String fechaCompra, nombreComprador, nombreProd;
		int cantidad, precio;
		
		System.out.println("Ingrese fecha de compra:");
		fechaCompra = scan.nextLine();
		System.out.println("Ingrese nombre del comprador:");
		nombreComprador = scan.nextLine();
		System.out.println("Ingrese nombre del producto:");
		nombreProd = scan.nextLine();
		System.out.println("Ingrese cantidad comprada:");
		cantidad = scan.nextInt();
		System.out.println("Ingrese precio unitario:");
		precio = scan.nextInt();

		System.out.println("SU TICKET:");
		System.out.println("Fecha de compra:" + fechaCompra);
		System.out.println("Nombre del comprador: " + nombreComprador);
		System.out.println("Producto solicitado: " + nombreProd);
		System.out.println("Cantidad solicitada: " + cantidad);
		System.out.println("Precio unitario: " + precio);
		System.out.println("Total a pagar: " + (cantidad*precio));
		
		scan.close();
	}

}
