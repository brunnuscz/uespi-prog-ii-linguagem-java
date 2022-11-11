package q03;

public class Veiculo {
	String tipoDeVeiculo;
	String nomeVeiculo;
	String cor;
	float preco;
	String placa;
	int ano;
	String estadoDoVeiculo;
	
	public String toString() {
		return " > Tipo: "+this.tipoDeVeiculo+
			   "\n > Nome: "+this.nomeVeiculo+
			   "\n > Cor: "+this.cor+
			   "\n > Preco: "+this.preco+
			   "\n > Ano: "+this.ano+
			   "\n > Placa: "+this.placa+
			   "\n > Estado: "+this.estadoDoVeiculo;
	}
}
