package edu.ort.thp.tp4.ex.ex3.clases;

import java.util.ArrayList;

public class Pedido {

	private ArrayList<ItemPedido> items;
	
	public void agregarItems(ItemPedido i) {
		this.items.add(i);
	}
	
	public Pedido() {
		super();
		this.items = new ArrayList<>();
	}

	public ArrayList<ItemPedido> getItems() {
		return items;
	}

	public void setItems(ArrayList<ItemPedido> items) {
		this.items = items;
	}

	public void imprimirTicket() {
		// esto tiene que mostrar los items del ticket y el importe a pagar
		double sum = 0;
		
		
		for (ItemPedido itemPedido : items) {
			sum += itemPedido.importeAPagar();
			itemPedido.mostrar();
		}		
		
		System.out.println("Total a pagar: $" + sum);
	}
	
	
	
	
}
