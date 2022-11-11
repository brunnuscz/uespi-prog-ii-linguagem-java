package questao1;

public class Main {
	public static void main(String[] args) throws MinhaExcecao {

		Cachorro cachorro = new Cachorro();

		try {
			cachorro.setNome("Jorginho");
		} catch (MinhaExcecao e) {
			e.printStackTrace();
		}

		cachorro.setPeso(2);
		cachorro.setRaca("Viralata");

		//--------------------------------------
		
		Peixe peixe = new Peixe();

		peixe.setNome("Bireu");
		peixe.setPeso(1);
		peixe.setTipoHabitat("Água Doce");

		System.out.println(cachorro.toString());
		System.out.println(peixe.toString());

	}

}
