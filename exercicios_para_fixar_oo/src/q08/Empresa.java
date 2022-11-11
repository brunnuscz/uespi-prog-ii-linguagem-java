package q08;

import java.util.ArrayList;

public class Empresa {
	String nome;
	ArrayList<Casa> casas = new ArrayList<Casa>();
	ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	public void adicionarCasa(Casa c) {
		casas.add(c);
	}
	public void listarCasas() {
		System.out.println("=========== CASAS =============");
		for(int i=0; i<casas.size(); i++) {
			System.out.println("\n"+casas.get(i));				
		}
		System.out.println("\n===============================");
	}
	public void adicionarCliente(Cliente c) {
		clientes.add(c);
	}
	public void listarCliente() {
		System.out.println("========== CLIENTES ===========");
		for(int i=0; i<clientes.size(); i++) {
			System.out.println("\n"+clientes.get(i));				
		}
		System.out.println("\n===============================");
	}

	public void realizarCompra(Casa c, Cliente cli) {
		c.status = "Vendida";
	}
}
