package q07;

public class Principal {
	public static void main(String[] agrs) {
		Oficina oficina = new Oficina("Dois Irmaos", "Piripiri");
		System.out.println("============ OFICINA =============\n");
		System.out.println("Nome: "+oficina.nome);
		System.out.println("local: "+oficina.local);
		System.out.println("\n==================================");
		
		Veiculo veiculo1 = new Veiculo("Carro", "Cinza", "Uno", "Pneu Furado");
		Veiculo veiculo2 = new Veiculo("Moto", "Preta", "Bross", "Troca de Oleo");
		Veiculo veiculo3 = new Veiculo("Moto", "Preta", "Biz", "Revisao");
		
		oficina.adicionarVeiculo(veiculo1);
		oficina.adicionarVeiculo(veiculo2);
		oficina.adicionarVeiculo(veiculo3);

		oficina.listarVeiculo();
		
		oficina.listarVeiculoASeremConcertados();
		
		oficina.concertarVeiculo(veiculo1);

		oficina.listarVeiculoConcertados();
		
		oficina.listarVeiculoASeremConcertados();
		
		oficina.listarVeiculo();
		
		oficina.entrarVeiculo(veiculo1);
		
		oficina.listarVeiculo();
	}
}
