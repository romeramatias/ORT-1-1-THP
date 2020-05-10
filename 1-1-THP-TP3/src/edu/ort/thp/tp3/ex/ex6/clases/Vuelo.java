package edu.ort.thp.tp3.ex.ex6.clases;

public class Vuelo {
	
	private String origen, destino, fecha;
	private int numero, capacidadTotal, asientosOcupados;
	
	public boolean reservar(int pasajeros){
		boolean i = false;
		if((this.capacidadTotal - this.asientosOcupados) >= pasajeros){
			i = true;
			this.asientosOcupados += pasajeros;
		}
		
		return i;
	}
	
	public boolean liberarAsientos (int liberar){
		boolean i = false;
		if (this.asientosOcupados >= liberar){
			i = true;
			this.asientosOcupados -= liberar;
		}
		
		return i;
	}
	
	public Vuelo(String origen, String destino, String fecha, int numero, int capacidadTotal) {
		super();
		this.origen = origen;
		this.destino = destino;
		this.fecha = fecha;
		this.numero = numero;
		this.capacidadTotal = capacidadTotal;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getCapacidadTotal() {
		return capacidadTotal;
	}

	public void setCapacidadTotal(int capacidadTotal) {
		this.capacidadTotal = capacidadTotal;
	}

	public int getAsientosOcupados() {
		return asientosOcupados;
	}

	public void setAsientosOcupados(int asientosOcupados) {
		this.asientosOcupados = asientosOcupados;
	}

	@Override
	public String toString() {
		return "Vuelo [origen=" + origen + ", destino=" + destino + ", fecha=" + fecha + ", numero=" + numero
				+ ", capacidadTotal=" + capacidadTotal + ", asientosOcupados=" + asientosOcupados + "]";
	}
	
	
}
