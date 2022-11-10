package q05;

import java.util.ArrayList;

public class Esporte {
	String nome;
	int quantJogadores;
	
	ArrayList<Equipamento> equipamentos = new ArrayList<Equipamento>();
	
	void addEquipamento(Equipamento e, Esporte esporte) {
		e.pertenceEsporte = esporte;
		equipamentos.add(e);
	}
	void listEquipamento() {
		System.out.println("====== EQUIPAMENTOS ======\n");
		for(int i=0; i<equipamentos.size(); i++) {
			System.out.println("Nome: "+equipamentos.get(i).nome);
			System.out.println("Esporte: ");
			System.out.println("\t Nome: "+equipamentos.get(i).pertenceEsporte.nome);
			System.out.println("\t Quantidade de Jogadores: "+equipamentos.get(i).pertenceEsporte.quantJogadores+"\n");
		}
		System.out.println("==========================\n");
	}
}
