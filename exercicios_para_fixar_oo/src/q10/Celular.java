package q10;

public class Celular {
	String nome;
	float preco;
	String marca;
	String status;
	Cliente cliente;
	
	public String toString() {
		return "Nome: "+this.nome+
			   "\nPreco: "+this.preco+
			   "\nMarca: "+this.marca+
			   "\nStatus: "+this.status;
	}
}
