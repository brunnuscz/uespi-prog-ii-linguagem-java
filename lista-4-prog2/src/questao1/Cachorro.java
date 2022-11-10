package questao1;

public class Cachorro extends Animal {

	private String raca;
	
	MinhaExcecao me = new MinhaExcecao();
	
	public String getRaca() {
		return raca;
	}
	
	public void setRaca(String raca) {
		this.raca = raca;
	}

	@Override
	public String toString() {
		return "\nNome : " + getNome() + "\nPeso: " + getPeso()+"Kg" + "\nRaça : " + getRaca();
	}
	
}
