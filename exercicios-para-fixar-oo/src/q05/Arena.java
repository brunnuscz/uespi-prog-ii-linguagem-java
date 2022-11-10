package q05;
import java.util.ArrayList;

public class Arena {
	String nome;
	String local;

	ArrayList<Esporte> esportes = new ArrayList<Esporte>();
	
	void addEsporte(Esporte e) {
		esportes.add(e);
	}
	
	void listEsportes() {
		System.out.println("======== ESPORTES ========");
		for(int i=0; i<esportes.size(); i++) {
			System.out.println("\nNome: "+esportes.get(i).nome);
			System.out.println("Quantidade de Jogadores: "+esportes.get(i).quantJogadores);
		}
		System.out.println("\n==========================\n");
	}
}
