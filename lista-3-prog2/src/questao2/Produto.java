package questao2;

public class Produto {
	
	private String nome;
	private double precoCusto;
	private double precoVenda;
	private double margemLucro;
	
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setCusto(double precoCusto) {
		this.precoCusto = precoCusto;
	}
	public void setVenda(double precoVenda) {
		this.precoVenda = precoVenda;
		if(precoVenda < precoCusto) {
			System.out.println("Alerta!");
		}
	}
	
	
	public String getNovoNome() {
		return this.nome;
	}
	public double getNovoCusto() {
		return this.precoCusto;
	}
	public double getNovaVenda() {
		return this.precoVenda;
	}
	
	
	public double calcularMargem() {
		margemLucro = getNovaVenda() - getNovoCusto();
		return margemLucro;
	}
	public double getLucroPorcentagem() {
		double res = (calcularMargem() / getNovoCusto()) * 100;
		return res;
	}
	
	
	public void imprimirRes() {
		System.out.printf("\nCusto: R$ "+precoCusto+
						   "\nVenda: R$ "+precoVenda+
						   "\nLucro: R$ "+calcularMargem()+
						   "\nLucro Percentual: %.0f",getLucroPorcentagem());
		System.out.println("%");
	}
	
}
