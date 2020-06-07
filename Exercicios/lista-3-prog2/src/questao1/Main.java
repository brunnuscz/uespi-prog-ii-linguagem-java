package questao1;

import java.util.Scanner;

/*
 * ESTANCIAR É TRANSFORMAR UMA CLASSE EM UM OBJETO
 * CLASSE É O MODELO
 */

public class Main {

	private static Scanner sc;

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		sc = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = sc.nextLine();
		pessoa.setNome(nome);
		
		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();
		pessoa.setIdade(idade);
		
		System.out.print("Digite sua altura: ");
		double altura = sc.nextDouble();
		pessoa.setAltura(altura);
		
		System.out.print("Digite seu peso: ");
		double peso = sc.nextDouble();
		pessoa.setPeso(peso);
		
		pessoa.imprimirRes();
		
	}

}
