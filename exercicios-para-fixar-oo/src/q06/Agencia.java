package q06;

import java.util.ArrayList;

public class Agencia {
	String nome;
	String local;
	ArrayList<Viagem> viagens = new ArrayList<Viagem>();
	ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	ArrayList<Agenda> agendas = new ArrayList<Agenda>();
	
	// AGENCIA
	public Agencia(String novoNome, String novoLocal) {
		this.nome = novoNome;
		this.local = novoLocal;
	}
	
	// VIAGEM
	void adicionarViagem(Viagem v) {
		viagens.add(v);
	}
	void listarViagem() {
		System.out.println("========= VIAGENS ========\n");
		for(int i=0; i<viagens.size(); i++) {
			System.out.println("\nLocal: "+viagens.get(i).localViagem);
			System.out.println("Preco: "+viagens.get(i).preco);
		}
		System.out.println("\n==========================");
	}
	
	// CLIENTE
	void adicionarCliente(Cliente c) {
		clientes.add(c);
	}
	void listarCliente() {
		System.out.println("======== CLIENTES ========");
		for(int i=0; i<clientes.size(); i++) {
			System.out.println("\nNome: "+clientes.get(i).nome);
			System.out.println("CPF: "+clientes.get(i).cpf);
		}
		System.out.println("\n==========================");
	}
	// AGENDA
	void marcarHorario(Agenda a, Viagem v, Cliente c) {
		a.viagem = v;
		a.cliente = c;
		agendas.add(a);
	}
	void desmarcarHorario(Agenda a) {
		a.status = "Desmacada";
	}
	void listarAgendaMarcadas() {
		System.out.println("==== AGENDAS MARCADAS ====");
		for(int i=0; i<agendas.size(); i++) {
			if(agendas.get(i).status == "Marcada") {
				System.out.println("\nNome: "+agendas.get(i).cliente.nome);
				System.out.println("CPF: "+agendas.get(i).cliente.cpf);
				System.out.println("Viagem: ");
				System.out.println("\tLocal: "+agendas.get(i).viagem.localViagem);
				System.out.println("\tPreco: "+agendas.get(i).viagem.preco);
				System.out.println("Agenda: ");
				System.out.println("\tHorario: "+agendas.get(i).horario);
				System.out.println("\tData: "+agendas.get(i).data);
				System.out.println("\tStatus: "+agendas.get(i).status);				
			}
		}
		System.out.println("\n==========================");
	}
	void listarAgendaNaoMarcadas() {
		System.out.println("== AGENDAS NAO MARCADAS ==\n");
		for(int i=0; i<agendas.size(); i++) {
			if(agendas.get(i).status != "Marcada") {
				System.out.println("Nome: "+agendas.get(i).cliente.nome);
				System.out.println("CPF: "+agendas.get(i).cliente.cpf);
				System.out.println("Viagem: ");
				System.out.println("\tLocal: "+agendas.get(i).viagem.localViagem);
				System.out.println("\tPreco: "+agendas.get(i).viagem.preco);
				System.out.println("Agenda: ");
				System.out.println("\tHorario: "+agendas.get(i).horario);
				System.out.println("\tData: "+agendas.get(i).data);
				System.out.println("\tStatus: "+agendas.get(i).status);				
			}
		}
		System.out.println("\n==========================\n");
	}
}
