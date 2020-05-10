package edu.ort.thp.tp3.ex;
import edu.ort.thp.tp3.ex.ex1.clases.Persona;
public class Ex1 {

	public static void main(String[] args) {
		
		Persona p1 = new Persona();
		p1.setNombre("Juan");
		p1.setApellido("Perez");
		p1.setDireccion("Calle 123");
		
		System.out.println(p1.getNombre());
		System.out.println(p1.getApellido());
		System.out.println(p1.getDireccion());
		System.out.println(p1);
		System.out.println();
	
		Persona p2 = new Persona();
		p2.setNombre("Pablo");
		p2.setApellido("Rodriguez");
		p2.setDireccion("Avenida 123");
		
		System.out.println(p2.getNombre());
		System.out.println(p2.getApellido());
		System.out.println(p2.getDireccion());
		System.out.println(p2);

	
	}

}
