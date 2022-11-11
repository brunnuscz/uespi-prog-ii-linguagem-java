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
				"\nEndere�o: "+endereco+
				"\nTelefone: "+telefone+
				"\nValor produ��o: "+valorProducao+
				"\nComiss�o: "+comissao+
				"\nSalario base: "+salarioBase+
				"\nSalario: "+calcularSalario();
		}
}
