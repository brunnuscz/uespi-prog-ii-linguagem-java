package questao6;

import java.util.Scanner;

public class Main {
	
	public static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		Verificar verificar = new Verificar();
		
		
		verificar.fun();
		verificar.tamanho();
		verificar.positivo();
		verificar.negativo();
		verificar.primo();
		verificar.imprimirInfo();
		
		System.out.print("\n\nDigite: ");
		int valor = input.nextInt();
		verificar.divisivel(valor);
	}

}
