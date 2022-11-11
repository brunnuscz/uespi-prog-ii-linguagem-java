package q01;

public class Funcionario {
	String nome;
	int idade;
	float salario;
	Cargo cargo = new Cargo();
	
	@Override
	public String toString() {
		return "\nNome Funcionario: "+this.nome+
			   "\nIdade Funcionario: "+this.idade+
			   "\nSalario Funcionario: "+this.salario+
			   "\nCargo Funcionario: "+this.cargo.nomeCargo;
	}
}
