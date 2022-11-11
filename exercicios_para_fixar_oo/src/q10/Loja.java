package q10;

import java.util.ArrayList;

public class Loja {
	String nome;
	ArrayList<Celular> celularesVenda = new ArrayList<Celular>();
	ArrayList<Celular> celularesConcerto = new ArrayList<Celular>();
	ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	public void adicionarCelular(Celular c) {
		celularesVenda.add(c);
	}
	public void listarCelulares() {
		System.out.println("========= CELULARES ========");
		for(int i=0; i<celularesVenda.size(); i++) {
			if(celularesVenda.get(i).status == "A Venda") {
				System.out.println("\n"+celularesVenda.get(i));								
			}else {
				System.out.println("\n"+celularesVenda.get(i));
				System.out.println("\tComprador: "+celularesVenda.get(i).cliente.nome);
			}
		}
		System.out.println("\n============================");
	}
	public void listarCelularesAVenda() {
		System.out.println("==== CELULARES A VENDA =====");
		for(int i=0; i<celularesVenda.size(); i++) {
			if(celularesVenda.get(i).status == "A Venda") {
				System.out.println("\n"+celularesVenda.get(i));								
			}
		}
		System.out.println("\n=============================");
	}
	public void listarCelularesConcerto() {
		System.out.println("==== CELULARES CONCERTO ====");
		for(int i=0; i<celularesConcerto.size(); i++) {
			if(celularesConcerto.get(i).status != "A Venda") {
				System.out.println("\nNome: "+celularesConcerto.get(i).nome);
				System.out.println("Marca: "+celularesConcerto.get(i).marca);
				System.out.println("Status: "+celularesConcerto.get(i).status);
				System.out.println("Cliente: ");
				System.out.println("\tNome: "+celularesConcerto.get(i).cliente.nome);								
			}
		}
		if(celularesConcerto.isEmpty()) {
			System.out.println("\n> Nenhum Celular...");
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
	
	public void entregarPraConcerto(Celular c, Cliente cli){
		c.cliente = cli;
		celularesConcerto.add(c);
	}
	public void entregarProDono(Celular c, Cliente cli){
		for(int i=0; i<celularesConcerto.size(); i++) {
			if(celularesConcerto.get(i) == c) {
				celularesConcerto.get(i).status = "Concertado e Entregue";								
				celularesConcerto.remove(i);
			}
		}
	}

	public void realizarCompra(Celular b, Cliente cli) {
		b.status = "Vendida";
		b.cliente = cli;
	}
}
