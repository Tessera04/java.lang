package bytebankHeredado.Modelo;
// entidad Cuenta
public abstract  class Cuenta {
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
	private static int total = 0;
	
	
	
	public Cuenta(int agencia, int numero) {
		
		this.agencia = agencia;
		this.numero = numero;
		
		System.out.println("Estoy creando una cuenta...");
		
		Cuenta.total ++;
		
		//CONTADOR DE CUENTAS CREADAS
		//if(agencia <= 0) {
		//	System.out.println("No es valido");
		//	this.agencia = 1;
		//}else {
		//	this.agencia = agencia;
		//}
		//total++;
		//System.out.println("Se van creando: " + total + " cuentas");
	}
	
	//VOID NO RETORNA VALOR
	public abstract void depositar(double valor);
	
	//BOOLEAN RETORNA VALOR
	public boolean retirar(double valor){
		if (this.saldo >= valor) {
			this.saldo = this.saldo - valor;
			return true;
		} else {
			return false;
		}
	}
	
	public void saca(double valor){
		if(this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo insuficiente");
		}
		this.saldo -= valor;	
	}
	
	public boolean transferir(double valor, Cuenta cuenta){
		if(this.saldo >= valor) {
			this.saca(valor);
			cuenta.depositar(valor);
			return true;
		} else {
			return false;
		}
	}
	
	public double getSaldo() {
		return this.saldo;
	}

	
	public int getAgencia() {
		return agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return titular;
	}
	
	public static int getTotal() {
		return Cuenta.total;
	}
	
}