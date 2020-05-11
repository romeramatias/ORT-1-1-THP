package edu.ort.thp.clase09.modelo.clases;

import java.util.ArrayList;

public class Empresa {

	private String nombre;
	private ArrayList<Empleado> empleados;

	@Override // To String
	public String toString() {
		return "Empresa [nombre=" + nombre + ", empleados=" + empleados + "]";
	}

	public Empresa(String nombre, ArrayList<Empleado> empleados) {
		super(); // Constructor
		this.nombre = nombre;
		this.empleados = new ArrayList<>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}

}
