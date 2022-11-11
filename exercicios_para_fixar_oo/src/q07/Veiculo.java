package q07;

public class Veiculo {
	String tipoDeVeiculo;
	String nomeVeiculo;
	String cor;
	String estadoDoVeiculo;
	
	public Veiculo(String t, String n, String c, String e) {
		this.tipoDeVeiculo = t;
		this.cor = c;
		this.nomeVeiculo = n;
		this.estadoDoVeiculo = e;
	}
	
	public String toString() {
		return " > Tipo: "+this.tipoDeVeiculo+
			   "\n > Nome: "+this.nomeVeiculo+
			   "\n > Cor: "+this.cor+
		       "\n > Estado do Veiculo: "+this.estadoDoVeiculo;
	}
}
