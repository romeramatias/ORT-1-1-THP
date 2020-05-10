package edu.ort.thp.tp3.ex.ex3.clases;

public class Superheroe {

	private String nombre;
	private int fuerza, resistencia, superpoderes;

	public int jugar(Superheroe sH) {
		int i = 2;
		int punto1 = 0, punto2 = 0, punto3 = 0;

		if (this.fuerza > sH.fuerza) {
			punto1 = 1;
		}

		if (this.resistencia > sH.resistencia) {
			punto2 = 1;
		}

		if (this.superpoderes > sH.superpoderes) {
			punto3 = 1;
		}

		int acumulado = punto1 + punto2 + punto3;
		if (acumulado >= 2) {
			i = 1;
		} else if (acumulado == 1) {
			i = 2;
		}

		return i;
	}

	public Superheroe(String nombre, int fuerza, int resistencia, int superpoderes) {
		super();
		this.nombre = nombre;
		this.fuerza = fuerza;
		this.resistencia = resistencia;
		this.superpoderes = superpoderes;
	}

	@Override
	public String toString() {
		return "Superheroe [nombre=" + nombre + ", fuerza=" + fuerza + ", resistencia=" + resistencia
				+ ", superpoderes=" + superpoderes + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getFueza() {
		return fuerza;
	}

	public void setFueza(int fuerza) {
		this.fuerza = fuerza;
	}

	public int getResistencia() {
		return resistencia;
	}

	public void setResistencia(int resistencia) {
		this.resistencia = resistencia;
	}

	public int getSuperpoderes() {
		return superpoderes;
	}

	public void setSuperpoderes(int superpoderes) {
		this.superpoderes = superpoderes;
	}

}
