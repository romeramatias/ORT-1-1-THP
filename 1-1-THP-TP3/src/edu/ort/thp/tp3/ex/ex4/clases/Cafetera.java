package edu.ort.thp.tp3.ex.ex4.clases;

public class Cafetera {

	private int cantMax, cantActual;

	public void agregarCafe(int valor){
		if (this.cantMax >= valor){
			this.cantActual += valor;
		}
			
	}
	
	public void vaciarCafetera(){
		this.cantActual = 0;
	}
	
	public void servirTaza(int valor){
		if (this.cantActual < valor)
			this.cantActual = 0;
		else {
			this.cantActual -= valor;
		}
	}
	
	public void llenarCafetera(){
		this.cantActual = this.cantMax;
	}
	
	public Cafetera() {
		super();
		this.cantMax = 1000;
		this.cantActual = 0;
	}

	public Cafetera(int cantMax) {
		super();
		this.cantMax = cantMax;
		this.cantActual = cantMax;
	}

	public Cafetera(int cantMax, int cantActual) {
		super();
		if (cantActual > cantMax){
			this.cantActual = cantActual;
			this.cantMax = cantActual;
		} else {
			this.cantMax = cantMax;
			this.cantActual = cantActual;
		}
	}

	@Override
	public String toString() {
		return "Cafetera [cantMax=" + cantMax + ", cantActual=" + cantActual + "]";
	}

	
	public int getCantMax() {
		return cantMax;
	}

	public void setCantMax(int cantMax) {
		this.cantMax = cantMax;
	}

	public int getCantActual() {
		return cantActual;
	}

	public void setCantActual(int cantActual) {
		this.cantActual = cantActual;
	}


	
}
