package com.bytebank.test;

public class testSistemaInterno {
	public static void main(String[] args) {
		com.bytebank.modelo.SistemaInterno sistema = new com.bytebank.modelo.SistemaInterno();
		com.bytebank.modelo.Gerente gerente1 = new com.bytebank.modelo.Gerente();
		com.bytebank.modelo.Administrador admin = new com.bytebank.modelo.Administrador();
		
		sistema.autentica(gerente1);
		sistema.autentica(admin);
	}
}
