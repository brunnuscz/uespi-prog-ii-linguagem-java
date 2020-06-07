package questao7;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<Time> times = new ArrayList<>();
		ArrayList<Jogador> jogador = new ArrayList<>();
		ArrayList<Funcionario> funcionario = new ArrayList<>();
		
		Funcionario fun1 = new Funcionario();
		fun1.nome = "Bruno";
		fun1.data_de_nascimento = 2000;
		fun1.cpf = "098.897.987-21";
		fun1.sexo = "M";
		funcionario.add(0, fun1);
		fun1.imprimirInfo();
		
		//**************************************
		
		Jogador jog1 = new Jogador();
		jog1.posicao = "Zagueiro";
		jog1.cartoes_amarelos = 1;
		jog1.cartoes_vermelhos = 0;
		jog1.gols_contra = 0;
		jog1.gols_pro = 4;
		jog1.partidas_jogadas = 3;
		
		jogador.add(0, jog1);
		jog1.imprimirInfo();
		
		//**************************************
		
		Time time1 = new Time();
		time1.adicionar("Corinthians", 2000);
		
		times.add(0, time1);
		time1.imprimirInfo();
		
	}
}
