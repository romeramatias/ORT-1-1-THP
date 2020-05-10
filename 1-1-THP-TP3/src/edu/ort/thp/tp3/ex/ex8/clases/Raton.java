package edu.ort.thp.tp3.ex.ex8.clases;

public class Raton {

	private int energia;
	
	
	public int correr(){
		int distancia = 0;
		final int RESISTENCIA = 2;
		
		if (this.energia > 0){
			distancia = this.energia / RESISTENCIA;
		}
		
		return distancia;
	}
	
	@Override
	public String toString() {
		return "Raton [energia=" + energia + "]";
	}

	public Raton(int energia) {
		super();
		this.energia = energia;
	}

	public int getEnergia() {
		return energia;
	}

	public void setEnergia(int energia) {
		this.energia = energia;
	}
	
	
}
