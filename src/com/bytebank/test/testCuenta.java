package com.bytebank.test;

public class testCuenta {
	public static void main(String[] args) {
		com.bytebank.modelo.cuentaCorriente cc = new com.bytebank.modelo.cuentaCorriente(1, 2);
		com.bytebank.modelo.cuentaAhorro ca = new com.bytebank.modelo.cuentaAhorro(2, 3);
		cc.depositar(2000);
		cc.transferir(1000, ca);
		
		System.out.println(cc.getSaldo());
		System.out.println(ca.getSaldo());
	}
}
