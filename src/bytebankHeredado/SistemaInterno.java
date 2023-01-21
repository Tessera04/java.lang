package bytebankHeredado;

public class SistemaInterno {
	
	private String clave = "12345";
	
	public boolean autentica(FuncionarioAutenticable funcionarioAutenticable) {
		boolean puedeIniciarSesion = funcionarioAutenticable.iniciarSesion(clave);
		if (puedeIniciarSesion) {
			System.out.println("Login Exitoso");
			return true;
		}else {
			System.out.println("Error al conectarse");
			return false;
		}
	}
	
}
