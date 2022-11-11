package q05;


public class Agenda {
	
	Humano humano = new Humano();
	
	void listHorarioAgendado() {
		System.out.println("======== HORARIOS ========\n");
		for(int i=0; i<humano.humanos.size(); i++) {
			System.out.println("Nome: "+humano.humanos.get(i).nome);
			System.out.println("Hora: "+humano.humanos.get(i).hora+":00");
			System.out.println("Esporte Agendado: "+humano.humanos.get(i).esporteEscolhido.nome+"\n");
		}
		System.out.println("==========================\n");
	}
	
	void marcarHorario(Humano h) {
		humano.humanos.add(h);
	}
	void listHumanos() {
		System.out.println("======== HUMANOS =========\n");
		for(int i=0; i<humano.humanos.size(); i++) {
			System.out.println("Nome: "+humano.humanos.get(i).nome+"\n");
		}
		System.out.println("==========================\n");
	}
}
