
//ALUNO: Bruno de Souza Cruz

import java.util.Scanner;

public class Resposta {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] arg) {
		// q1();
		// q2();
		// q3();
		// q4();
		// q5();
		// q6();
		// q7();
		// q8();
		// q9();
		// q10();
		// q11();
		// q12();
		// q13();
		// q14();
		// q15();
		// q16();
		// q17();
		// q18();
		// q19();
		// q20();
		// q21();
		// q22();
		// q23();
		// q24();
		// q25();
		// q26();
		// q27();
		// q28();
		// q29();
		// q30();
		// q31();
		// q32();
		// q33();
		// q34();
		// q35();
		// q36();
		// q37();
		// q38();
		// q39();
		// q40();
		// q41();
		// q42();
		// q43();
		// q44();
		// q45();
		// q46();
		// q47();
		// q48();
		// q49();
		// q50();
		// q51();
		// q52();
		// q53();
		// q54();
		// q55();
	}

	static void q1() {

		System.out.print("Valor: ");
		double n1 = sc.nextDouble();
		System.out.print("Valor: ");
		double n2 = sc.nextDouble();

		System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
		System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
		System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
		System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
	}

	static void q2() {
		System.out.print("Distancia: ");
		double km = sc.nextDouble();
		System.out.println("Combustivel gasto: ");
		double litro = sc.nextDouble();

		System.out.println("Combustivel médio: " + (km / litro));
	}

	static void q3() {
		String nome;
		double salarioFixo;
		double vendas;
		double salarioFinal;

		System.out.println("Digite Nome: ");
		nome = sc.nextLine();
		System.out.println("Digite Salario: ");
		salarioFixo = sc.nextDouble();
		System.out.println("Digite NÃºmero de Vendas: ");
		vendas = sc.nextDouble();

		salarioFinal = salarioFixo + (vendas * 0.15);

		System.out.println("Nome " + nome + "\nSalario Fixo: " + salarioFixo + "\nSalario Final: " + salarioFinal);
	}

	static void q4() {
		System.out.println("Insira a Temperatura: ");
		double celsius = sc.nextDouble();

		System.out.println("Em F é: " + (9 * celsius + 160) / 5);
	}

	static void q5() {
		System.out.println("Digite a contação: ");
		double cotacao = sc.nextDouble();
		System.out.println("Digite o dolar: ");
		double dolar = sc.nextDouble();
		System.out.println("Real: " + (cotacao * dolar));
	}

	static void q6() {

		System.out.println("valor depositado");
		double valorPolpanca = sc.nextDouble();
		System.out.println("seu rendimento é de: " + (valorPolpanca * 0.07));
	}

	static void q7() {
		System.out.println("Valor da compra: ");
		double prestao = sc.nextDouble();
		System.out.println("A prestação fica de: " + prestao / 5);
	}

	static void q8() {
		System.out.println("Custo do produto: ");
		double custo = sc.nextDouble();
		System.out.println("Percentual de: ");
		double percentual = sc.nextDouble();
		System.out.println("Valor do produto é de: " + (custo * percentual));
	}

	static void q9() {
		System.out.println("Custo de fabrica: ");
		double custoFabrica = sc.nextDouble();
		double consumidor = (custoFabrica + ((custoFabrica * 0.45) + custoFabrica) * 0.28);
		System.out.println("Valor final:" + consumidor);
	}

	static void q10() {
		int A = 10;
		int B = 20;
		int aux;
		aux = A;
		A = B;
		B = aux;

		System.out.println("A: " + A + "\nB: " + B);
	}

	static void q11() {
		int a = 100;
		int b = 120;

		System.out.println("B: " + b);
		b = 234;
		System.out.println("A: " + a + "\n" + "B: " + b);

		int A = 23;
		int B = 56;
		int C = A + B;
		B = 34;
		A = 67;
		System.out.println("\nA: " + A + "\nB: " + B + "\nC: " + C);

		int A1 = 300;
		int B1 = 200;
		int C1 = A1 + B1;
		System.out.println("C: " + C1);
		B1 = 140;
		System.out.println("B: " + B1 + "C" + C1);
		C1 = A1 + B1;
		System.out.println("\nA: " + A1 + "\nB: " + B1 + "\nC: " + C1);
	}

	static void q12() {
		double a1 = (4 / 2) + (2 / 4);
		double a2 = 4 / 2 + 2 / 4;
		System.out.println("a1 :" + a1 + "\na2: " + a2);

		double b1 = 4 / (2 + 2) / 4;
		double b2 = 4 / 2 + 2 / 4;
		System.out.println("\nb1 :" + b1 + "\nb2: " + b2);

		double c1 = (4 + 2) * 2 - 4;
		double c2 = 4 + 2 * 2 - 4;
		System.out.println("\nc1 :" + c1 + "\nc2: " + c2);

	}

	static void q13() {
		double a = 6 * (3 + 2);
		System.out.println("a: "+a);
	}

	static void q14() {
		System.out.print("Digite: ");
		int num = sc.nextInt();

		System.out.println("Antercessor de " + num + ": " + (num - 1));
		System.out.println("Sucessor de " + num + ": " + (num + 1));
	}

	static void q15() {
		System.out.println("Base: ");
		double base = sc.nextDouble();
		System.out.println("Altura: ");
		double altura = sc.nextDouble();

		System.out.println("Área: " + (base * altura));
	}

	static void q16() {
		System.out.println("Sua Idade (Anos): ");
		int anos = sc.nextInt();
		System.out.println("Sua Idade (Meses): ");
		int meses = sc.nextInt();
		System.out.println("Sua Idade (Dias): ");
		int dias = sc.nextInt();

		dias = (dias + (anos * 365) + (meses * 30));

		System.out.println("Sua idade em dias é: " + dias);
	}

	static void q17() {
		System.out.println("Numero de eleitores: ");
		int eleitores = sc.nextInt();
		System.out.println("Numero de votos (brancos): ");
		int branco = sc.nextInt();
		System.out.println("Numero de votos (nulos): ");
		int nulos = sc.nextInt();
		System.out.println("Numero de votos (validos): ");
		int validos = sc.nextInt();

		System.out.println("Numero de votos (branco): " + (100 * branco / eleitores) + "%");
		System.out.println("Numero de votos (nulos): " + (100 * nulos / eleitores) + "%");
		System.out.println("Numero de votos (validos): " + (100 * validos / eleitores) + "%");

	}

	static void q18() {
		System.out.println("Sálario: ");
		double salario = sc.nextDouble();
		System.out.println("Percentual de reajuste: ");
		double per = sc.nextDouble();

		System.out.println("Novo sálario: " + (salario + (salario * (per / 100))));
	}

	static void q19() {

		System.out.println("Custo de fabrica: ");
		double custo = sc.nextDouble();
		System.out.println("Percentual distribuidor: ");
		double dis = sc.nextDouble();
		System.out.println("Percentual imposto: ");
		double imposto = sc.nextDouble();

		dis = custo + (custo * dis / 100);
		imposto = custo + (custo * imposto / 100);

		double consumidor = custo + dis + imposto;

		System.out.println("o custo ao consumidor é: " + consumidor);
	}

	static void q20() {

		System.out.println("Sálario fixo: ");
		double salarioFixo = sc.nextDouble();
		System.out.println("Total de vendas em Reais: ");
		double vendaR = sc.nextDouble();
		System.out.println("Número de carros vendidos: ");
		int carrosV = sc.nextInt();
		System.out.println("Comissão em Reais: ");
		double comissao = sc.nextDouble();

		double salarioFinal = (carrosV * comissao) + (vendaR * 0.05) + salarioFixo;

		System.out.println("Sálario Final: " + salarioFinal);
	}

	static void q21() {
		System.out.print("Digite: ");
		int num = sc.nextInt();
		if (num > 10)
			System.out.println("\nMaior que 10");
		else if (num < 10)
			System.out.println("Menor que 10");
	}

	static void q22() {
		System.out.print("Digite: ");
		int num = sc.nextInt();
		if (num >= 0)
			System.out.println("\nPositivo");
		else if (num < 0)
			System.out.println("\nNegativo");

	}

	static void q23() {
		System.out.print("Digite: ");
		double num = sc.nextDouble();
		if (num < 12)
			System.out.println("\nPreço final: " + (num * 1.50));
		else if (num >= 12)
			System.out.println("Preço final: " + (num * 1.00));
	}

	static void q24() {
		System.out.print("Digite nota 1: ");
		double n1 = sc.nextDouble();
		System.out.print("Digite nota 2: ");
		double n2 = sc.nextDouble();
		double media = (n1 + n2) / 2;

		if (media >= 6)
			System.out.println("\nAprovado!\nSua media é: " + media);
		else
			System.out.println("\nReprovado!\nSua media é: " + media);
	}

	static void q25() {
		System.out.print("Ano atual: ");
		double anoA = sc.nextDouble();
		System.out.print("Ano nascimento: ");
		double anoN = sc.nextDouble();

		double idade = anoA - anoN;

		if (idade >= 16)
			System.out.println("\nPode votar ");
		else
			System.out.println("\nNão pode votar: ");
	}

	static void q26() {
		int n1;
		int n2;

		System.out.print("Valor 1: ");
		n1 = sc.nextInt();

		do {
			System.out.print("Valor 2: ");
			n2 = sc.nextInt();
		} while (n1 == n2);

		if (n1 > n2)
			System.out.println(n1);
		else
			System.out.println(n2);
	}

	static void q27() {
		int n1;
		int n2;

		System.out.print("Valor 1: ");
		n1 = sc.nextInt();

		do {
			System.out.print("Valor 2: ");
			n2 = sc.nextInt();
		} while (n1 == n2);

		if (n1 < n2)
			System.out.println("" + n1 + "" + n2);
		else
			System.out.println("" + n2 + "" + n1);
	}

	static void q28() {
		int h1;
		int h2;
		int duracao;
		System.out.print("Hora de inicio: ");
		h1 = sc.nextInt();

		System.out.print("Hora do fim: ");
		h2 = sc.nextInt();

		if (h1 >= h2) {
			duracao = (24 - h1) + h2;
			System.out.println(duracao);
		} else {
			duracao = h1 - h2;
			System.out.println(duracao);
		}

	}

	static void q29() {

		System.out.println("Horas trabalhando no mês: ");
		int horaTra = sc.nextInt();

		System.out.println("Salario por hora de trabalho: ");
		double salarioHora = sc.nextDouble();

		int horaEx = horaTra - 160;
		double salarioHoraEx = salarioHora * 1.5;

		double salarioExtra = salarioHora * horaEx;
		double salarioFinal = (salarioHoraEx * horaEx) + (160 * salarioHora);

		System.out.println("Salario: " + (160 * salarioHora));
		System.out.println("Salario das horas extras: " + salarioExtra);
		System.out.println("Salario final: " + salarioFinal);

	}

	static void q30() {
		double altura;
		double pesoIdeal;

		System.out.print("Nome: ");
		String nome = sc.nextLine();

		System.out.print("Sexo [1] = M [0] = F: ");
		int sexo = sc.nextInt();

		System.out.print("Altura: ");
		altura = sc.nextDouble();

		if (sexo == 1) {
			pesoIdeal = (72.7 * altura) - 58;
		} else {
			pesoIdeal = (62.1 * altura) - 44.7;
		}
		System.out.printf("" + nome + " seu Peso ideal é: %.1f", pesoIdeal);
	}

	static void q31() {
		double novoSalario;
		System.out.print("Sálario fixo: ");
		double salario = sc.nextDouble();
		System.out.println("Valor das vendas efetuadas: ");
		double vendas = sc.nextDouble();

		if (vendas <= 1.500) {
			novoSalario = salario + (salario * 0.03);
		} else {
			novoSalario = (salario + ((salario + (salario * 0.03)) * 0.07));
		}
		System.out.print("Novo sálario: " + novoSalario);
	}

	static void q32() {
		System.out.println("Número da conta: ");
		int num = sc.nextInt();
		System.out.println("Saldo: ");
		double saldo = sc.nextDouble();
		System.out.println("Debido: ");
		double debito = sc.nextDouble();
		System.out.println("Crédito: ");
		double credito = sc.nextDouble();

		double saldoAtual = (saldo - debito + credito);
		
		if (saldoAtual <= 0) {
			System.out.println("Número: "+num+"Saldo Negattivo = "+saldoAtual);
		} else {
			System.out.println("Número: "+num+"Saldo Positivo = "+saldoAtual);
		}
	}

	static void q33() {
		System.out.println("Quantidade em estoque: ");
		double estoque = sc.nextDouble();
		System.out.println("Quantidade máxima: ");
		double max = sc.nextDouble();
		System.out.println("Quantidade minima: ");
		double min = sc.nextDouble();

		double quantMedia = (max + min);
		quantMedia /= 2;

		if (estoque >= quantMedia) {
			System.out.println("Não efetuar a compra");
		} else {
			System.out.println("Efetuar a compra");
		}
	}

	static void q34() {
		System.out.println("Digite: ");
		int num = sc.nextInt();

		if (num < 0) {
			System.out.println("Negativo");
		} else if (num > 0) {
			System.out.println("Positivo");
		} else {
			System.out.println("Zero");
		}
	}

	static void q35() {
		int n1;
		int n2;
		int n3;
		int maior;

		System.out.println("Valor 1: ");
		n1 = sc.nextInt();
		maior = n1;

		do {
			System.out.println("Valor 2: ");
			n2 = sc.nextInt();

			System.out.println("Valor 3: ");
			n3 = sc.nextInt();

		} while (n1 == n2 || n1 == n3 || n2 == n3);

		if (n2 > maior) {
			maior = n2;
		}
		if (n3 > maior) {
			maior = n3;
		}
		System.out.println("Maior: " + maior);
	}

	static void q36() {
		int n1;
		int n2;
		int n3;
		int soma;

		System.out.println("Valor 1: ");
		n1 = sc.nextInt();

		do {
			System.out.println("Valor 2: ");
			n2 = sc.nextInt();

			System.out.println("Valor 3: ");
			n3 = sc.nextInt();

		} while (n1 == n2 || n1 == n3 || n2 == n3);

		if (n1 < n2 && n1 < n3) {
			soma = (n2 + n3);
			System.out.println("Soma dos maiores é: " + soma);
		} else if (n2 < n1 && n2 < n3) {
			soma = (n1 + n3);
			System.out.println("Soma dos maiores é: " + soma);
		} else if (n2 > n1 && n1 > n3) {
			soma = (n1 + n2);
			System.out.println("Soma dos maiores é: " + soma);
		}
	}

	static void q37() {
		int n1;
		int n2;
		int n3;

		System.out.println("Valor 1: ");
		n1 = sc.nextInt();

		do {
			System.out.println("Valor 2: ");
			n2 = sc.nextInt();

			System.out.println("Valor 3: ");
			n3 = sc.nextInt();

		} while (n1 == n2 || n1 == n3 || n2 == n3);

		if (n1 < n2 && n1 < n3) {
			System.out.println(n1 + "" + n2 + "" + n3);
		} else if (n2 < n1 && n2 < n3) {
			System.out.println(n2 + "" + n1 + "" + n3);
		} else if (n2 > n1 && n1 > n3) {
			System.out.println(n3 + "" + n1 + "" + n2);
		}
	}

	static void q38() {
		int n1;
		int n2;
		int n3;

		System.out.println("Valor 1: ");
		n1 = sc.nextInt();

		System.out.println("Valor 2: ");
		n2 = sc.nextInt();

		System.out.println("Valor 3: ");
		n3 = sc.nextInt();
		if ((n2 + n3) >= n1)
			if ((n1 + n3) >= n2)
				if ((n1 + n2) >= n3)
					System.out.println("Triângulo");
	}

	static void q39() {
		String time1;
		String time2;

		System.out.print("Time 1: ");
		time1 = sc.nextLine();
		System.out.print("Time 2: ");
		time2 = sc.nextLine();

		System.out.print("Gols 1: ");
		int gol1 = sc.nextInt();
		System.out.print("Gols 2: ");
		int gol2 = sc.nextInt();

		if (gol1 > gol2)
			System.out.println("Time " + time1 + " Vencedor !!!");
		if (gol2 > gol1)
			System.out.println("Time " + time2 + " Vencedor !!!");
		if (gol1 == gol2)
			System.out.println("Empate !!!");
	}

	static void q40() {
		int n1;
		int n2;

		System.out.println("Valor 1: ");
		n1 = sc.nextInt();

		System.out.println("Valor 2: ");
		n2 = sc.nextInt();

		if (n1 > n2) {
			System.out.println("Primeiro é maior");
		}
		if (n2 == n1) {
			System.out.println("Iguais");
		}
		if (n2 > n1) {
			System.out.println("Segundo maior");
		}
	}

	static void q41() {
		int res;

		System.out.print("Digite x: ");
		int x = sc.nextInt();

		System.out.print("Digite y: ");
		int y = sc.nextInt();

		int z = (x * y) + 5;

		if (z <= 0) {
			res = 'A';
		} else if (z <= 100) {
			res = 'B';
		} else {
			res = 'C';
		}
		System.out.println(z + ", " + res);
	}

	static void q42() {
		double desconto;
		int combustivel;
		System.out.print("Número de Litros vendidos: ");
		int litro = sc.nextInt();

		System.out.print("Combustível [1]-A [2]-G: ");
		combustivel = sc.nextInt();

		if (litro <= 20 && combustivel == 2) {
			desconto = 3.30 + (3.30 * 0.03);
			System.out.println("Desconto: " + desconto);
		} else if (litro > 20 && combustivel == 2) {
			desconto = 3.30 + (3.30 * 0.05);
			System.out.println("Desconto: " + desconto);
		} else if (litro <= 20 && combustivel == 1) {
			desconto = 2.90 + (2.90 * 0.04);
			System.out.println("Desconto: " + desconto);
		} else if (litro > 20 && combustivel == 2) {
			desconto = 2.90 + (2.90 * 0.06);
			System.out.println("Desconto: " + desconto);
		}
	}

	static void q43() {
		int idadeH1;
		int idadeH2;
		int idadeM1;
		int idadeM2;
		int velhoH;
		int velhoM;
		int novoH;
		int novoM;

		System.out.print("Idade Homem 1: ");
		idadeH1 = sc.nextInt();

		do {
			System.out.print("Idade Homem 2: ");
			idadeH2 = sc.nextInt();
		} while (idadeH1 == idadeH2);
		if (idadeH1 > idadeH2) {
			velhoH = idadeH1;
			novoH = idadeH2;
		} else {
			velhoH = idadeH2;
			novoH = idadeH1;
		}
		System.out.print("Idade Mulher 1: ");
		idadeM1 = sc.nextInt();

		do {
			System.out.print("Idade Mulher 2: ");
			idadeM2 = sc.nextInt();
		} while (idadeM1 == idadeM2);
		if (idadeM1 > idadeM2) {
			velhoM = idadeM1;
			novoM = idadeM2;
		} else {
			velhoM = idadeM2;
			novoM = idadeM1;
		}
		System.out.println("Soma 1: " + (velhoH + novoM));
		System.out.println("Soma 2: " + (novoH + velhoM));
	}

	static void q44() {
		double precoMa = 1.80;
		double precoMo = 2.50;
		double pesoMa;
		double pesoMo;
		double totalMo;
		double totalMa;
		double precoFinal;

		System.out.print("Quantos Kilos de morango: ");
		pesoMo = sc.nextDouble();

		System.out.print("Quantos Kilos de maçã: ");
		pesoMa = sc.nextDouble();

		if (pesoMo > 5) {
			totalMo = (precoMo - 0.3) * pesoMo;
		} else {
			totalMo = precoMo * pesoMo;
		}

		if (pesoMa > 5) {
			totalMa = (precoMa - 0.3) * pesoMa;
		} else {
			totalMa = precoMa * pesoMa;
		}
		if ((totalMo + totalMa) > 25 || (pesoMo + pesoMa) > 8) {
			precoFinal = (totalMo + totalMa) * 0.9;
		} else {
			precoFinal = totalMo + totalMa;
		}

		System.out.println("Preço finl da compra: R$" + precoFinal);
	}

	static void q45() {
		int usu;
		int senha;
		int cont = 0;

		do {
			if (cont > 0)
				System.out.println("USUARIO INVALIDO !!!");
			System.out.print("Usuario: ");
			usu = sc.nextInt();
			cont++;
		} while (usu != 1234);
		cont = 0;
		do {
			if (cont > 0)
				System.out.println("SENHA INVALIDA !!!");
			System.out.print("Senha: ");
			senha = sc.nextInt();
			cont++;
		} while (senha != 9999);
		System.out.println("ACESSO PERMITIDO !!!");
	}

	static void q46() {
		System.out.println("VERDADEIRO\nFALSO\nFALSO");
	}

	static void q47() {
		double descMenor5 = 0.02;
		double descMenor10 = 0.03;
		double descMaior10 = 0.05;
		String produto;
		int quantidade;
		double preco;
		double total;
		double descont = 0;

		System.out.println("Nome do produto: ");
		produto = sc.nextLine();
		System.out.println("Quantidade: ");
		quantidade = sc.nextInt();
		System.out.println("Preço Unitario: ");
		preco = sc.nextDouble();

		total = quantidade * preco;

		if (quantidade <= 5) {
			descont = total * descMenor5;
		}
		if (quantidade > 5 && quantidade <= 10) {
			descont = total * descMenor10;
		}
		if (quantidade > 10) {
			descont = total * descMaior10;
		}
		System.out.println("Produto: " + produto);
		System.out.println("Preço unitário: " + preco);
		System.out.println("Total: " + total);
		System.out.println("Desconto: " + descont);
		System.out.println("Total a pagar: " + (total - descont));

	}

	static void q48() {
		int ano = 2011;

		System.out.println("Entre com seu codigo: ");
		int codigo = sc.nextInt();

		System.out.println("Entre com a data de nascimento: ");
		int data = sc.nextInt();

		System.out.println("Entre com o Ano de ingresso na empresa: ");
		int tempo = sc.nextInt();

		if (ano - data >= 16) {
			if (ano - data >= 65) {
				System.out.println("Código: "+codigo+"\nRequer Aposentadoria");
			} else {
				if (ano - tempo >= 30) {
					System.out.println("Código: "+codigo+"\nRequer Aposentadoria");
				} else {
					if ((ano - data >= 60) && (ano - tempo >= 25)) {
						System.out.println("Código: "+codigo+"\nRequer Aposentadoria");
					} else {
						System.out.println("Código: "+codigo+"\nNÃO Requer Aposentadoria");
					}
				}
			}
		} else {
			System.out.println("Você não tem idade para trabalhar");
		}
	}

	static void q50() {
		System.out.print("Digite: ");
		double n1 = sc.nextInt();
		double n2;
		do {
			System.out.print("Digite: ");
			n2 = sc.nextInt();
		} while (n2 == 0);

		System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
	}

	static void q51() {
		System.out.print("Digite: ");
		double n1 = sc.nextInt();
		double n2;
		do {
			System.out.print("Digite: ");
			n2 = sc.nextInt();
		} while (n2 == 0);

		System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
	}

	static void q52() {
		int res;

		System.out.print("Digite x: ");
		int x = sc.nextInt();
		int y;
		do {
			System.out.print("Digite y: ");
			y = sc.nextInt();

		} while (y == 0);
		int z = (x * y) + 5;

		if (z <= 0) {
			res = 'A';
		} else if (z <= 100) {
			res = 'B';
		} else {
			res = 'C';
		}
		System.out.println(z + ", " + res);
	}
	
	static void q53() {
		double desconto;
		int combustivel;
		System.out.print("Número de Litros vendidos: ");
		int litro = sc.nextInt();

		System.out.print("Combustível [1]-A [2]-G: ");
		combustivel = sc.nextInt();

		if (litro <= 20 && combustivel == 2) {
			desconto = 3.30 + (3.30 * 0.03);
			System.out.println("Desconto: " + desconto);
		} else if (litro > 20 && combustivel == 2) {
			desconto = 3.30 + (3.30 * 0.05);
			System.out.println("Desconto: " + desconto);
		} else if (litro <= 20 && combustivel == 1) {
			desconto = 2.90 + (2.90 * 0.04);
			System.out.println("Desconto: " + desconto);
		} else if (litro > 20 && combustivel == 2) {
			desconto = 2.90 + (2.90 * 0.06);
			System.out.println("Desconto: " + desconto);
		}
	}

	static void q54() {
		double nota1;
		double nota2;
		do{
			System.out.println("Nota 1: ");
			nota1 = sc.nextDouble();
			System.out.println("Nota 2: ");
			nota2 = sc.nextDouble();
		}while(nota1 < 0 || nota2 < 0 || nota1 > 10 || nota2 > 10);
		
		System.out.println("Média Simples: "+(nota1+nota2)/2);	
		
	}
	static void q55() {
		int usu;
		int senha;
		int cont = 0;

		do {
			if (cont > 0)
				System.out.println("USUARIO INVALIDO !!!");
			System.out.print("Usuario: ");
			usu = sc.nextInt();
			cont++;
		} while (usu != 1234);
		cont = 0;
		do {
			if (cont > 0)
				System.out.println("SENHA INVALIDA !!!");
			System.out.print("Senha: ");
			senha = sc.nextInt();
			cont++;
		} while (senha != 9999);
		System.out.println("ACESSO PERMITIDO !!!");
	}
}



