package q09;

import java.util.ArrayList;

public class Bar {
	String nome;
	ArrayList<Bebida> bebidas = new ArrayList<Bebida>();
	ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	public void adicionarBebida(Bebida b) {
		bebidas.add(b);
	}
	public void listarBebidas() {
		System.out.println("========= BEBIDAS ==========");
		for(int i=0; i<bebidas.size(); i++) {
			if(bebidas.get(i).status == "A Venda") {
				System.out.println("\n"+bebidas.get(i));								
			}else {
				System.out.println("\n"+bebidas.get(i));
				System.out.println("\tComprador: "+bebidas.get(i).cliente.nome);
			}
		}
		System.out.println("\n============================");
	}
	public void adicionarCliente(Cliente c) {
		clientes.add(c);
	}
	public void listarCliente() {
		System.out.println("========= CLIENTES =========");
		for(int i=0; i<clientes.size(); i++) {
			System.out.println("\n"+clientes.get(i));				
		}
		System.out.println("\n============================");
	}

	public void realizarCompra(Bebida b, Cliente cli) {
		b.status = "Vendida";
		b.cliente = cli;
	}
}
