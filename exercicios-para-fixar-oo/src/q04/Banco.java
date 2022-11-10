package q04;

import java.util.ArrayList;

public class Banco {
	String nome;
	ArrayList<Contrato> contratos = new ArrayList<Contrato>();
	
	public void salvarCliente(Contrato c) {
		contratos.add(c);
	}
	public void listarCliente() {
		for(int i=0; i<contratos.size(); i++) {
			if(contratos.get(i) != null) {
				System.out.println("\nNome: "+contratos.get(i).cliente.nome);
				System.out.println("CPF: "+contratos.get(i).cliente.cpf);
				System.out.print("Conta: \n");
				contratos.get(i).conta.imprimirInformacao();
			}
		}
	}
	void listarConta() {
		for(int i=0; i<contratos.size(); i++) {
			if(contratos.get(i) != null) {
				System.out.println("\nNumero da conta: "+contratos.get(i).conta.numeroConta);
				System.out.println("Saldo: "+contratos.get(i).conta.saldoAtual);
			}
		}
	}
}
