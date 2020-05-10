package edu.ort.thp.tp4.ex.ex3.clases;

public class ItemPedido {

	private Producto producto;
	private int cantidad;
	
	public double importeAPagar() {
		return this.producto.getPrecio() * this.cantidad;
	}
	
	public void mostrar() {
		producto.mostrar();
		System.out.println(" CANTIDAD: " + this.cantidad);
	}
	
	public ItemPedido(Producto producto, int cantidad) {
		super();
		this.producto = producto;
		this.cantidad = cantidad;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


}
