package edu.ort.thp.clase07.clases;

public class CuentaBancaria {

	private String cbu, tipo;
	private Fecha fechaApertura;
	private Persona titular;
	private double saldo;
	
	public CuentaBancaria(String tipo, Persona titular) {
		super();
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = 0;
		this.cbu = generarCbu();
		this.fechaApertura = obtenerFechaDeHoy();
		
	}

	public void mostrarInfo(){
		System.out.println("*******************************");
		System.out.println("El nombre del titular es: " + titular.nombreCompleto());
		System.out.println("DNI: " + titular.getDni());
		System.out.println("CBU: " + getCbu());
		System.out.println("Tipo de cuenta: " + this.tipo);
		System.out.println("Saldo: " + this.saldo);
		System.out.println("*******************************");

	}
	
	public void extraer(double importe){
		if (this.saldo >= importe){
			this.saldo = this.saldo - importe;
		} else {
			System.out.println("No hay saldo suficiente");
		}
			
	}
	
	public void depositar(double importe){
		this.saldo = this.saldo + importe;
	}
	
	private String generarCbu(){
		return "CBU = NUM DE CBU" ;
	}
	
	private Fecha obtenerFechaDeHoy(){
		Fecha hoy = new Fecha(23, 10, 2019);
		return hoy;
	}

	@Override
	public String toString() {
		return "CuentaBancaria [cbu=" + cbu + ", tipo=" + tipo + ", fechaApertura=" + fechaApertura + ", titular="
				+ titular + ", saldo=" + saldo + "]";
	}

	public String getCbu() {
		return cbu;
	}

	public void setCbu(String cbu) {
		this.cbu = cbu;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Fecha getFechaApertura() {
		return fechaApertura;
	}

	public void setFechaApertura(Fecha fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	public Persona getTitular() {
		return titular;
	}

	public void setTitular(Persona titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
}

