package edu.ort.thp.tp3.ex;

import edu.ort.thp.tp3.ex.ex2.clases.TarjetaDeCredito;

public class Ex2 {

	public static void main(String[] args) {
		
		TarjetaDeCredito miTarjeta = new TarjetaDeCredito("4546", "Matias Romera", 5000);
		System.out.println(miTarjeta);
		miTarjeta.realizarCompra(500);
		System.out.println(miTarjeta);
		miTarjeta.actualizarLimite(3000);
		System.out.println(miTarjeta);
		System.out.println();
		
		TarjetaDeCredito tarjeta = new TarjetaDeCredito("4145414122221111", "Juan Perez", 10000);
		System.out.println(tarjeta);
		tarjeta.realizarCompra(4000);
		System.out.println(tarjeta);
		tarjeta.actualizarLimite(3000);
		System.out.println(tarjeta);
		

	}

}
