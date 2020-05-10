package edu.ort.thp.parcial2.clases;

//AGREGADOS PARA TEMA FECHA
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

import java.util.ArrayList;

public class Instalador {

	private int memoriaCel;
	private int memoriaDisponible;
	private ArrayList<Aplicacion> aplicaciones;

	public void Instalar(String nombre, int tamanio, String fecha) {
		Aplicacion aEncontrada = null;
		// Busco si la app esta instalada
		aEncontrada = buscarAplicacion(nombre);
		if (aEncontrada == null) {
			// Si no esta instalada, verifico el espacio memoria
			if (getMemoriaDisponible(tamanio)) {
				// Si hay memoria la instalo
				System.out.println("para " + nombre);
				Aplicacion app = new Aplicacion(nombre, fecha, tamanio);
				aplicaciones.add(app);
				System.out.println("Aplicacion " + nombre + " instalada con exito.");
			} else {
				// Avisamos que no hay memoria dispoble para instalar
				System.out.println("para instalar " + nombre);
			}
		} else {
			// Si la app esta instalada verifico fecha
			actualizarApp(aEncontrada, fecha, tamanio, nombre);

		}
	}

	private void actualizarApp(Aplicacion app, String fecha1, int tamanio, String nombre) {
		String fechaAnterior = app.getFecha(); // Asignamos a una variable la fecha anterior de la app
		if (esFechaMayor(fecha1, fechaAnterior)) {
			// Si es fecha mayor actualiza fecha de app y memoria
			this.memoriaDisponible += app.getTamanio(); // Le devuelvo la memoria ocupada
			// Verifico si hay memoria con el nuevo tamanio
			if (getMemoriaDisponible(tamanio)) { 
				app.setFecha(fecha1); // Si hay actualizo cambio la fecha al objeto
				app.setTamanio(tamanio); // Tambien actualizo el tamanio del objeto
				System.out.println("\nAplicacion " + nombre + " actualizada con exito.");
			} else {
				// Si no hay memoria con el nuevo tamanio, no se puede realizar la instalacion
				this.memoriaDisponible -= app.getTamanio(); // Le devuelvo la memoria ocupado
				System.out.print("No se puede realizar la instalacion debido a la falta de memoria ");
				System.out.println("ya que la actualizacion es mas pesada que la version anterior");
			}
		} else {
			// Si la fecha es menor no es posible instalar
			System.out.println("Fecha anterior. No se puede actualizar " + nombre);
		}
	}

	private boolean getMemoriaDisponible(int tamanio) {
		// Verifica memoria
		if (tamanio < this.memoriaDisponible) {
			System.out.print("Hay memoria disponible ");
			// Restamos el tamanio de la app nueva a la memoria disponible
			this.memoriaDisponible -= tamanio; 
			return true;
		} else {
			System.out.print("No hay memoria disponible ");
			return false;
		}
	}

	private Aplicacion buscarAplicacion(String nombre) {
		// Buscamos en la lista de aplicaciones con un ciclo while hasta que la encuentre, sino retorna null
		Aplicacion aEncontrada = null;
		Aplicacion auxiliar;
		int indice = 0;
		while (aEncontrada == null && indice < this.aplicaciones.size()) {
			auxiliar = this.aplicaciones.get(indice);
			if (auxiliar.getNombre().equals(nombre)) {
				aEncontrada = auxiliar;
			}
			indice++;
		}
		return aEncontrada;
	}

	

	@Override
	public String toString() {
		return "Instalador [memoriaCel=" + memoriaCel + ", memoriaDisponible=" + memoriaDisponible + ", aplicaciones="
				+ aplicaciones + "]";
	}

	public Instalador(int memoriaCel) {
		super();
		this.memoriaCel = memoriaCel;
		this.memoriaDisponible = memoriaCel;
		this.aplicaciones = new ArrayList<>();
	}

	public int getMemoriaCel() {
		return memoriaCel;
	}

	public void setMemoriaCel(int memoriaCel) {
		this.memoriaCel = memoriaCel;
	}

	public ArrayList<Aplicacion> getAplicaciones() {
		return aplicaciones;
	}

	public void setAplicaciones(ArrayList<Aplicacion> aplicaciones) {
		this.aplicaciones = aplicaciones;
	}

	public int getMemoriaDisponible() {
		return memoriaDisponible;
	}

	public void setMemoriaDisponible(int memoriaDisponible) {
		this.memoriaDisponible = memoriaDisponible;
	}

	// NO TOCAR
	public boolean esFechaMayor(String d1, String d2) {
		boolean resul = false;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date date1 = sdf.parse(d1);
			Date date2 = sdf.parse(d2);

			if (date1.after(date2)) {
				resul = true;
			}

		} catch (ParseException ex) {
			ex.printStackTrace();
		}
		return resul;
	}

}
