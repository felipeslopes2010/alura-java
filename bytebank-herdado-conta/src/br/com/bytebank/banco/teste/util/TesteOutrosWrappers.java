package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

	public static void main(String[] args) {
		
		Integer idadeRef = Integer.valueOf(29); //autoboxing
		System.out.println(idadeRef.intValue()); //unboxing

		Double dRef = Double.valueOf(3.2);
		System.out.println(dRef.doubleValue());
		
		Boolean bRef = Boolean.FALSE;
		System.out.println(bRef.booleanValue());
		
		Number refNumero = Float.valueOf(29.9f); //Polimorfismo
		
		List<Number> lista = new ArrayList<>(); //Polimorfismo de List e Number
		lista.add(10); //Utilizando classe Number para criar um int
		lista.add(32.6); //Utilizando classe Number para criar um double
		lista.add(25.6f); //Utilizando classe Number para criar um float
		
	}

}
