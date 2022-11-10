package q07;

import java.util.ArrayList;

public class Oficina {
	String nome;
	String local;
	
	ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
	
	public Oficina(String n, String l){
		this.nome = n;
		this.local = l;
	}
	public void adicionarVeiculo(Veiculo v) {
		veiculos.add(v);
	}
	public void listarVeiculo() {
		System.out.println("=========== VEICULOS =============");
		for(int i=0; i<veiculos.size(); i++) {
			System.out.println("\n"+veiculos.get(i));				
		}
		System.out.println("\n==================================");
	}
	public void listarVeiculoASeremConcertados() {
		System.out.println("== VEICULOS A SEREM CONCERTADOS ==");
		for(int i=0; i<veiculos.size(); i++) {
			if(veiculos.get(i).estadoDoVeiculo != "Concertado") {
				System.out.println("\n"+veiculos.get(i));				
			}
		}
		System.out.println("\n==================================");
	}
	public void listarVeiculoConcertados() {
		System.out.println("====== VEICULOS CONCERTADOS ======");
		for(int i=0; i<veiculos.size(); i++) {
			if(veiculos.get(i).estadoDoVeiculo == "Concertado") {
				System.out.println("\n"+veiculos.get(i));				
			}
		}
		System.out.println("\n==================================");
	}
	public void concertarVeiculo(Veiculo v) {
		v.estadoDoVeiculo = "Concertado";
	}
	public void entrarVeiculo(Veiculo v) {
		for(int i=0; i<veiculos.size(); i++) {
			if(veiculos.get(i) == v) {
				veiculos.remove(i);
			}
		}
	}
}
