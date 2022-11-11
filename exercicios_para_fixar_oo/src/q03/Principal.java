package q03;

public class Principal {
	public static void main(String[] agrs) {
		Concessionaria concessionaria = new Concessionaria();
		concessionaria.nome = "Toyota";
		concessionaria.local = "Piripiri";
		System.out.println("===== CONCESSIONARIA =====\n");
		System.out.println(" - Nome Concessionaria: "+concessionaria.nome);
		System.out.println(" - Local Concessionaria: "+concessionaria.local+"\n");
		
		Veiculo veiculo1 = new Veiculo();
		veiculo1.tipoDeVeiculo = "Motocicleta";
		veiculo1.cor = "Preta";
		veiculo1.placa = "MZH8921";
		veiculo1.ano = 2020;
		veiculo1.preco = 12000;
		veiculo1.nomeVeiculo = "Bross";
		veiculo1.estadoDoVeiculo = "A Venda";
		
		Veiculo veiculo2 = new Veiculo();
		veiculo2.tipoDeVeiculo = "Carro";
		veiculo2.cor = "Branca";
		veiculo2.placa = "HRN2221";
		veiculo2.ano = 2021;
		veiculo2.preco = 40000;
		veiculo2.nomeVeiculo = "Uno";
		veiculo2.estadoDoVeiculo = "A Venda";
		
		Veiculo veiculo3 = new Veiculo();
		veiculo3.tipoDeVeiculo = "Carro";
		veiculo3.cor = "Cinza";
		veiculo3.placa = "IOP2404";
		veiculo3.ano = 2022;
		veiculo3.preco = 70000;
		veiculo3.nomeVeiculo = "Corola";
		veiculo3.estadoDoVeiculo = "A Venda";
		
		concessionaria.addVeiculo(veiculo1);
		concessionaria.addVeiculo(veiculo2);
		concessionaria.addVeiculo(veiculo3);

		concessionaria.listVeiculo();
		
		Humano humano1 = new Humano();
		humano1.nome = "Ronaldo";
		humano1.cpf = "123.456.678-90";
		humano1.idade = 29;
		
		Humano humano2 = new Humano();
		humano2.nome = "Jorge";
		humano2.cpf = "223.486.128-20";
		humano2.idade = 40;
		
		concessionaria.alugarVeiculo(veiculo3, humano1);
		concessionaria.alugarVeiculo(veiculo2, humano2);
		
		concessionaria.listAlugados();

		concessionaria.listClientes();

		concessionaria.listVeiculo();
	}
}
