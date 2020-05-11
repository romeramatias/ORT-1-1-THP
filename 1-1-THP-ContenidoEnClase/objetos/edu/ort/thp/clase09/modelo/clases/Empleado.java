package edu.ort.thp.clase09.modelo.clases;

public class Empleado {

	private String dni, nombreCompleto;
	private Enum<Dieta> dieta;
	private Enum<Cargo> cargo;

	@Override
	public String toString() {
		return "Empleado [dni=" + dni + ", nombreCompleto=" + nombreCompleto + ", dieta=" + dieta + ", cargo=" + cargo
				+ "]";
	}

	public Empleado(String dni, String nombreCompleto, Enum<Dieta> dieta, Enum<Cargo> cargo) {
		super();
		this.dni = dni;
		this.nombreCompleto = nombreCompleto;
		this.dieta = dieta;
		this.cargo = cargo;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public Enum<Dieta> getDieta() {
		return dieta;
	}

	public void setDieta(Enum<Dieta> dieta) {
		this.dieta = dieta;
	}

	public Enum<Cargo> getCargo() {
		return cargo;
	}

	public void setCargo(Enum<Cargo> cargo) {
		this.cargo = cargo;
	}

}
