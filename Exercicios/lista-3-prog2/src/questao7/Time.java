package questao7;

public class Time {
	String nomeTime;
	int dataFundacao;
	
	public void setNomeTime(String nomeTime) {
		this.nomeTime = nomeTime;
	}
	public String getNomeTime() {
		return this.nomeTime;
	}
	public void adicionar(String novoTime, int novaData){
	    nomeTime = novoTime;
	    dataFundacao = novaData;
	}

	public void setDataFundacao(int dataFundacao) {
		this.dataFundacao = dataFundacao;
	}
	public int getDataFundacao() {
		return this.dataFundacao;
	}
	
	void imprimirInfo() {
		System.out.println("\nTime: "+nomeTime+"\nData Fundação: "+dataFundacao);
	}
	
	void artilheiro() {
		
	}
	
	void experiente() {
		
	}
	
	void statusTime() {
		
	} 
}
