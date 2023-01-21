package bytebankHeredado;

public class TestReferencias {
	
	public static void main(String[] args) {
		
	//EL ELEMENTO MAS GENERAL PUEDE SER ADAPTADO AL MAS ESPECIFICO,
	//PERO NO AL REVES.
		Funcionario funcionario = new Gerente();
		funcionario.setNombre("Elu");
		
		Gerente gerente = new Gerente();
		gerente.setNombre("Matias");
		
		funcionario.setSalario(2000);
		gerente.setSalario(5000);
		
		gerente.iniciarSesion("12345");
	}
	
}
