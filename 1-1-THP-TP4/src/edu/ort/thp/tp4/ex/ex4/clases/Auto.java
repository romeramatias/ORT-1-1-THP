package edu.ort.thp.tp4.ex.ex4.clases;

public class Auto {

	private String matricula;
	private String marca;
	private String modelo;
	private int kms;
	

	public Auto(String matricula, String marca, String modelo, int kms) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.kms = kms;
	}
	@Override
	public String toString() {
		return "Auto [matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", kms=" + kms + "]";
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
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
	public int getKms() {
		return kms;
	}
	public void setKms(int kms) {
		this.kms = kms;
	}
	
	
}
