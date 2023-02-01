package bytebankHeredado.test;

public class TestReferencias {
	
	public static void main(String[] args) {
		
	//EL ELEMENTO MAS GENERAL PUEDE SER ADAPTADO AL MAS ESPECIFICO,
	//PERO NO AL REVES.
		bytebankHeredado.Modelo.Funcionario funcionario = new bytebankHeredado.Modelo.Gerente();
		funcionario.setNombre("Elu");
		
		bytebankHeredado.Modelo.Gerente gerente = new bytebankHeredado.Modelo.Gerente();
		gerente.setNombre("Matias");
		
		funcionario.setSalario(2000);
		gerente.setSalario(5000);
		
		gerente.iniciarSesion("12345");
	}
	
}
