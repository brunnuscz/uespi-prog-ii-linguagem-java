package questao4;

public enum TipoFuncionario {
	
	EXECUTIVO(1800), ADIMINISTRATIVO(2000), EMPRESSARIAL(2700);
	
	private double salario;
	
	TipoFuncionario(double salario){
		this.salario = salario;
	}
	
	public double getSalario() {
		return this.salario;
	}
	
}
