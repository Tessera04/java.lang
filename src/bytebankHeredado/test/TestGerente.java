package bytebankHeredado.test;

public class TestGerente {
	public static void main(String[] args) {
		//Funcionario gerente = new Funcionario();
		bytebankHeredado.Modelo.Gerente gerente = new bytebankHeredado.Modelo.Gerente();
		gerente.setSalario(3000);
		gerente.setClave("12345");
		gerente.setTipo(1);
		
		System.out.println(gerente.getBonificacion());
		System.out.println(gerente.iniciarSesion("12345"));
	}
}
