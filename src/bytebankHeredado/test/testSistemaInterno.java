package bytebankHeredado.test;

public class testSistemaInterno {
	public static void main(String[] args) {
		bytebankHeredado.Modelo.SistemaInterno sistema = new bytebankHeredado.Modelo.SistemaInterno();
		bytebankHeredado.Modelo.Gerente gerente1 = new bytebankHeredado.Modelo.Gerente();
		bytebankHeredado.Modelo.Administrador admin = new bytebankHeredado.Modelo.Administrador();
		
		sistema.autentica(gerente1);
		sistema.autentica(admin);
	}
}
