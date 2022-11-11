package questao3;

public class Conta {
	private int numero;
	private String nome;
	private double saldo;
	
	public Conta(String nome, int numero, double saldo){
		this.nome = nome;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	public String getNome() {
		return this.nome;
	}
	public int getNumero() {
		return this.numero;
	}
	public double getSaldo() {
		return this.saldo;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public void setSaldo(double valor) {
		this.saldo = valor;
	}
	
	
	void depositar(double valor){
		if(valor <= 0) {
			System.out.println("\n\tComando Invalido!");
		}else {
			System.out.println("\n\tDeposito Realizado!");
			this.saldo = this.saldo + valor;
		}
	}
	
	public boolean transferir(Conta destino, double valor) {
		if(valor <= this.saldo) {
			System.out.println("\n\tSaldo Conta: "+this.saldo);
			destino.saldo += valor; 
			this.saldo = this.saldo - valor;
			System.out.println("\n\tTransferencia Realizada! ");
			System.out.println("\n\tDestino Saldo: "+destino.saldo);
			System.out.println("\n\tSaldo da Conta: "+this.saldo);
			
			return true;
		}else {
			System.out.println("\n\tSaldo Conta: "+this.saldo);
			System.out.println("\n\tDestino Saldo: "+destino.saldo);
			System.out.println("\n\tTransferencia não Realizada! "+destino.saldo);
			return false;
		}
	}

	
	public boolean saca(double valor) {
		
		if(this.saldo <= valor) {
			System.out.println("\n\tSaque não Realizado!");
			return false;
		}else {
			System.out.println("\n\tSaque Realizado!");
			this.saldo = this.saldo - valor;
			return true;
		}
	}
	
	
	
	public void imprimirNome(){
		System.out.println("\nNome: "+getNome()+"\nSaldo: "+getSaldo());
	}
	
	
}
