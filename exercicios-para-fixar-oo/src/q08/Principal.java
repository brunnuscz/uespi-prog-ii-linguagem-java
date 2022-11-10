package q08;

public class Principal {
	public static void main(String[] agrs) {
		Empresa empresa = new Empresa();
		empresa.nome = "Nucila";
		System.out.println("=========== EMPRESA ===========\n");
		System.out.println("Nome: "+empresa.nome);
		System.out.println("\n===============================");
		
		Casa casa1 = new Casa(90000, 30, 30, 7, "Bairro Caixa Dagua", "A Venda");
		Casa casa2 = new Casa(30000, 35, 40, 9, "Bairro Flor dos Campos", "A Venda");
		Casa casa3 = new Casa(40600, 35, 29, 7, "Bairro Floresta", "A Venda");
		Casa casa4 = new Casa(50000, 40, 30, 5, "Bairro Recreio", "A Venda");

		empresa.adicionarCasa(casa1);
		empresa.adicionarCasa(casa2);
		empresa.adicionarCasa(casa3);
		empresa.adicionarCasa(casa4);
		
		empresa.listarCasas();
		
		Cliente cliente1 = new Cliente("Bruno");
		Cliente cliente2 = new Cliente("Cleltilde");		
		empresa.adicionarCliente(cliente1);
		empresa.adicionarCliente(cliente2);
		
		empresa.listarCliente();
		
		empresa.realizarCompra(casa1, cliente1);
		
		empresa.listarCasas();
	}
}
