package questao7;

public class Funcionario {
	String nome;
	int data_de_nascimento;
	String cpf;
	String sexo;
	
	void imprimirInfo() {
		System.out.println("\nFuncionario: "+nome+
						   "\nData de Nascimento: "+data_de_nascimento+
						   "\nCPF: "+cpf+
						   "\nSexo: "+sexo);
	}
}
