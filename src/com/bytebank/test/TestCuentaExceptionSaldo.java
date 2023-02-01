package com.bytebank.test;

public class TestCuentaExceptionSaldo {
	public static void main(String[] args) {
		com.bytebank.modelo.Cuenta cuenta = new com.bytebank.modelo.cuentaAhorro(123, 456);
		cuenta.depositar(200);
		cuenta.saca(210);
	}
}
