package edu.ort.thp.tp3.ex.ex8.clases;

public class Gato {

	private int energia;
	
	
	public boolean alcanzar(Raton raton, int distancia){
		boolean alcanzo = false;
		int metrosRaton = 0, metrosGato = 0;
		
		metrosRaton = raton.correr();
		metrosGato = this.correr();
		
		if (metrosGato >= (metrosRaton + distancia)){
			alcanzo = true;
		}
		
		return alcanzo;
	}
	
	public int correr(){
		int distancia = 0;
		final int RESISTENCIA = 1;
		
		if (this.energia > 0){
			distancia = this.energia / RESISTENCIA;
		}
		
		return distancia;
	}
	
	public Gato(int energia) {
		super();
		this.energia = energia;
	}
	
	@Override
	public String toString() {
		return "Gato [energia=" + energia + "]";
	}
	
	public int getEnergia() {
		return energia;
	}
	
	public void setEnergia(int energia) {
		this.energia = energia;
	}
	
	
	
}