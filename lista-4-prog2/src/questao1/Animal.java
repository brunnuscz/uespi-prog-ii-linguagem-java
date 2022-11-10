package questao1;

public class Animal {
	private String nome;
	private double peso;

	MinhaExcecao me = new MinhaExcecao();
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome)throws MinhaExcecao {
		this.nome = nome;
		throw me;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

}
