package q05;

public class Principal {
	public static void main(String[] agrs) {
		// ARENA
		Arena arena = new Arena();
		arena.nome = "Maracana";
		arena.local = "Rio de Janeiro";
		
		System.out.println("========= ARENA ==========\n");
		System.out.println("Nome: "+arena.nome);
		System.out.println("local: "+arena.local);
		System.out.println("\n==========================\n");
		
		// ESPORTE 1
		Esporte esporte1 = new Esporte();
		esporte1.nome = "Futebol";
		esporte1.quantJogadores = 22;
		arena.addEsporte(esporte1);
		// ESPORTE 2
		Esporte esporte2 = new Esporte();
		esporte2.nome = "Natacao";
		esporte2.quantJogadores = 13;
		arena.addEsporte(esporte2);
		// EQUIPAMENTOS DO ESPORTE 1
		Equipamento eFut1 = new Equipamento();
		eFut1.nome = "Bola";
		Equipamento eFut2 = new Equipamento();
		eFut2.nome = "Chuteira";
		Equipamento eFut3 = new Equipamento();
		eFut3.nome = "Luva";
		// ADICIONANDO EQUIPAMENTOS DO ESPORTE 1
		esporte1.addEquipamento(eFut1, esporte1);
		esporte1.addEquipamento(eFut2, esporte1);
		esporte1.addEquipamento(eFut3, esporte1);
		// EQUIPAMENTOS DO ESPORTE 2
		Equipamento eNat1 = new Equipamento();
		eNat1.nome = "Touca";
		Equipamento eNat2 = new Equipamento();
		eNat2.nome = "Oculos";
		// ADICIONANDO EQUIPAMENTOS DO ESPORTE 2
		esporte1.addEquipamento(eNat1, esporte2);
		esporte1.addEquipamento(eNat2, esporte2);
		// LISTANDO TODOS OS ESPORTES
		arena.listEsportes();
		// LISTANDO TODOS OS EQUIPAMENTOS
		esporte1.listEquipamento();
		// CRIANDO HUMANO 1
		Humano humano1 = new Humano();
		humano1.nome = "Bruno";
		humano1.hora = 12;
		humano1.esporteEscolhido = esporte2;
		// CRIANDO HUMANO 2
		Humano humano2 = new Humano();
		humano2.nome = "Pedro";
		humano2.hora = 9;
		humano2.esporteEscolhido = esporte2;
		// CRIANDO HUMANO 3
		Humano humano3 = new Humano();
		humano3.nome = "Jorge";
		humano3.hora = 11;
		humano3.esporteEscolhido = esporte1;
		// CRIANDO UMA AGENDA
		Agenda agenda = new Agenda();
		// MARCANDO HORARIOS
		agenda.marcarHorario(humano1);
		agenda.marcarHorario(humano2);
		agenda.marcarHorario(humano3);
		// LISTANDO PESSOSAS
		agenda.listHumanos();
		// LISTANDO HORARIOS AGENDADOS
		agenda.listHorarioAgendado();
	}
}
