package questao_estoque;

public class Estoque {

	String nome;
	int quantidadeAtual;
	int quantidadeMinima;


	// TESTES

	public String getNome() {
		return nome;
	}

	public void mudarNome(String nome) {
		this.nome = nome;
	}

	public int getMin() {
		return quantidadeMinima;
	}

	public void mudarQuantidadeMinima(int quantidadeMinima) {
		this.quantidadeMinima = quantidadeMinima;
	}

	/*
	 
	// QUESTÃO
	 
	public Estoque() {

	}

	public Estoque(String nome1, int quantidadeAtual1, int quantidadeMinima1) {
		nome = nome1;
		quantidadeAtual = quantidadeAtual1;
		quantidadeMinima = quantidadeMinima1;
	}

	
	void mudarNome(String nomeNovo) {
		nome = nomeNovo;
	}

	void mudarQuantidadeMinima(int novaQuantidadeMinima) {
		quantidadeMinima = novaQuantidadeMinima;
	}
	
	
	void reposicao(int quantidade) {
		quantidadeAtual += quantidade;
	}
	

	void darBaixa(int quantidade) {
		quantidadeAtual -= quantidade;
	}

	String mostrar() {
		System.out.println("\n\nProduto: " + nome + "\nQuantidade Atual: " + quantidadeAtual + "\nQuantidade Minima: "
				+ quantidadeMinima);
		return nome;
	}

	boolean precisaReposicao() {
		if (quantidadeAtual <= quantidadeMinima) {
			return true;
		} else {
			return false;
		}
	}
	*/

}