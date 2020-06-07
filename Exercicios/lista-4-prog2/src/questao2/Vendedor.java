package questao2;

public class Vendedor extends Empregado {
	double valorVendas;
	int qntVendas;

	public void setQntVendas(int qntVendas) {
		this.qntVendas = qntVendas;
	}

	public int getQntVendas() {
		return qntVendas;
	}

	public double setValorVendas() {
		return valorVendas;
	}

	public void getValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}
	
	@Override
	public String toString() {
		return "\nVENDEDOR\n"+"\nValor vendas:"+valorVendas+"\nQuantidade de vendas: "+qntVendas;
	}
}
