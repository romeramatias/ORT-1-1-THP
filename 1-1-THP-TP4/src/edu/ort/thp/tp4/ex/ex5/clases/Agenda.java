package edu.ort.thp.tp4.ex.ex5.clases;

import java.util.ArrayList;

public class Agenda {
	
	private ArrayList<Persona> personas;

	public ArrayList<Persona> getPersonas() {
		return personas;
	}

	public void setPersonas(ArrayList<Persona> personas) {
		this.personas = personas;
	}

	@Override
	public String toString() {
		return "Agenda [personas=" + personas + "]";
	}

	public Agenda() {
		this.personas = new ArrayList<>();
	}
	
	public void agregarPersona(Persona persona){
		this.personas.add(persona);
	}
	
	public void agregarPersona2(String nombre, String apellido, String dni, String telefono, String mail) {
		Persona pEncontrada = null;
		pEncontrada = buscarMedianteDni(dni); 
		if (pEncontrada == null){
			Persona persona = new Persona(nombre, apellido, dni, telefono, mail);
			personas.add(persona);
		} else {
			System.out.println(pEncontrada.getNombre() + ": contacto existente");
		}					
	}
		
	public void eliminarPersona(Persona persona){
		this.personas.remove(persona);
	}
	
	public void mostarBuscarMedianteDni(String dni){
		Persona pEncontrada = null;
		Persona auxiliar;
		int indice = 0;
		while (pEncontrada == null && indice < this.personas.size()){ // null siempre se compara con ==
			auxiliar = this.personas.get(indice);
			if (auxiliar.getDni().equals(dni)){
				pEncontrada = auxiliar;
			}
			indice++;
		}
		
		if(pEncontrada == null){
			System.out.println("No encontre en la agenda a alguien con ese dni");
		} else {
			System.out.println("Encontre la persona buscada");
			pEncontrada.mostrarPersona();
		}
	}
	
	
	public Persona buscarMedianteDni(String dni){ //Devuelve una persona
		Persona pEncontrada = null;
		Persona auxiliar;
		int indice = 0;
		while (pEncontrada == null && indice < this.personas.size()){ // null siempre se compara con ==
			auxiliar = this.personas.get(indice);
			if (auxiliar.getDni().equals(dni)){
				pEncontrada = auxiliar;
			}
			indice++;
		}
		return pEncontrada;
	}
	
	public void mostrarContactos(){
		for (Persona p: this.personas){
			System.out.println("Nombre: " + p.getNombre());
			System.out.println("Apellido: " + p.getApellido());
			System.out.println("DNI: " + p.getDni());
			System.out.println("Telefono: " + p.getTelefono());
			System.out.println("Mail: " + p.getMail());
			System.out.println();
		}
	}
	
	
	
}
