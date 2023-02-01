package bytebankHeredado.Modelo;

public class cuentaCorriente extends Cuenta {
	
	public cuentaCorriente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	//SOBREESCRITURA DE METTODO, NO BORRAR EL OVERRIDE.
	@Override
	public void saca(double valor) {
		double comision = 0.2;
		super.saca(valor + comision);
	}

	@Override
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
}
