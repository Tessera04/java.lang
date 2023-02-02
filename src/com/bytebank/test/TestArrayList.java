package com.bytebank.test;

import java.util.ArrayList;

import com.bytebank.modelo.*;

public class TestArrayList {

	public static void main(String[] args) {
		
		ArrayList<Cuenta> lista = new ArrayList<>();
		Cuenta cc = new cuentaCorriente(12, 34);
		Cuenta cc2 = new cuentaCorriente(56, 78);
		Cuenta cc3 = new cuentaCorriente(12, 34);
		
		lista.add(cc);
		lista.add(cc2);
		
		//ESTA LINEA DE CODIGO NO COMPILARIA SI TENEMOS FORZADO UN SOLO TIPO DE 
		//OBJETO CON EL <> DE ARRAYLIST
		
		//Cliente cliente = new Cliente();
		//lista.add(cliente);
		
		Cuenta obtenerCuenta = lista.get(0);
		System.out.println(obtenerCuenta);
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		
		boolean contiene = lista.contains(cc3);
		//COMPARA POR REFERENCIA
		if (contiene) {
			System.out.println("Si, es igual (equals)");
		}
		
		//COMPARA POR VALORES
		if (cc.esIgual(cc3)) {
			System.out.println("Si son iguales");
		}
		
	}
	
}
