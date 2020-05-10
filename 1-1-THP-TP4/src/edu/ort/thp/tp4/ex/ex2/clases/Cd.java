package edu.ort.thp.tp4.ex.ex2.clases;

import java.util.ArrayList;

public class Cd {

	private String nombre;
	// a. canciones: un arraylist de objetos de la clase Cancion.
	private ArrayList<Cancion> canciones = new ArrayList<>();
	// b. contador: la siguiente posición libre del array canciones.
	private int contador;

	public void elimina(int i){
		System.out.println(this.canciones.get(i) + " eliminada");
		canciones.remove(i);
		this.contador = this.canciones.size();
	}
	
	public void agrega(Cancion cancion){
		canciones.add(cancion);
		System.out.println(cancion + " agregada");
		this.contador = this.canciones.size();

	}
	
	public void grabaCancion(int i, Cancion cancion){
		canciones.set(i, cancion);
	}
	
	public void dameCancion(int i){
		System.out.println(canciones.get(i));
	}
	
	public int numeroCanciones(){
		return contador;
	}
	
	public Cd(String nombre) {
		super();
		this.nombre = nombre;
		this.canciones = new ArrayList<>();	
	}

	public ArrayList<Cancion> getCanciones() {
		return canciones;
	}

	public void setCanciones(ArrayList<Cancion> canciones) {
		this.canciones = canciones;
	}

	public int getContador() {
		return contador;
	}

	public void setContador(int contador) {
		this.contador = contador;
	}
	 
	@Override
	public String toString() {
		return "Cd [nombre=" + nombre + ", canciones=" + canciones + "]";
	}

	
}
