package bytebankHeredado.Modelo;

public class Cliente implements Autenticable{
	
	private String nombre;
	private String titular;
	private String documento;
	private String telefono;
	private AutenticacionUtil util;
	
	
	public Cliente() {
		this.util = new AutenticacionUtil();
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	
	public String getDocumento() {
		return documento;
	}
	
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@Override
	public void setClave(String clave) {
		this.setClave(clave);
	}

	@Override
	public boolean iniciarSesion(String clave) {
		return this.util.IniciarSesion(clave);
	}
	
	
}
