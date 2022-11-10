package questao_conta;

import java.util.Scanner;

public class Conta {

	Scanner input = new Scanner(System.in);

	String nomeTitulo;
	String nomeAgencia;
	int numero;
	double saldo;
	
	
	//  TESTES
	
	String getNomeAgencia() {
		return nomeAgencia;
	}
	
	public void setNomeAgencia(String nomeAgencia) {
		this.nomeAgencia = nomeAgencia;
	}
	
	double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	/*
	
	// QUESTÃO
	  
	Conta(String nomeTitulo, String nomeAgencia, int numero, double saldo) {
		this.nomeTitulo = nomeTitulo;
		this.nomeAgencia = nomeAgencia;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	String novoNome() {
		System.out.print("Nome: ");
		String nome = input.nextLine();
		return nome;
	}

	String novoAgen() {
		System.out.print("Agencia: ");
		String nome = input.nextLine();
		return nome;
	}

	int novoNum() {
		System.out.print("Número: ");
		int nome = input.nextInt();
		return nome;
	}

	double novoSal() {
		System.out.print("Saldo: ");
		double nome = input.nextDouble();
		return nome;
	}

	void sacar(double quantidade) {
		double novoSaldo = (this.saldo - quantidade);
		this.saldo = novoSaldo;
	}

	void depositar(double quantidade) {
		this.saldo += quantidade;
	}

	double calcularRedimento() {
		double novoSaldo = (saldo * 0.1);
		return novoSaldo;

	}

	String recuperarDados() {

		String dados = "Nome: " + this.nomeTitulo;
		dados += "\nNúmero: " + this.numero;
		dados += "\nAgência: " + this.nomeAgencia;
		dados += "\nRendimento: " + this.calcularRedimento();

		return dados;
	}
	*/
}
