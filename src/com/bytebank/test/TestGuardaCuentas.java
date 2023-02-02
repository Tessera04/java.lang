package com.bytebank.test;

import com.bytebank.modelo.*;

public class TestGuardaCuentas {
	
	public static void main(String[] args) {
		
		guardaCuentas guardacuentas = new guardaCuentas();
		Cuenta cc = new cuentaCorriente(11, 20);
		guardacuentas.adicionar(cc);
		Cuenta cc2 = new cuentaCorriente(22, 30);
		guardacuentas.adicionar(cc2);
		
		guardacuentas.obtener(1);
		
		System.out.println(guardacuentas.obtener(0));
		System.out.println(guardacuentas.obtener(1));
		
	}
	
}
