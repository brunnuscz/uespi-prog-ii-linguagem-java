package questao6;

import java.util.Random;

public class Verificar {

	Random gerador = new Random();

	int array[] = new int[5];
	int tam = 5;

	public void fun() {
		for (int i = 0; i < tam; i++) {
			array[i] = (gerador.nextInt(5) - 1);
		}
	}

	public void tamanho() {
		System.out.println("\nTamanho: " + array.length);
	}

	public void imprimirInfo() {
		System.out.print("\nLista: ");
		for (int i = 0; i < tam; i++) {
			System.out.print(" "+array[i]);
		}
	}

	public void positivo() {
		int cont = 0;
		for (int i = 0; i < tam; i++) {
			if (array[i] > 0)
				cont++;
		}
		System.out.println("\nPositivos: " + cont);
	}

	public void negativo() {
		int cont = 0;
		for (int i = 0; i < tam; i++) {
			if (array[i] < 0) {
				cont++;
			}
		}
		System.out.println("\nNegativo: " + cont);
	}

	public void primo() {
		int cont1 = 0;
		int cont = 0;

		for (int i = 0; i < tam; i++) {
			int num = array[i];

			while (num > 0) {
				if (array[i] % num == 0) {
					cont1++;
				}
				num--;
			}
			if (cont1 == 2) {
				cont++;
			}
		}
		if (cont > 0) {
			System.out.println("\nPrimo Total: " + cont);
		} else {
			System.out.println("\nNão É Primo");
		}
	}

	public void divisivel(int valor) {
		System.out.print("Divisiveis por "+valor+": ");
		
		for (int i = 0; i < tam; i++) {
			if (array[i] % valor == 0) {
				System.out.print(" "+array[i]);
			}
		}
	}
}
