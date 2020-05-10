package edu.ort.thp.tp3.ex.ex7.clases;

public class Automovil {

	private String marca, modelo, patente;
	private double capacidadTotalCombustible, cantidadCombustible, kmPorLitro;

	public boolean cargarCombustible(double litrosCargar) {
		boolean i = verificarCantidadCombustible(litrosCargar);
		if (i) {
			cantidadCombustible += litrosCargar;
		} else {
			i = false;
		}
		return i;
	}

	private boolean verificarCantidadCombustible(double litrosCargar) {
		boolean i = false;
		if ((this.capacidadTotalCombustible - this.cantidadCombustible) >= litrosCargar) {
			i = true;
		}
		return i;
	}

	public boolean viajar(double kms) {
		boolean i = false;
		double combustibleUsado = this.kmPorLitro * kms / 100;
		if (this.cantidadCombustible >= combustibleUsado) {
			i = true;
			this.cantidadCombustible = this.cantidadCombustible - (this.kmPorLitro * kms / 100);
		}
		return i;
	}

	public Automovil(String marca, String modelo, String patente) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.patente = patente;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public double getCapacidadTotalCombustible() {
		return capacidadTotalCombustible;
	}

	public void setCapacidadTotalCombustible(double capacidadTotalCombustible) {
		this.capacidadTotalCombustible = capacidadTotalCombustible;
	}

	public double getCantidadCombustible() {
		return cantidadCombustible;
	}

	public void setCantidadCombustible(double cantidadCombustible) {
		this.cantidadCombustible = cantidadCombustible;
	}

	public double getKmPorLitro() {
		return kmPorLitro;
	}

	public void setKmPorLitro(double kmPorLitro) {
		this.kmPorLitro = kmPorLitro;
	}

	@Override
	public String toString() {
		return "Automovil [marca=" + marca + ", modelo=" + modelo + ", patente=" + patente
				+ ", capacidadTotalCombustible=" + capacidadTotalCombustible + ", cantidadCombustible="
				+ cantidadCombustible + ", kmPorLitro=" + kmPorLitro + "]";
	}

}
