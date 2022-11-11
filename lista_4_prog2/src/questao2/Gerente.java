package questao2;

public class Gerente extends Empregado{
	String nomeGerencia;
	
	public String setNomeGerencia() {
		return this.nomeGerencia;
	}
	
	public void getNomeGerencia(String nomeGerencia) {
		this.nomeGerencia = nomeGerencia;
	}
	
	@Override // SOBRECREVENDO
	public String toString() {
		return "\nGERENTE\n"+"\nNome: "+nomeGerencia;
	}
}
