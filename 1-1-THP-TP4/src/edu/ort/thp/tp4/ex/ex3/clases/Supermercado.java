package edu.ort.thp.tp4.ex.ex3.clases;

import java.util.ArrayList;

public class Supermercado {

	private ArrayList<Producto> productos;
	private ArrayList<Pedido> pedidos;
	
	
	public void realizarPedido() {
		Pedido p = new Pedido();
		ItemPedido item1 = new ItemPedido(getProductoPorId("1"), 5);
		ItemPedido item2 = new ItemPedido(getProductoPorId("2"), 2);
		ItemPedido item3 = new ItemPedido(getProductoPorId("3"), 4);

		p.agregarItems(item1);
		p.agregarItems(item2);
		p.agregarItems(item3);
	
		this.pedidos.add(p);
		p.imprimirTicket();
	}
	
//	private void mostrarProductos() {
//		for (Producto producto : productos) {
//			producto.mostrar();
//		}
//	}


	private Producto getProductoPorId(String idLeida) {
		Producto p = null;
		int i = 0;
		
		while (p == null && i < this.productos.size()) {
			if (this.productos.get(i).getId().equals(idLeida)) {
				p = this.productos.get(i);
				}
			i++;
		}
		
		return p;
	}

//	private boolean buscarPorId(String idLeida) {
//		boolean encontre = false;
//		int i = 0;
//		
//		while (encontre == false && i < this.productos.size()) {
//			if (this.productos.get(i).getId().equals(idLeida)) {
//				encontre = true;
//			}
//			i++;
//		}
//		
//		return encontre;
//	}

	public Supermercado() {
		super();
		this.productos = new ArrayList<>();
		this.pedidos = new ArrayList<>();
		agregarProductosEnunciado();
	}
	
	private void agregarProductosEnunciado() {
		this.productos.add(new Producto("Oreo", 20, "1"));
		this.productos.add(new Producto("Pepitos", 18, "2"));
		this.productos.add(new Producto("Cepita", 20, "3"));
	}
	
//
//	
//	// Deprecated
//	private ItemPedido lectorDeItemPedido(String cartel) {
//		String idLeida;
//		int cantidad;
//		final String VAL_CORTE = "F";
//		@SuppressWarnings("resource")
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println(cartel);
//		idLeida = scan.nextLine();
//		System.out.println(buscarPorId(idLeida));
//		
//		while (!buscarPorId(idLeida)) {
//			System.out.println(cartel);
//		}
//		Producto producto = getProductoPorId(idLeida);
//		
//		System.out.println("Ingrese cantidad a llevar:");
//		cantidad = scan.nextInt();
//		
//		
//		
//		ItemPedido item = new ItemPedido(producto, cantidad);
//		return item;
//	}
}

