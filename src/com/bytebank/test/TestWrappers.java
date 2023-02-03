package com.bytebank.test;

public class TestWrappers {

	public static void main(String[] args) {
		
		Double numeroDouble = 33.0;//AUTOBOXING
		Boolean verdadero = true;
		
		Double numeroDouble2 = Double.valueOf(33);
		System.out.println(numeroDouble2);
		
		String numeroString = "43";//AUTOBOXING
		//String numeroString2 = new String("43");//UNBOXING
		
		Double stringToDouble = Double.valueOf(numeroString);
		Integer stringToInteger = Integer.valueOf(numeroString);
		
		System.out.println(stringToDouble);
		System.out.println(stringToInteger);
		
		Number numero = Integer.valueOf(5);
		double numeroDoublePrim = numero.doubleValue(); //UNBOXING
		
		Boolean falso = Boolean.FALSE;
		
	}
	
}
