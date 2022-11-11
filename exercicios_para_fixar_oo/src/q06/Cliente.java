package q06;

public class Cliente {
	String nome;
	String cpf;
	Viagem viagem;
	Agenda agenda;
	
	public Cliente(String novoNome, String novoCpf){
		this.nome = novoNome;
		this.cpf = novoCpf;
	}
}
