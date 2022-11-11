package q01;

public class Principal {
	public static void main(String[] agrs) {
		Empresa empresa = new Empresa();
		empresa.nomeEmpresa = "Paraiba";
		empresa.localEmpresa = "Piripiri";
		
		System.out.println("Nome da Empresa: "+empresa.nomeEmpresa);
		System.out.println("Local da Empresa: "+empresa.localEmpresa);

		Funcionario funcionario1 = new Funcionario();
		funcionario1.nome = "Junior";
		funcionario1.salario = 2100;
		funcionario1.idade = 27;
		funcionario1.cargo.nomeCargo = "Recepcionista";
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.nome = "Mateus";
		funcionario2.salario = 2300;
		funcionario2.idade = 24;
		funcionario2.cargo.nomeCargo = "Vendedor";
		
		Funcionario funcionario3 = new Funcionario();
		funcionario3.nome = "Bendito";
		funcionario3.salario = 1900;
		funcionario3.idade = 44;
		funcionario3.cargo.nomeCargo = "Fachineiro";
		
		empresa.adicionarNovoFuncionario(funcionario1);
		empresa.adicionarNovoFuncionario(funcionario2);
		empresa.adicionarNovoFuncionario(funcionario3);
		
		empresa.listarTodosFuncionarios();
		
		System.out.println("\nQuantidade de funcionarios: "+empresa.funcionarios.size());
		
		empresa.despedirFuncionario(funcionario1);
		
		empresa.listarTodosFuncionarios();
		
		System.out.println("\nQuantidade de funcionarios: "+empresa.funcionarios.size());
	}
}

















//ArrayList<String> bandas = new ArrayList<String>();
//bandas.add("Metallica");
//bandas.add("Slipknot");
//bandas.add("BMTH");
//bandas.add("BFMV");
//// Existe um método do ArrayList chamado 'toArray()'
//// que coloca todos os elementos de um ArrayList em um Array.
//// Ou seja: bandas.toArray() é um Array!
//System.out.println(Arrays.toString(bandas.toArray()));
//// retornando valor a partir do indice
//System.out.println(bandas.get(0));
//// número de elementos do array
//System.out.println(bandas.size());
//// removendo
//bandas.remove(0);
//bandas.remove("BMTH");
//System.out.println(Arrays.toString(bandas.toArray()));
//// removendo tudo
//bandas.clear();
//System.out.println(Arrays.toString(bandas.toArray()));
