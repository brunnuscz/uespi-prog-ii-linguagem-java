package campo_minado;

import java.util.Random;
import java.util.Scanner;

public class Tabuleiro extends Coordenada {

	private Scanner entrada = new Scanner(System.in);

	private int[][] bombas;
	private char[][] tabuleiro;
	private int linha, coluna;
	private int quantBomba;
	private int op;
	private Random random = new Random();

	/**
	 * Tabuleiro: iniciando a matriz minas e tabuleiro uma matriz 10x10 é definida,
	 * onde não usaremos a linha 0 nem a linha 9, bem como a coluna 0 e a coluna 9
	 * Ao calcular quantas bombas existem na vizinhança, apenas contemos quantas
	 * bombas existem nos 8 locais ao redor.
	 * 
	 * @return
	 * 
	 */

	public Tabuleiro() {

		dimensao();

		tabuleiro = new char[linhaTam + 2][colunaTam + 2];
		bombas = new int[linhaTam + 2][colunaTam + 2];

		iniciaBombas();
		sorteiaBombas();
		preencheDicas();
		iniciaTabuleiro();

	}

	/**
	 * retorna o que existe no bloco quando passamos a linha e a coluna. Caso existe
	 * -1 é porque existe mina, retorna verdadeiro e o jogo acaba.
	 * 
	 * @param linha
	 * @param coluna
	 * @return
	 */

	public int getPosicao(int linha, int coluna) {
		return bombas[linha][coluna];
	}

	/**
	 * Retorna verdadeiro caso você perca ou seja, caso exista uma bomba onde você
	 * jogou e falso, caso não exista uma mina no local que você escolheu.
	 * 
	 * @param linha
	 * @param coluna
	 * @return
	 */

	public boolean setPosicao() {

		do {
			System.out.print("\nLinha: ");
			linha = entrada.nextInt();
			System.out.print("Coluna: ");
			coluna = entrada.nextInt();

			if (((linha > 0 && linha <= linhaTam) && (coluna > 0 && coluna <= colunaTam)
					&& (tabuleiro[linha][coluna] != ' '))) {
				if (tabuleiro[linha][coluna] == 'x') {
					System.out.println("\n\tO campo já está marcado como Bomba");
				} else {
					System.out.println("\n\tO campo já está aberto\n");
				}
			}
			if (linha < 1 || linha > linhaTam) {
				System.out.println("\n\tNº máximo linha 1 até " + linhaTam);
			}
			if (coluna < 1 || coluna > colunaTam) {
				System.out.println("\n\tNº máximo coluna 1 até " + colunaTam);
			}
		} while ((linha < 1 || linha > linhaTam) || (coluna < 1 || coluna > colunaTam));
		do {
			Menu menu = new Menu();
			menu.menuAcao();
			op = entrada.nextInt();

			/*
			 * Acao marcar = Acao.MARCAR; Acao revelar = Acao.REVELAR;
			 */

			if (op == 1) {
				marcacao();
				return false;

			}
			if (op == 2) {
				if (getPosicao(linha, coluna) == -1) {
					return true;
				} else {
					return false;
				}
			}
			if (op == 3) {
				desmarcar();
				return false;
			}
		} while (op < 1 || op > 3);
		return false;

	}

	/**
	 * chamada do metado para marcar o local
	 */
	public void marcacao() {
		marcarPosicao(linha, coluna);
	}
	/**
	 * chamada do metado para desmarcar o local
	 */
	public void desmarcar() {
		desmarcarPosicao(linha, coluna);
	}

	/**
	 * Marcando local que tem bomba
	 * 
	 * @param linha
	 * @param coluna
	 * @return
	 */
	public int marcarPosicao(int linha, int coluna) {
		return tabuleiro[linha][coluna] = 'x';
	}

	/**
	 * Desmarcar o local que foi marcado
	 * 
	 * @param linha
	 * @param coluna
	 * @return
	 */
	public int desmarcarPosicao(int linha, int coluna) {
		return tabuleiro[linha][coluna] = ' ';
	}

	/**
	 * Conta quantos campos ainda não foram exibidos, ou seja, quantos underlines
	 * existem. Caso existam exatamente a quantidade informada de bombas, é porque
	 * os blocos que sobraram foram justamente os que continham minas, o método
	 * retorna verdadeiro e o jogador ganha.
	 * 
	 * @return
	 */

	public boolean vitoria() {
		int count = 0;
		for (int i = 1; i <= linhaTam; i++)
			for (int j = 1; j <= colunaTam; j++)
				if (tabuleiro[i][j] == ' ')
					count++;
		if (count == quantBomba)
			return true;
		else
			return false;
	}

	/**
	 * Vai checar todas as casas vizinhas, no tabuleiro de minas, exceto se essas
	 * vizinhas estejam localizadas nas linhas 0 ou 9, ou nas colunas 0 ou 9.
	 */

	public void abrirProximas() {
		if (tabuleiro[linha][coluna] != 'x') {
			if (op == 2) {
				for (int i = -1; i < 2; i++) {
					for (int j = -1; j < 2; j++) {
						if ((bombas[linha + i][coluna + j] != -1)
								&& (linha != 0 && linha < linhaTam + 1 && coluna != 0 && coluna < colunaTam + 1)) {
							tabuleiro[linha + i][coluna + j] = Character.forDigit(bombas[linha + i][coluna + j],
									quantBomba);
						}
					}
				}
			}
		}

	}

	/**
	 * Exibe todo o tabuleiro de caracteres de maneira formatada.
	 */

	public void exibe() {
		System.out.print("    ");
		for (int col = 1; col <= colunaTam; col++) {
			if (col < 10) {
				System.out.print(col + "   ");
			} else {
				System.out.print(col + "  ");
			}
		}

		System.out.println("\n");
		for (int i = 1; i <= linhaTam; i++) {
			System.out.print(i + " ");
			for (int j = 1; j <= colunaTam; j++) {
				if (i < 10) {
					System.out.print(" [" + tabuleiro[i][j] + "]");
				} else {
					System.out.print("[" + tabuleiro[i][j] + "] ");
				}
			}
			System.out.println();
		}
	}

	// Preenchendo ao redor dicas ao escolha

	public void preencheDicas() {

		for (int i = 1; i <= linhaTam; i++) {
			for (int j = 1; j <= colunaTam; j++) {
				for (int ii = -1; ii <= 1; ii++) {
					for (int jj = -1; jj <= 1; jj++) {
						if (bombas[i][j] != -1) {
							if (bombas[i + ii][j + jj] == -1) {
								bombas[i][j]++;
							}
						}
					}
				}
			}
		}
	}

	/**
	 * Coloca um asterisco, [*], em todos os locais onde existem minas. Este método
	 * serve para mostrar onde existia minas e será acionado quando o jogador perder
	 * a partida.
	 * 
	 */

	public void exibeBombas() {
		for (int i = 1; i <= linhaTam; i++)
			for (int j = 1; j <= colunaTam; j++)
				if (bombas[i][j] == -1)
					tabuleiro[i][j] = '*';
		exibe();
	}

	/**
	 * Iniciar o tabuleiro com [ ]
	 */

	public void iniciaTabuleiro() {
		for (int i = 1; i < bombas.length; i++)
			for (int j = 1; j < bombas.length; j++)
				tabuleiro[i][j] = ' ';
	}

	/**
	 * Esse tabuleiro é inicialmente preenchido com números 0
	 */

	public void iniciaBombas() {
		for (int i = 0; i < bombas.length; i++)
			for (int j = 0; j < bombas.length; j++)
				bombas[i][j] = 0;
	}

	/**
	 * Nos locais onde existirem minas, vamos colocar o inteiro -1. Esse método
	 * sorteia dois números inteiros, entre 1 e 8, através do uso da classe Random.
	 */

	public void sorteiaBombas() {
		boolean sorteado;
		int linha, coluna;

		/*
		 * do { System.out.print("\nInforme quantidade de bombas: "); quantBomba =
		 * entrada.nextInt(); if (quantBomba < 0) {
		 * System.out.println("Informe quantidade de minas de 1 até 30"); } } while
		 * (quantBomba < 0);
		 */

		quantBomba = ((linhaTam * colunaTam) * 16) / 100;

		System.out.println("\nNesse tabuleiro tem " + quantBomba + " Bombas\n");
		for (int i = 0; i < quantBomba; i++) {

			do {
				linha = random.nextInt(linhaTam) + 1;
				coluna = random.nextInt(colunaTam) + 1;

				if (bombas[linha][coluna] == -1)
					sorteado = true;
				else
					sorteado = false;
			} while (sorteado);

			bombas[linha][coluna] = -1;
		}
	}
}