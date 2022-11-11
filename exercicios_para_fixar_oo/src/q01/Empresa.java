package q01;
import java.util.ArrayList;

public class Empresa {
	String nomeEmpresa;
	String localEmpresa;
	
	ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();
	
	void adicionarNovoFuncionario(Funcionario funcionario){
		funcionarios.add(funcionario);
	}
	void despedirFuncionario(Funcionario funcionario){
		funcionarios.remove(funcionario);
	}
	void listarTodosFuncionarios(){
		for(int i=0; i<funcionarios.size(); i++) {
			System.out.println(funcionarios.get(i));
		}
	}
}
