package q06;

public class Principal {
	public static void main(String[] agrs) {
		// CRIANDO UMA AGENCIA
		Agencia agencia = new Agencia("CVC Viagens", "Piripiri");
		System.out.println("======== AGENCIA =========\n");
		System.out.println("Nome: "+agencia.nome);
		System.out.println("Local: "+agencia.local);
		System.out.println("\n==========================");
		
		// CRIANDO UMA VIAGEM
		Viagem viagem1 = new Viagem("Fortaleza", 200);
		agencia.adicionarViagem(viagem1);
		
		// CRIANDO UMA VIAGEM
		Viagem viagem2 = new Viagem("Teresina", 60);
		agencia.adicionarViagem(viagem2);
		
		// CRIANDO UMA VIAGEM
		Viagem viagem3 = new Viagem("Pedro II", 20);
		agencia.adicionarViagem(viagem3);
		
		// LISTANDO VIAGENS
		agencia.listarViagem();
		
		// CRIANDO UM CLIENTE
		Cliente cliente1 = new Cliente("Bruno", "345.231.239-90");
		// CRIANDO UMA AGENDA PARA O CLIENTE 1
		Agenda agenda1 = new Agenda();
		// ADICIONANDO CLIENTE
		agencia.adicionarCliente(cliente1);
		// MARCANDO UM HORARIO
		agenda1.horario = "12:00 PM";
		agenda1.status = "Marcada";
		agenda1.data = "11/11/2022";
		agencia.marcarHorario(agenda1, viagem1, cliente1);
		
		// CRIANDO UM CLIENTE
		Cliente cliente2 = new Cliente("Jorge", "982.109.100-10");
		// CRIANDO UMA AGENDA PARA O CLIENTE 1
		Agenda agenda2 = new Agenda();
		// ADICIONAR CLIENTE
		agencia.adicionarCliente(cliente2);
		// MARCANDO UM HORARIO
		agenda2.horario = "12:00 PM";
		agenda2.status = "Marcada";
		agenda2.data = "11/11/2022";
		agencia.marcarHorario(agenda2, viagem1, cliente2);
		
		// CRIANDO UM CLIENTE
		Cliente cliente3 = new Cliente("Bianca", "100.261.967-70");
		// CRIANDO UMA AGENDA PARA O CLIENTE 1
		Agenda agenda3 = new Agenda();
		// ADICIONAR CLIENTE
		agencia.adicionarCliente(cliente3);
		// MARCANDO UM HORARIO
		agenda3.horario = "12:00 PM";
		agenda3.status = "Marcada";
		agenda3.data = "12/11/2022";
		agencia.marcarHorario(agenda3, viagem2, cliente3);
		
		// DESMACAR HORARIO
		agencia.desmarcarHorario(agenda3);
		
		// LISTAR CLIENTES
		agencia.listarCliente();
		
		// LISTAR A AGENDA COM HORARIOS MARCADOS
		agencia.listarAgendaMarcadas();
		
		// LISTAR A AGENDA COM HORARIOS NÃO MARCADOS
		agencia.listarAgendaNaoMarcadas();
	}
}
