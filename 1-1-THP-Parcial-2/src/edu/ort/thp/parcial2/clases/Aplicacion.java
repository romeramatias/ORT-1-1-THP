package edu.ort.thp.parcial2.clases;

public class Aplicacion {

	private String nombre, fecha;
	private int tamanio;
	
	@Override
	public String toString() {
		return "Aplicacion [nombre=" + nombre + ", fecha=" + fecha + ", tamanio=" + tamanio + "]";
	}
	
	public Aplicacion(String nombre, String fecha, int tamanio) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
		this.tamanio = tamanio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public int getTamanio() {
		return tamanio;
	}
	public void setTamanio(int tamanio) {
		this.tamanio = tamanio;
	}
	
	
}
