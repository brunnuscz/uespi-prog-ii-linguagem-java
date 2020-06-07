package campo_minado;

import java.util.Scanner;

public class Main {

	/**
	 * 
	 * Metodo principal
	 * 
	 * @author Bruno Cruz
	 *
	 */

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		Jogador jogador = new Jogador();

		System.out.print("\nNome Jogador: ");
		String nome = input.nextLine();
		jogador.setNomeJogador(nome);

		System.out.println("\n\tBem-Vindo ao JOGO " + jogador.getNomeJogador());
		Jogo jogo = new Jogo();

		System.out.println(jogador.getNomeJogador());

		int op;
		do {
			Menu m = new Menu();
			m.menu();
			op = input.nextInt();

			switch (op) {
			case 1:
				Tabuleiro tab = new Tabuleiro();

				jogo.jogar(tab);
				System.out.println(jogador.getNomeJogador());
				break;
			case 2:
				System.out.println("\n\tNº de Partidas: " + jogo.partidas);
				System.out.println("\n\tNúmero Vitórias: " + jogo.contV + "\n\tNúmero Derrotas: " + jogo.contP);

				break;
			default:
				break;
			}
		} while (op != 3);
		System.out.print("\n========== FIM DE JOGO " + jogador.getNomeJogador() + " ==========");
	}

}
