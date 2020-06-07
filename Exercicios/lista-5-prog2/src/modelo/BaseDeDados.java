package modelo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BaseDeDados {

	private HashMap<Character, List<Pessoa>> contatos = new HashMap<>();
	

	public boolean adicionarContato(Pessoa novoContato) {
		// pega primeira letra do nome da pessoa
		Character chave = novoContato.getNome().toUpperCase().charAt(0);
		
		if(contatos.get(chave)!=null)
			contatos.get(chave).add(novoContato);
		else {
			// crio a lista para a letra que é a chave
			contatos.put(chave, new ArrayList<Pessoa>());
			// adiciono o novoContato na lista da chave
			contatos.get(chave).add(novoContato);
		}
		return true;
	}

	public boolean alteraContato(Pessoa umContato) {
		return false;
	}

	public boolean removerContato(Pessoa umContato) {
		return false;
	}

	public List<Pessoa> buscarContato(Pessoa umContato) {
		return null;
	}
}
