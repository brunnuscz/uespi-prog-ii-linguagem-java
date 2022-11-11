package questao2;

import java.util.Scanner;

public class Main {
	
	private static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		Produto produto = new Produto();
		
		System.out.print("Informe o preço de custo: ");
		double custo = input.nextDouble();
		produto.setCusto(custo);
		System.out.print("Informe o preço da venda: ");
		double venda = input.nextDouble();
		produto.setVenda(venda);
		
		
		produto.imprimirRes();
	}
}
