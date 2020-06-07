package visao;

import java.util.Scanner;

import controle.IUPessoaFisica;
import controle.IUPessoaJuridica;
import controle.InterfaceUsuario;


public class Agenda {

	private static InterfaceUsuario iuPF = new IUPessoaFisica();
	private static InterfaceUsuario iuPJ = new IUPessoaJuridica();
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		do {
			imprimeMenu();
			Integer acao;
			do {
				acao = perguntaOpcaoDesejada();
			} while (!ehAcaoValida(acao));

			Integer opcao;
			imprimeTipoDeContatos();
			do {
				opcao = perguntaOpcaoDesejada();
			} while (!ehTipoValido(opcao));

			switch (opcao) {
			case 1: // escolheu pessoa fisica
				switch (acao) {
				case 1: 
					iuPF.adicionarContato();
					break;
				case 2:
					iuPF.buscarContato();
					break;
				case 3:
					iuPF.alterarContato();
					break;
				case 4:
					iuPF.removerContato();
					break;
				default:
					break;
				}

				break;
			case 2: // escolheu pessoa juridica
				switch (acao) {
				case 1: 
					iuPJ.adicionarContato();
					break;
				case 2:
					iuPJ.buscarContato();
					break;
				case 3:
					iuPJ.alterarContato();
					break;
				case 4:
					iuPJ.removerContato();
					break;
				default:
					break;
				}
				break;
			default:
				break;
			}

		} while (deveContinuar());
		System.out.println("Tchau! Obrigado por usar o programa!");
	}

	private static boolean ehTipoValido(Integer opcao) {
		if (opcao == 1 || opcao == 2) {
			return true;
		}
		System.err.println(opcao + " Ã© um tipo invÃ¡lido! Digite novamente, por favor!");
		return false;
	}

	private static void imprimeTipoDeContatos() {
		StringBuilder sb = new StringBuilder("\n");
		sb.append("---------------\n");
		sb.append("1. Pessoa fÃ­sica;\n");
		sb.append("2. Pessoa jurÃ­dica;\n");
		sb.append("---------------\n");
		System.out.println(sb.toString());
	}

	private static boolean ehAcaoValida(Integer opcao) {
		if (opcao >= 1 && opcao <= 4) {
			return true;
		}
		System.err.println(opcao + " Ã© um valor invÃ¡lido! Digite novamente, por favor!");
		return false;
	}

	private static Integer perguntaOpcaoDesejada() {
		Integer resposta;
		System.out.print("\nQual a opÃ§Ã£o desejada? ");
		resposta = Integer.valueOf(sc.next().toLowerCase());
		return resposta;
	}

	private static boolean deveContinuar() {
		boolean resposta;
		System.out.print("Deseja continuar? (s/n) ");
		resposta = sc.next().toLowerCase().equals("s") ? true : false;
		return resposta;
	}

	private static void imprimeMenu() {
		StringBuilder sb = new StringBuilder("\n");
		sb.append("---------------\n");
		sb.append(":: Agenda P2 ::\n");
		sb.append("---------------\n");
		sb.append("OpÃ§Ãµes: \n");
		sb.append("1. Adicionar novo contato;\n");
		sb.append("2. Buscar contato(s);\n");
		sb.append("3. Alterar contato;\n");
		sb.append("4. Remover contato;\n");
		sb.append("---------------");
		System.out.println(sb.toString());
	}

}
