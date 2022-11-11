package questao3;

public class Main {

	public static void main(String[] args) {
		Fornecedor fornecedor = new Fornecedor();

		fornecedor.nome = "Andrenete";
		fornecedor.endereco = "Piripiri";
		fornecedor.telefone = "9977-6655";
		fornecedor.valorCredito = 1000;
		fornecedor.valorDivida = 100;
		fornecedor.obterSaldo();
		System.out.println(fornecedor.toString());

		Empregado empregado = new Empregado();

		empregado.nome = "Matheuzete";
		empregado.endereco = "234444";
		empregado.salarioBase = 1000;
		empregado.codigoSetor = 123;
		empregado.calcularSalario();
		empregado.imposto = 90;
		System.out.println(empregado.toString());

		
		Operario ope = new Operario();

		ope.nome = "Joaozinete";
		ope.endereco = "1111";
		ope.telefone = "8695-4855";
		ope.salarioBase = 199;
		ope.valorProducao = 900;
		ope.comissao = 800;
		ope.calcularSalario();
		ope.imposto = 90;
		System.out.println(ope.toString());
		
		Administrador amd = new Administrador();

		amd.nome = "Francisquete";
		amd.endereco = "2377";
		amd.salarioBase = 1000;
		amd.codigoSetor = 123;
		amd.calcularSalario();
		amd.imposto = 90;
		System.out.println(amd.toString());
		
		Vendedor ven = new Vendedor();
		
		ven.nome = "Brunete";
		ven.comissao = 10;
		ven.endereco = "Teresina";
		ven.valorVenda = 1000;
		ven.salarioBase = 1990;
		ven.calcularSalario();
		System.out.println(ven.toString());
	}

}
