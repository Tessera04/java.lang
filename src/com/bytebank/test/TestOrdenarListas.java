package com.bytebank.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import com.bytebank.modelo.*;

public class TestOrdenarListas {

	public static void main(String[] args) {
		//CUENTAS A ORDENAR CON EL ORDENADOR DE CUENTAS
		/*
		Cuenta cc1 = new cuentaCorriente(22, 33);
		cc1.depositar(333.0);
		
		Cuenta cc2 = new cuentaAhorro(22, 44);
		cc1.depositar(444.0);
		
		Cuenta cc3 = new cuentaCorriente(22, 11);
		cc1.depositar(222.0);
		
		Cuenta cc4 = new cuentaAhorro(22, 22);
		cc1.depositar(111.0);
		
		List<Cuenta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		System.out.println("Antes de ordenar");
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		*/
		
		//ORDENADOR DE CUENTAS CON CLIENTE
		Cuenta cc1 = new cuentaCorriente(22, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNombre("Matias");
		cc1.setTitular(clienteCC1);
		cc1.depositar(333.0);
		
		Cuenta cc2= new cuentaAhorro(22, 44);
		Cliente clienteCC2= new Cliente();
		clienteCC2.setNombre("Eluney");
		cc2.setTitular(clienteCC2);
		cc2.depositar(444.0);
		
		Cuenta cc3= new cuentaAhorro(22, 11);
		Cliente clienteCC3= new Cliente();
		clienteCC3.setNombre("Franco");
		cc3.setTitular(clienteCC3);
		cc3.depositar(111.0);
		
		Cuenta cc4= new cuentaCorriente(22, 22);
		Cliente clienteCC4= new Cliente();
		clienteCC4.setNombre("Mario");
		cc4.setTitular(clienteCC4);
		cc4.depositar(222.0);
		
		List<Cuenta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		System.out.println("Antes de ordenar");
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		
		
		// ORDENAR LAS CUENTAS
		Comparator<Cuenta> comparator = new OrdenadorCuentas();
		lista.sort(comparator);
		
		System.out.println("Despues de ordenar");
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		
		Comparator<Cuenta> comparatorNombreTitular= new OrdenadorCuentasTitular();
		lista.sort(comparatorNombreTitular);
		
		System.out.println("Despues de ordenar por nombre titular");
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
	}
}

class OrdenadorCuentas implements Comparator<Cuenta> {

	@Override
	public int compare(Cuenta o1, Cuenta o2) {
		//forma basica
		/*
		if(o1.getNumero() == o2.getNumero()) {
			return 0;
		}else if (o1.getNumero() > o2.getNumero()) {
			return 1;
		}else {
			return -1;
		}
		*/
		
		//Forma intermedia
		/*
		return o1.getNumero() - o2.getNumero();
		*/
		
		//Forma Wrapper
		return Integer.compare(o1.getNumero(), o2.getNumero());
	}
	
}

class OrdenadorCuentasTitular implements Comparator<Cuenta> {

	@Override
	public int compare(Cuenta o1, Cuenta o2) {
		return o1.getTitular().getNombre()
				.compareTo(o2.getTitular().getNombre());
	}
	
}




