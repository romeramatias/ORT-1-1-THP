package edu.ort.thp.tp4.ex.ex4.clases;

import java.util.ArrayList;

public class Concesionario {

	private ArrayList<Auto> autos;

	public Concesionario() {
		super();
		this.autos = new ArrayList<Auto>();
		agregarAutosHardcodeados();
	}

	private void agregarAutosHardcodeados() {
		this.autos.add(new Auto("FST 786", "McLaren", "P1", 10000));
		this.autos.add(new Auto("JRT 226", "Bugatti", "Chiron", 23000));
		this.autos.add(new Auto("GHB 453", "Ferrari", "F50", 7000));
		this.autos.add(new Auto("KHF 777", "Mercedes Benz", "AMG", 50000));
		this.autos.add(new Auto("XSF 134", "Pagani", "Zonda", 0));
		this.autos.add(new Auto("QWE 790", "Bugatti", "Divo", 1300));

	}

	@Override
	public String toString() {
		return "Concesionario [autos=" + autos + "]";
	}

	public ArrayList<Auto> getAutos() {
		return autos;
	}

	public void setAutos(ArrayList<Auto> autos) {
		this.autos = autos;
	}

	public void mostrarAutos() {
		System.out.println("Lista de autos:");
		for (Auto auto : autos) {
			System.out.println(auto);
		}
	}

	public void mostrarAutosPorMarca(String marca) {
		System.out.println("Autos de la marca " + marca + ":");
		for (Auto auto : autos) {
			if (auto.getMarca().equals(marca)) {
				System.out.println(auto);
			}
		}
	}

	public void mostrarAutosMenosKmQue(int kms) {
		System.out.println("Autos con menos de " + kms + " kms");
		for (Auto auto : autos) {
			if (auto.getKms() < kms) {
				System.out.println(auto);
			}
		}
	}

	public void mostrarAutoMayorKms() {
		int max = Integer.MIN_VALUE;
		Auto a = null;

		for (Auto auto : autos) {
			if (auto.getKms() > max) {
				a = auto;
				max = a.getKms();
			}
		}

		System.out.println("El auto con mas kms es:");
		System.out.println(a);
	}

}
