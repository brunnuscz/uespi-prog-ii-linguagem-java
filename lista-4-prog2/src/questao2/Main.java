package questao2;

public class Main {
	public static void main(String[] args) {
		
		Empregado empregado = new Empregado();
		empregado.nome = "Carlos";
		empregado.idade = 56;
		empregado.salario = 1000;
		empregado.sexo = "M";
		empregado.matricula = "222";
		empregado.setSalario(empregado.getSalario());
		System.out.println(empregado.toString());
		
		
		Cliente cliente = new Cliente();
		cliente.nome = "Jobervaldo";
		cliente.idade = 100;
		cliente.sexo = "M";
		cliente.valorDivida = 100;
		
		try {
			cliente.anoNascimento = 1700;
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(cliente.toString());
		
		Vendedor vendedor = new Vendedor();
		vendedor.nome = "Junior";
		vendedor.idade = 12;
		vendedor.qntVendas = 5;
		vendedor.valorVendas = 1000;
		System.out.println(vendedor.toString());
		
		Gerente gerente = new Gerente();
		gerente.nomeGerencia = "Alphose";
		System.out.println(gerente.toString());
		
	}
}
