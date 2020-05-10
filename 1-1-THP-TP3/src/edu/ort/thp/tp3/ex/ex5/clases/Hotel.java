package edu.ort.thp.tp3.ex.ex5.clases;

public class Hotel {

	private String nombre, localidad;
	private int habTotales, habDisp;

	public boolean ocuparHabitaciones(int valor) {
		boolean i = false;
		if (valor < this.habDisp) {
			i = true;
			this.habDisp -= valor;
		}
		return i;
	}

	public boolean desocuparHabitaciones(int valor) {
		boolean i = false;
		if (this.habTotales >= (valor + this.habDisp)) {
			i = true;
			this.habDisp = this.habDisp + valor;
		}
		return i;
	}

	public Hotel() {
		super();
	}

	public Hotel(String nombre, String localidad, int habTotales, int habDisp) {
		super();
		this.nombre = nombre;
		this.localidad = localidad;
		this.habTotales = habTotales;
		this.habDisp = habDisp;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public int getHabTotales() {
		return habTotales;
	}

	public void setHabTotales(int habTotales) {
		this.habTotales = habTotales;
	}

	public int getHabDisp() {
		return habDisp;
	}

	public void setHabDisp(int habDisp) {
		this.habDisp = habDisp;
	}

	@Override
	public String toString() {
		return "Hotel [nombre=" + nombre + ", localidad=" + localidad + ", habTotales=" + habTotales + ", habDisp="
				+ habDisp + "]";
	}

}
