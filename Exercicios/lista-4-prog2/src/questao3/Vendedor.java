package questao3;

public class Vendedor extends Empregado{
	double valorVenda;
	double comissao;
	
	public double getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(double valorVenda) {
		this.valorVenda = valorVenda;
	}

	public double getComissao() {
		return comissao;
	}

	public void setComissao(double comissao) {
		this.comissao = comissao;
	}

	public double calcularSalario() {
		return (salarioBase + comissao);
	}
	@Override
	public String toString() {

		return "\n-----------VENDEDOR-----------\n"+"\nNome: " + nome +
				"\nEndereço: " + endereco +
				"\nSalario Base: " + salarioBase +
				"\nNovo Salario: " + calcularSalario();
	}
	
}
