package com.bytebank.test;

public class TestReferencias {
	
	public static void main(String[] args) {
		
	//EL ELEMENTO MAS GENERAL PUEDE SER ADAPTADO AL MAS ESPECIFICO,
	//PERO NO AL REVES.
		com.bytebank.modelo.Funcionario funcionario = new com.bytebank.modelo.Gerente();
		funcionario.setNombre("Elu");
		
		com.bytebank.modelo.Gerente gerente = new com.bytebank.modelo.Gerente();
		gerente.setNombre("Matias");
		
		funcionario.setSalario(2000);
		gerente.setSalario(5000);
		
		gerente.iniciarSesion("12345");
	}
	
}
