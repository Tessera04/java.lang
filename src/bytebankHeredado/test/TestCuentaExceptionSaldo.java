package bytebankHeredado.test;

public class TestCuentaExceptionSaldo {
	public static void main(String[] args) {
		bytebankHeredado.Modelo.Cuenta cuenta = new bytebankHeredado.Modelo.cuentaAhorro(123, 456);
		cuenta.depositar(200);
		cuenta.saca(210);
	}
}
