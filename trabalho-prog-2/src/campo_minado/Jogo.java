package campo_minado;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Jogo{
	private Tabuleiro iniciaTab;
	boolean terminar = false;
	boolean vitoria = false;
	int[] jogada;
	int partidas = 0;
	int rodada = 0;
	int contP = 0;
	int contV = 0;
	
	Scanner input = new Scanner(System.in);

	public void jogar(Tabuleiro iniciaTab) {

		long inicio = System.currentTimeMillis();

		do {
			rodada++;
			System.out.println("\t========== " + rodada + "ª Rodada ==========\n");
			iniciaTab.exibe();
			terminar = iniciaTab.setPosicao();

			if (terminar == false) {
				iniciaTab.abrirProximas();
				terminar = iniciaTab.vitoria();
			}
		} while (terminar == false);

		long fim = System.currentTimeMillis();

		if (iniciaTab.vitoria() == false) {
			System.out.println("----------------------------------------");
			iniciaTab.exibeBombas();
			System.out.println("\n----------------------------------------");
			System.out.println("\n\t   Tempo FINAL\n");
			System.out.print("\t");
			System.out.print(new SimpleDateFormat("mm").format(new Date(fim - inicio)));
			System.out.print(" Minuto(s) ");
			System.out.print(new SimpleDateFormat("ss").format(new Date(fim - inicio)));
			System.out.println(" Segundo(s)");
			System.out.print("\n\t   Você Perdeu ");
			contP++;
			partidas++;
		} else {

			System.out.println("----------------------------------------");
			iniciaTab.exibeBombas();
			System.out.println("\n----------------------------------------");

			System.out.println("\n\tTempo FINAL");
			System.out.print(new SimpleDateFormat("mm").format(new Date(fim - inicio)));
			System.out.print(" Minuto(s) ");
			System.out.print(new SimpleDateFormat("ss").format(new Date(fim - inicio)));
			System.out.println(" Segundo(s)");

			System.out.print("\n\t   Parabéns Você Venceu! ");
			contV++;
			partidas++;
		}
	}

	public Jogo() {
		iniciaTab = new Tabuleiro();
		jogar(iniciaTab);
		jogada = new int[2];
	}

}
