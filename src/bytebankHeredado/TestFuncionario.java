package bytebankHeredado;

public class TestFuncionario {
	public static void main(String[] args) {
		Funcionario Matias = new Gerente();
		Matias.setDocumento("42129182");
		Matias.setNombre("Matias");
		Matias.setSalario(2000);
		Matias.setTipo(0);
		
		System.out.println(Matias.getSalario());
		System.out.println(Matias.getBonificacion());
	}
}
