package questao2;

public class Cliente extends Pessoa {
	double valorDivida;
	int anoNascimento = 1700;

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public int getAnoNascimento() throws MinhaExcecao{
		if(2019 - anoNascimento < 130 ) {
			return anoNascimento;
		}else
			throw excecao;
	}

	@Override
	public String toString() {
		return "\nCLIENTE\n"+"\nValor divida:"+valorDivida+"\nAno nascimento: "+anoNascimento;
	}

}
