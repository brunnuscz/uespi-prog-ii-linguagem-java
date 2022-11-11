package q02;

public class SuperMercado {
	String nome;
	int cont = 0;
	Prateleira[] prateleiras = new Prateleira[2];
	
	void addPrateleira(Prateleira p) {
		prateleiras[cont] = p;
		cont++;
	}
	void listPrateleira() {
		for(int i=0; i<prateleiras.length; i++) {
			System.out.println(prateleiras[i]);
		}
	}
}
