package bytebankHeredado;

public class Gerente extends FuncionarioAutenticable{
	
	private String clave;
	
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public boolean iniciarSesion(String clave) {
		return clave == "12345";
	}
	//SOBREESCRITURA DE METODO
	@Override
	public double getBonificacion() {
		return super.getSalario() + this.getSalario() * 0.05;
	}
}
