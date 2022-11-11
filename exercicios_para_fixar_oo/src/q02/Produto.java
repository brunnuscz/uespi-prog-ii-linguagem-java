package q02;

public class Produto {
	String marca;
	String nome;
	float preco;
	String numPercentePrateleira;
	
	public String toString() {
		return "\nMarca do Produto: "+this.marca+
			   "\nNome do Produto: "+this.nome+
			   "\nPreco do Produto: "+this.preco+
		       "\nNumero Pertencente a Prateleira: "+this.numPercentePrateleira;
	}
}
