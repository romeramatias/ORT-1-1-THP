package edu.ort.thp.clase07.clases;

public class Persona {

	private String dni, nombre, apellido;
	private Domicilio domicilio;
	private Fecha fechaDeNacimiento;
	
	public Persona(String dni, String nombre, String apellido, Domicilio domicilio, Fecha fechaDeNacimiento) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.domicilio = domicilio;
		this.fechaDeNacimiento = fechaDeNacimiento;
		
	}

	
	public String nombreCompleto() {
		return this.nombre + " " + this.apellido;
	}
	


	public String getDni() {
		return dni;
	}


	public void setDni(String dni) {
		this.dni = dni;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public Domicilio getDomicilio() {
		return domicilio;
	}


	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}


	public Fecha getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}


	public void setFechaDeNacimiento(Fecha fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}


	
	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", domicilio=" + domicilio
				+ ", fechaDeNacimiento=" + fechaDeNacimiento + "]";
	}

	
	
	
}