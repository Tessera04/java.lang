package com.bytebank.test;

import com.bytebank.modelo.cuentaCorriente;

public class TestArrayReferencias {
	
	public static void main(String[] args) {
		
		cuentaCorriente cc = new cuentaCorriente(23, 44);
		
		cuentaCorriente[] cuentas = new cuentaCorriente[5];
		cuentas[1] = cc;
		
		System.out.println(cc);
		System.out.println(cuentas[1]);
		
		cuentas[0] = new cuentaCorriente(11, 99);
		System.out.println(cuentas[0]);
		
		for (int i = 0; i < cuentas.length; i++) {
			System.out.println(cuentas[i]);
		}
	}
	
}
