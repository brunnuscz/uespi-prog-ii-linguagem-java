package q04;

public class Principal {
	public static void main(String[] agrs) {
		Banco banco = new Banco();
		banco.nome = "CAIXA";
		
		Poupanca conta1 = new Poupanca();
		conta1.numeroConta = "34567";
		Cliente cliente1 = new Cliente();
		cliente1.nome = "Bruno";
		cliente1.cpf = "995.333.222-90";
		Contrato contrato1 = new Contrato();
		contrato1.cliente = cliente1;
		contrato1.conta = conta1;
		
		Corrente conta2 = new Corrente();
		conta2.numeroConta = "86944";
		Cliente cliente2 = new Cliente();
		cliente2.nome = "Jorge";
		cliente2.cpf = "298.693.122-01";
		Contrato contrato2 = new Contrato();
		contrato2.cliente = cliente2;
		contrato2.conta = conta2;
				
		banco.salvarCliente(contrato1);
		banco.salvarCliente(contrato2);
		
		conta1.depositar(100, conta1);
		conta2.depositar(100, conta2);
		
		conta1.sacar(2, conta1);
		
		conta2.saldo(conta2);
		
		banco.listarConta();
		
		banco.listarCliente();
	}
}
