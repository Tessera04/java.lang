package com.bytebank.test;

import com.bytebank.modelo.*;

public class testCuenta {
	public static void main(String[] args) {
		cuentaCorriente cc = new cuentaCorriente(1, 2);
		cuentaAhorro ca = new cuentaAhorro(2, 3);
		cc.depositar(2000);
		cc.transferir(1000, ca);
		
		System.out.println(cc.getSaldo());
		System.out.println(ca.getSaldo());
	}
}
