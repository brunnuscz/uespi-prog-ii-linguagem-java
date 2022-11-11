package q02;

public class Principal {
	public static void main(String[] agrs) {
		// SUPER MERCADO
		SuperMercado sp = new SuperMercado();
		sp.nome = "Carvalho";
		System.out.println("Nome Super Mercado: "+sp.nome);
		
		// PRATELEIRA 1
		Prateleira pra1 = new Prateleira();
		pra1.cor = "Amarela";
		pra1.numPrateleira = "50J";
		pra1.tipoProduto = "Cereais";
		// PRATELEIRA 2
		Prateleira pra2 = new Prateleira();
		pra2.cor = "Azul";
		pra2.numPrateleira = "25M";
		pra2.tipoProduto = "Limpeza";
		// ADICIONAR PRATELEIRAS
		sp.addPrateleira(pra1);
		sp.addPrateleira(pra2);
		
		// PRODUTO 1
		Produto pro1 = new Produto();
		pro1.marca = "Mae Terra";
		pro1.nome = "Castanha";
		pro1.preco = 10;
		// ADICIONAR PRODUTO A PRATELEIRA 1
		pra1.adicionaProdutoPrateleira(pro1,pra1);
		// PRODUTO 2
		Produto pro2 = new Produto();
		pro2.marca = "Ype";
		pro2.nome = "Detergente";
		pro2.preco = 8;
		// ADICIONAR PRODUTO A PRATELEIRA 2
		pra2.adicionaProdutoPrateleira(pro2, pra2);
		// PRODUTO 3
		Produto pro3 = new Produto();
		pro3.marca = "Veja";
		pro3.nome = "Lustra Moveis";
		pro3.preco = 16;
		// ADICIONAR PRODUTO A PRATELEIRA 2
		pra2.adicionaProdutoPrateleira(pro3, pra2);
		// PRODUTO 4
		Produto pro4 = new Produto();
		pro4.marca = "Omo";
		pro4.nome = "Sabao em Po";
		pro4.preco = 9;
		// ADICIONAR PRODUTO A PRATELEIRA 2
		pra2.adicionaProdutoPrateleira(pro4, pra2);

		// LISTAR PRATELEIRAS
		sp.listPrateleira();
		// LISTAR PRODUTOS DA PRATELEIRA 1 E 2
		pra1.listProduto();
		pra2.listProduto();
		
	}
}
