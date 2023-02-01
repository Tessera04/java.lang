package com.bytebank.test;

import com.bytebank.modelo.*;

public class TestCuentaExceptionSaldo {
	public static void main(String[] args) {
		Cuenta cuenta = new cuentaAhorro(123, 456);
		cuenta.depositar(200);
		cuenta.saca(210);
	}
}
