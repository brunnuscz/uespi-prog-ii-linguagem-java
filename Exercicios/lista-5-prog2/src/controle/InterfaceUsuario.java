package controle;

import java.util.ArrayList;

import modelo.Pessoa;

public abstract class InterfaceUsuario extends Pessoa{

	ArrayList<Pessoa> pessoa = new ArrayList<Pessoa>();
	
	public boolean adicionarCont(Pessoa novoCont) {
		return true;
	}
	
	public Pessoa buscarContato(ArrayList<?> pessoa) {
		return null;
	}
	
	public boolean removerContato(Pessoa p) {
		return true;
	}
	
	public boolean alterarContato(Pessoa p) {
		return true;
	}

	protected abstract void adicionarContato();
	
	

	
	
	
	
	
	
	
	
	
}
