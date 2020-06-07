package questao3;

public class Operario extends Empregado{
	double valorProducao;
	double comissao;
	
	public double getValorProducao() {
		return valorProducao;
	}

	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
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
		
		return "\n-----------OPERARIO-----------\n"+"\nNome: "+nome+
				"\nEndereço: "+endereco+
				"\nTelefone: "+telefone+
				"\nValor produção: "+valorProducao+
				"\nComissão: "+comissao+
				"\nSalario base: "+salarioBase+
				"\nSalario: "+calcularSalario();
		}
}
