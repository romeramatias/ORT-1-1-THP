package edu.ort.thp.clase07.clases;

public class Domicilio {

	private String calle, barrio;
	private int altura;
	
	public Domicilio(String calle, int altura, String barrio) {
		super();
		this.calle = calle;
		this.barrio = barrio;
		this.altura = altura;
	}
	
	

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getBarrio() {
		return barrio;
	}

	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}



	
	@Override
	public String toString() {
		return "Domicilio [calle=" + calle + ", barrio=" + barrio + ", altura=" + altura + "]";
	}
	
	
	
}