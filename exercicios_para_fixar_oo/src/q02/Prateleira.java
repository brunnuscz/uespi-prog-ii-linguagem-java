package q02;

public class Prateleira {
	String tipoProduto;
	String cor;
	String numPrateleira;
	Produto[] itensPrateleira = new Produto[20];
	int cont = 0;
	
	Produto produto = new Produto();
	
	void adicionaProdutoPrateleira(Produto novoProduto, Prateleira p) {
		novoProduto.numPercentePrateleira = p.numPrateleira;
		itensPrateleira[cont] = novoProduto;
		cont++;
	}
	void listProduto() {
		for(int i=0; i<itensPrateleira.length; i++) {
			if(itensPrateleira[i] != null) {
				System.out.println(itensPrateleira[i]);				
			}
		}
	}
	public String toString() {
		return "\nTipo do Produto Prateleira: "+this.tipoProduto+
			   "\nQuantidade de Produtos Prateleira: "+this.cont+
			   "\nNumero da Prateleira: "+this.numPrateleira+
			   "\nCor Prateleira: "+this.cor;
	}
}
