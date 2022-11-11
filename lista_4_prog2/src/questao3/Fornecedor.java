package questao3;

public class Fornecedor extends Pessoa {
	int valorCredito;
	double valorDivida;

	public double obterSaldo() {
		return (valorCredito - valorDivida);
	}

	public int getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(int valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		
		return "\n-----------FORNECEDOR-----------\n"+"\nNome: "+s.append(nome)+
				"\nEndereço: "+endereco+
				"\nTelefone: "+telefone+
				"\nValor credito: "+valorCredito+
				"\nValor divida: "+valorDivida+
				"\nNovo saldo: "+obterSaldo();
		}
}
