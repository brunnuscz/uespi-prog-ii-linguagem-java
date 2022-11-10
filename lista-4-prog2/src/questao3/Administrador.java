package questao3;

public class Administrador extends Empregado {
	int ajudaDeCusto;

	public int getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(int ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}

	@Override
	public String toString() {

		return "\n-----------ADMINISTRADOR-----------\n"+"\nNome: " + nome +
				"\nEndereço: " + endereco +
				"\nSalario Base: " + salarioBase +
				"\nNovo Salario: " + calcularSalario();
	}
	
}
