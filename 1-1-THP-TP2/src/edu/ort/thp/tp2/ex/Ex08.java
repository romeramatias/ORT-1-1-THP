package edu.ort.thp.tp2.ex;

public class Ex08 {
	public static void main(String[] args) {
		
		System.out.println(esMultiplo(5, 3));
		System.out.println(esMultiplo(15, 3));
		
		
	}
	
	public static boolean esMultiplo(int num1, int num2) {
		boolean retorno = false;
		
		if (num1 % num2 == 0) {
			retorno = true;
		}
		
		return retorno;
	}
}
