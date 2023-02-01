package bytebankHeredado.test;

public class testCuenta {
	public static void main(String[] args) {
		bytebankHeredado.Modelo.cuentaCorriente cc = new bytebankHeredado.Modelo.cuentaCorriente(1, 2);
		bytebankHeredado.Modelo.cuentaAhorro ca = new bytebankHeredado.Modelo.cuentaAhorro(2, 3);
		cc.depositar(2000);
		cc.transferir(1000, ca);
		
		System.out.println(cc.getSaldo());
		System.out.println(ca.getSaldo());
	}
}
