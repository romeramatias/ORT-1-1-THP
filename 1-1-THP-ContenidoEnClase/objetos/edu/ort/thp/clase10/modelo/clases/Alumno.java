package edu.ort.thp.clase10.modelo.clases;

public class Alumno {

	private String nombre, dni;
	private Enum<Conocimiento> conocimiento;
	private Enum<Estado> estado;
	private double deuda;

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", dni=" + dni + ", conocimiento=" + conocimiento + ", estado=" + estado
				+ ", deuda=" + deuda + "]";
	}

	public Alumno(String nombre, String dni, Enum<Conocimiento> conocimiento, Enum<Estado> estado, double deuda) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.conocimiento = conocimiento;
		this.estado = estado;
		this.deuda = deuda;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Enum<Conocimiento> getConocimiento() {
		return conocimiento;
	}

	public void setConocimiento(Enum<Conocimiento> conocimiento) {
		this.conocimiento = conocimiento;
	}

	public Enum<Estado> getEstado() {
		return estado;
	}

	public void setEstado(Enum<Estado> estado) {
		this.estado = estado;
	}

	public double getDeuda() {
		return deuda;
	}

	public void setDeuda(double deuda) {
		this.deuda = deuda;
	}

}
