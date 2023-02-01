package com.bytebank.test;

public class testControlBonificacion {
	
	public static void main(String[] args) {
		com.bytebank.modelo.Funcionario elu = new com.bytebank.modelo.Contador();
		elu.setSalario(2000);
		
		com.bytebank.modelo.Gerente matias = new com.bytebank.modelo.Gerente();
		matias.setSalario(5000);
		
		com.bytebank.modelo.Contador franco = new com.bytebank.modelo.Contador();
		franco.setSalario(4000);
		
		com.bytebank.modelo.controlBonificaciones controlBonificacion = new com.bytebank.modelo.controlBonificaciones();
		
		controlBonificacion.registrarSalario(elu);
		controlBonificacion.registrarSalario(matias);
		controlBonificacion.registrarSalario(franco);
	}
}
