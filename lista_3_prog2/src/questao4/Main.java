package questao4;

import java.util.ArrayList;

public class Main {
	public static void main(String args[]){
		ArrayList<Funcionario> executivo = new ArrayList<>();
		ArrayList<Funcionario> administrativo = new ArrayList<>();
		ArrayList<Funcionario> empressarial = new ArrayList<>();
		ArrayList<Funcionario> todosOsFuncionarios = new ArrayList<>();
		
		Funcionario fun1 = new Funcionario("Bruno", "023.573.456-98", TipoFuncionario.EXECUTIVO);	
		executivo.add(0, fun1);
		todosOsFuncionarios.add(0, fun1);
		
		Funcionario fun2 = new Funcionario("Jorberto", "025.573.455-98", TipoFuncionario.EMPRESSARIAL);
		empressarial.add(0, fun2);
		todosOsFuncionarios.add(1, fun2);
		
		Funcionario fun3 = new Funcionario("Alcirenilda", "078.557.850-98", TipoFuncionario.ADIMINISTRATIVO);
		administrativo.add(0, fun3);
		todosOsFuncionarios.add(2, fun3);
		
		fun1.imprimirInfo();
		fun2.imprimirInfo();
		fun3.imprimirInfo();
		
	}
}
