package q03;
import java.util.ArrayList;

public class Concessionaria {
	String nome;
	String local;
	ArrayList<Veiculo> veiculo = new ArrayList<Veiculo>();
	ArrayList<Humano> clientes = new ArrayList<Humano>();
	
	public void addVeiculo(Veiculo v) {
		veiculo.add(v);
	}
	public void listVeiculo() {
		System.out.println("======== VEICULOS ========\n");
		for(int i=0; i<veiculo.size();i++) {
			if(veiculo.get(i) != null) {
				System.out.println(veiculo.get(i)+"\n");				
			}
		}
	}
	public void listClientes() {
		System.out.println("========= CLIENTES ========\n");
		for(int i=0; i<clientes.size();i++) {
			if(clientes.get(i) != null) {
				System.out.println(" - Nome: "+clientes.get(i).nome);
				System.out.println(" - CPF: "+clientes.get(i).cpf);
				System.out.println(" - Idade: "+clientes.get(i).idade);
				System.out.println(" - Veiculo Alugado: \n");
				System.out.println("\t> Nome: "+clientes.get(i).veiculoAlugado.nomeVeiculo);
				System.out.println("\t> Placa: "+clientes.get(i).veiculoAlugado.placa);
				System.out.println("\t> Tipo: "+clientes.get(i).veiculoAlugado.tipoDeVeiculo+"\n");				
			}
		}
	}
	public void listAlugados() {
		System.out.println("==== VEICULOS ALUGADOS ====\n");
		for(int i=0; i<veiculo.size();i++) {
			if(veiculo.get(i) != null) {
				if(veiculo.get(i).estadoDoVeiculo == "Alugado") {
					System.out.println(" > "+veiculo.get(i).nomeVeiculo+" - "+veiculo.get(i).cor+" - "+veiculo.get(i).estadoDoVeiculo);				
				}
			}
		}
		System.out.println();
	}
	
	public void alugarVeiculo(Veiculo v, Humano h) {
		for(int i=0; i<veiculo.size(); i++) {
			if(veiculo.get(i) == v) {
				v.estadoDoVeiculo = "Alugado";
				h.veiculoAlugado = v;
				clientes.add(h);
			}
		}
	}
}
