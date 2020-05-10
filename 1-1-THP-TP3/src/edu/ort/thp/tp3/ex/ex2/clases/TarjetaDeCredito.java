package edu.ort.thp.tp3.ex.ex2.clases;

public class TarjetaDeCredito {

	private String numero, titular;
	private double limiteCompra, disponible;

	public void actualizarLimite(double nuevoLimite){
		if (this.limiteCompra > nuevoLimite){
		this.disponible = this.disponible - (this.limiteCompra - nuevoLimite);
		this.limiteCompra = nuevoLimite;
		if (this.disponible < 0){
			this.disponible = 0;
		}
		}
	}
	
	public boolean realizarCompra(double valorCompra) {
		boolean compra = false;
		if (this.puedoComprar(valorCompra)) {
			this.disponible = this.disponible - valorCompra;
			compra = true;
		}
		return compra;
	}

	private boolean puedoComprar(double valorCompra) {
		boolean puedo = false;

		if (this.disponible >= valorCompra) {
			puedo = true;
		}

		return puedo;
	}

	public TarjetaDeCredito(String numero, String titular, double limiteCompra) {
		super();
		this.numero = numero;
		this.titular = titular;
		this.limiteCompra = limiteCompra;
		this.disponible = limiteCompra;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getLimiteCompra() {
		return limiteCompra;
	}

	public void setLimiteCompra(double limiteCompra) {
		this.limiteCompra = limiteCompra;
	}

	public double getDisponible() {
		return disponible;
	}

	public void setDisponible(double disponible) {
		this.disponible = disponible;
	}

	@Override
	public String toString() {
		return "TarjetaDeCredito [numero=" + numero + ", titular=" + titular + ", limiteCompra=" + limiteCompra
				+ ", disponible=" + disponible + "]";
	}

}