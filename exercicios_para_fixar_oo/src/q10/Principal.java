package q10;

public class Principal {
	public static void main(String[] agrs) {
		Loja loja = new Loja();
		loja.nome = "NKX Cell";
		System.out.println("=========== LOJA ==========\n");
		System.out.println("Nome: "+loja.nome);
		System.out.println("\n============================");
		
		Celular celularV1 = new Celular();
		celularV1.nome = "J7";
		celularV1.marca = "Sansung";
		celularV1.preco = 1400;
		celularV1.status = "A Venda";
		Celular celularV2 = new Celular();
		celularV2.nome = "IPhone5";
		celularV2.marca = "Ihpone";
		celularV2.preco = 4400;
		celularV2.status = "A Venda";
		
		loja.adicionarCelular(celularV1);
		loja.adicionarCelular(celularV2);
		
		loja.listarCelularesAVenda();
		
		Cliente cliente1 = new Cliente("Pedro");
		Cliente cliente2 = new Cliente("Gonzaga");
		
		loja.adicionarCliente(cliente1);
		loja.adicionarCliente(cliente2);
		
		loja.listarCliente();
		
		loja.realizarCompra(celularV1, cliente1);
		

		Celular celularC1 = new Celular();
		celularC1.nome = "J9";
		celularC1.marca = "Sansung";
		celularC1.status = "Problema na Bateria";
		
		loja.entregarPraConcerto(celularC1, cliente2);

		loja.listarCelularesConcerto();
		
		loja.entregarProDono(celularC1, cliente2);
		
		loja.listarCelularesConcerto();

		loja.listarCelulares();
		
		loja.listarCelularesAVenda();
	}
}
