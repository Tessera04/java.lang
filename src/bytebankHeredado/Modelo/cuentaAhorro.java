package bytebankHeredado.Modelo;

public class cuentaAhorro extends Cuenta {

	public cuentaAhorro(int agencia, int numero) {
		super(agencia, numero);
	}

	@Override
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	
}
