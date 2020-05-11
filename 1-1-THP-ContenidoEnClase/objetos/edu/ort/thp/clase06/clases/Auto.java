package edu.ort.thp.clase06.clases;

public class Auto {

	// Atributos SIEMPRE privados(Encapsulamiento)
	private String marca, modelo, color, motor, combustible;
	private int cantRuedas, cantPuertas;

	// Mostrar el objeto como String
	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", motor=" + motor
				+ ", combustible=" + combustible + ", cantRuedas=" + cantRuedas + ", cantPuertas=" + cantPuertas + "]";
	}

	// Constructores
	public Auto(String modelo, String color, String motor, String combustible) {
		super();
		this.modelo = modelo;
		this.color = color;
		this.motor = motor;
		this.combustible = combustible;
		this.marca = "Ford";
		this.cantRuedas = 5;
		this.cantPuertas = 4;
	}

	public Auto() {
		super();
	}

	public void repintar(String color) {
		this.color = color; // This se refiere al ATRIBUTO, no a la variable local
		setColor(color);
	}

	// Get's y Set's
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	// Metodo con validacion
	public String devolverMarca(int valor) {
		if (valor < 50) {
			return this.marca;
		} else {
			return "Dato Incorrecto";
		}
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getCombustible() {
		return combustible;
	}

	public void setCombustible(String combustible) {
		this.combustible = combustible;
	}

	public int getCantRuedas() {
		return cantRuedas;
	}

	public void setCantRuedas(int cantRuedas) {
		this.cantRuedas = cantRuedas;
	}

	public int getCantPuertas() {
		return cantPuertas;
	}

	public void setCantPuertas(int cantPuertas) {
		this.cantPuertas = cantPuertas;
	}

}
