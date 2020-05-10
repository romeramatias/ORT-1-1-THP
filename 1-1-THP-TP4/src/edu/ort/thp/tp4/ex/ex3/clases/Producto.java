package edu.ort.thp.tp4.ex.ex3.clases;

public class Producto {

	private String nombre;
	private double precio;
	private String id;
	
	
	public Producto(String nombre, double precio, String id) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.id = id;
	}
	
	public void mostrar() {
		System.out.print("ID:" + this.id + " NOMBRE: " + this.nombre + " PRECIO: $" + this.precio);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	
	
}
