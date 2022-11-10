package questao3;

public class Main {

	public static void main(String[] args) {
		Conta conta1 = new Conta("Bruno" ,4321, 100);
		Conta conta2 = new Conta("Alguém", 1234, 4000);
		
		conta1.saca(2500);
		conta1.depositar(300);
		
		conta2.saca(1000);
		System.out.println("\nSaldo Conta 1: "+conta1.getSaldo()+"\nSaldo Conta 2: "+conta2.getSaldo());
		
		conta2.transferir(conta1,2500);
		System.out.println("--------------------------------------");
		conta1.transferir(conta2,2500);
		
		conta1.imprimirNome();
		conta2.imprimirNome();
		
		conta1.setNome(conta1.getNome()+" Lima");
		
		conta1.imprimirNome();
		
	}

}
