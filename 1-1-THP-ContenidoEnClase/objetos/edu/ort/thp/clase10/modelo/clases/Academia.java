package edu.ort.thp.clase10.modelo.clases;

import java.util.ArrayList;

public class Academia {

	private String nombre;
	private int cantAlumnos;
	private ArrayList<Alumno> alumnos;

	// Metodo cargarPago pedido por el enunciado
	public void cargarPago(String dni, double pago) {
		Alumno aEncontrado = null;
		aEncontrado = buscarAlumno(dni);
		if (aEncontrado == null) {
			System.out.println("Alumno no encontrado, no se pudo realizar el pago");
		} else {
			double deuda = aEncontrado.getDeuda();
			deuda -= pago;
			aEncontrado.setDeuda(deuda);
			System.out.println("Pago realizado. Deuda Actual: " + deuda);
		}
	}

	// Metodo ingresarBajaAlumno pedido por el enunciado
	public void ingresarBajaAlumno(String dni) {
		Alumno aEncontrado = null;
		aEncontrado = buscarAlumno(dni);
		if (aEncontrado == null) {
			System.out.println("El alumno tiene deuda o no existe");
		} else if (aEncontrado.getDeuda() == 0) {
			System.out.println("Estado cambiado con exito");
			aEncontrado.setEstado(Estado.BAJA);
		}
	}

	// Metodo inscribirAlumno pedido por el enunciado
	public void incribirAlumno(String nombre, String dni, Enum<Conocimiento> conocimiento) {
		Alumno aEncontrado = null;
		aEncontrado = buscarAlumno(dni);
		if (aEncontrado == null) {
			Alumno alumno = new Alumno(nombre, dni, conocimiento, Estado.ALTA, 0);
			alumnos.add(alumno);
			System.out.println("Alumno " + nombre + " agregado con exito");
		} else {
			System.out.println(aEncontrado.getNombre() + ": alumno existente");
		}
	}

	// Metodo privado buscarAlumno pedido por el enunciado
	private Alumno buscarAlumno(String dni) {
		Alumno aEncontrado = null;
		Alumno auxiliar;
		int indice = 0;
		while (aEncontrado == null && indice < this.alumnos.size()) {
			auxiliar = this.alumnos.get(indice);
			if (auxiliar.getDni().equals(dni)) {
				aEncontrado = auxiliar;
			}
			indice++;
		}
		return aEncontrado;
	}

	// Metodo listarAlumnosNivel pedido por el enunciado
	public void listarAlumnosNivel(Enum<Conocimiento> conocimiento) {
		// Foreach por defecto
		int cantAlumnos = 0;
		for (Alumno a : this.alumnos) {
			if (a.getConocimiento().equals(conocimiento) && a.getEstado().equals(Estado.ALTA)) {
				cantAlumnos++;
			}
		}
		System.out.println("La cantidad de alumnos de " + Estado.ALTA + " en el nivel de conocimiento " + conocimiento
				+ " es de " + cantAlumnos + " alumnos");

	}

	@Override
	public String toString() {
		return "Academia [nombre=" + nombre + ", cantAlumnos=" + cantAlumnos + ", alumnos=" + alumnos + "]";
	}

	public Academia(String nombre) {
		super();
		this.nombre = nombre;
		this.alumnos = new ArrayList<>();
		this.cantAlumnos = this.alumnos.size();

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantAlumnos() {
		return cantAlumnos;
	}

	public void setCantAlumnos(int cantAlumnos) {
		this.cantAlumnos = cantAlumnos;
	}

	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(ArrayList<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

}
