package q09;

public class Bebida {
	String nome;
	float preco;
	String status;
	Cliente cliente;
	
	public Bebida(String n, float p, String s) {
		this.nome = n;
		this.preco = p;
		this.status = s;
	}
	public String toString() {
		return "Nome: "+this.nome+
			   "\nPreco: "+this.preco+
			   "\nStatus: "+this.status;
	}
}
