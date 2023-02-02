package com.bytebank.test;

import com.bytebank.modelo.*;

public class TestGuardaReferencias {
	
	public static void main(String[] args) {
		
		guardaReferencias guardaReferencias = new guardaReferencias();
		Cuenta cc = new cuentaCorriente(11, 20);
		guardaReferencias.adicionar(cc);
		Cuenta cc2 = new cuentaCorriente(22, 30);
		guardaReferencias.adicionar(cc2);
		
		guardaReferencias.obtener(1);
		
		System.out.println(guardaReferencias.obtener(0));
		System.out.println(guardaReferencias.obtener(1));
		
	}
	
}
