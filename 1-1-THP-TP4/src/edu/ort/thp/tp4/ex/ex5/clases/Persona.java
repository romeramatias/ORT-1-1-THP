package edu.ort.thp.tp4.ex.ex5.clases;

public class Persona {

	private String nombre, apellido, dni, telefono, mail;

	public void mostrarPersona(){
			System.out.println("Nombre: " + getNombre());
			System.out.println("Apellido: " + getApellido());
			System.out.println("DNI: " + getDni());
			System.out.println("Telefono: " + getTelefono());
			System.out.println("Mail: " + getMail());
			System.out.println();
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", telefono=" + telefono
				+ ", mail=" + mail + "]";
	}

	public Persona(String nombre, String apellido, String dni, String telefono, String mail) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.telefono = telefono;
		this.mail = mail;
	}
	
	
	
}

