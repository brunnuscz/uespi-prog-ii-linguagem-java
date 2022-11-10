package questao7;

public class Jogador {
	
	String posicao;
	int gols_pro;
	int gols_contra;
	int cartoes_amarelos;
	int cartoes_vermelhos;
	int partidas_jogadas;
	
	void imprimirInfo() {
		System.out.println("\nPosicao: "+posicao+
						   "\nGols: "+gols_pro+
						   "\nGols Contra: "+gols_contra+
						   "\nCartões Amarelos: "+cartoes_amarelos+
						   "\nCartões Vermelhos: "+cartoes_vermelhos+
						   "\nPartidas Jogadas: "+partidas_jogadas);
	}
}
