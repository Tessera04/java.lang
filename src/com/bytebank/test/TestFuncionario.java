package com.bytebank.test;

public class TestFuncionario {
	public static void main(String[] args) {
		com.bytebank.modelo.Funcionario Matias = new com.bytebank.modelo.Gerente();
		Matias.setDocumento("42129182");
		Matias.setNombre("Matias");
		Matias.setSalario(2000);
		Matias.setTipo(0);
		
		System.out.println(Matias.getSalario());
		System.out.println(Matias.getBonificacion());
	}
}
