package edu.ort.thp.tp4.ex;

import edu.ort.thp.tp4.ex.ex5.clases.Agenda;
import edu.ort.thp.tp4.ex.ex5.clases.Persona;

public class Ex5 {

	public static void main(String[] args) {
		
		Persona p1 = new Persona("Matias", "Romera", "39645204", "1122334455", "asd@gmail.com");	
		Persona p2 = new Persona("Juan", "Perez", "38994465", "1144885754", "asd2@gmail.com");	
		Persona p3 = new Persona("Pedro", "Rodriguez", "94638364", "4442-9984", "asd3@gmail.com");	
		Persona p4 = new Persona("Lucas", "Sanchez", "40564728", "3432-4843", "asd4@gmail.com");	
		Persona p5 = new Persona("Tomas", "Callegari", "422827493", "4764-4726", "asd5@gmail.com");	

		Agenda miAgenda = new Agenda();
		
		miAgenda.agregarPersona(p1);
		miAgenda.agregarPersona(p2);
		miAgenda.agregarPersona(p3);
		miAgenda.agregarPersona(p4);
		miAgenda.agregarPersona(p5);

		System.out.println(miAgenda);

		miAgenda.eliminarPersona(p5);
		
		System.out.println(miAgenda);
		
		System.out.println(miAgenda.buscarMedianteDni("39645204"));
		miAgenda.mostarBuscarMedianteDni("39645204");
		
	}

}
