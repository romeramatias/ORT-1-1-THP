package edu.ort.thp.tp4.ex.ex2.clases;

public class Cancion {
	
	private String nombre;
	
	@Override
	public String toString() {
		return "Cancion [nombre=" + nombre + "]";
	}

	public Cancion(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
