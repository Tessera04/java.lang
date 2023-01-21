package bytebankHeredado;

public class testControlBonificacion {
	
	public static void main(String[] args) {
		Funcionario elu = new Contador();
		elu.setSalario(2000);
		
		Gerente matias = new Gerente();
		matias.setSalario(5000);
		
		Contador franco = new Contador();
		franco.setSalario(4000);
		
		controlBonificaciones controlBonificacion = new controlBonificaciones();
		
		controlBonificacion.registrarSalario(elu);
		controlBonificacion.registrarSalario(matias);
		controlBonificacion.registrarSalario(franco);
	}
}
