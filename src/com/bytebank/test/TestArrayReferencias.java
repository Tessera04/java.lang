package com.bytebank.test;

import com.bytebank.modelo.cuentaCorriente;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.cuentaAhorro;


public class TestArrayReferencias {
	
	public static void main(String[] args) {
		
		cuentaCorriente cc = new cuentaCorriente(23, 44);
		
		Cuenta[] cuentas = new Cuenta[5];
		cuentas[1] = cc;
		
		cuentaAhorro ca = new cuentaAhorro(11, 23);
		cuentas[2] = ca;
		
		//CAST DE ETIQUETAS
		cuentaCorriente cuenta = (cuentaCorriente) cuentas[1];
		System.out.println(cuenta);
		
		System.out.println(cc);
		System.out.println(cuentas[1]);
		
		System.out.println(ca);
		System.out.println(cuentas[2]);
		
		cuentas[0] = new cuentaCorriente(11, 99);
		System.out.println(cuentas[0]);
		
		for (int i = 0; i < cuentas.length; i++) {
			System.out.println(cuentas[i]);
		}
	}
	
}
