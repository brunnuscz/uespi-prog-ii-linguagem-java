package q09;

public class Principal {
	public static void main(String[] agrs) {
		Bar bar = new Bar();
		bar.nome = "Bar Fik Bebu Ak";
		System.out.println("=========== BAR ===========\n");
		System.out.println("Nome: "+bar.nome);
		System.out.println("\n============================");
		
		Bebida bebida1 = new Bebida("Tequila", 20, "A Venda");
		Bebida bebida2 = new Bebida("Raiz Armaga", 30, "A Venda");
		Bebida bebida3 = new Bebida("Vinho", 5, "A Venda");
		Bebida bebida4 = new Bebida("Skol Beats", 12, "A Venda");
		Bebida bebida5 = new Bebida("Cerveja", 8, "A Venda");
		Bebida bebida6 = new Bebida("Drea", 10, "A Venda");
		
		bar.adicionarBebida(bebida1);
		bar.adicionarBebida(bebida2);
		bar.adicionarBebida(bebida3);
		bar.adicionarBebida(bebida4);
		bar.adicionarBebida(bebida5);
		bar.adicionarBebida(bebida6);
		
		bar.listarBebidas();
		
		Cliente cliente1 = new Cliente("Jorge");
		Cliente cliente2 = new Cliente("Cleiton");
		
		bar.adicionarCliente(cliente1);
		bar.adicionarCliente(cliente2);
		
		bar.listarCliente();
		
		bar.realizarCompra(bebida1, cliente1);
		bar.realizarCompra(bebida3, cliente2);
		
		bar.listarBebidas();
	}
}
