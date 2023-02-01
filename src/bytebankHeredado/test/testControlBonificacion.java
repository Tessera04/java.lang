package bytebankHeredado.test;

public class testControlBonificacion {
	
	public static void main(String[] args) {
		bytebankHeredado.Modelo.Funcionario elu = new bytebankHeredado.Modelo.Contador();
		elu.setSalario(2000);
		
		bytebankHeredado.Modelo.Gerente matias = new bytebankHeredado.Modelo.Gerente();
		matias.setSalario(5000);
		
		bytebankHeredado.Modelo.Contador franco = new bytebankHeredado.Modelo.Contador();
		franco.setSalario(4000);
		
		bytebankHeredado.Modelo.controlBonificaciones controlBonificacion = new bytebankHeredado.Modelo.controlBonificaciones();
		
		controlBonificacion.registrarSalario(elu);
		controlBonificacion.registrarSalario(matias);
		controlBonificacion.registrarSalario(franco);
	}
}
