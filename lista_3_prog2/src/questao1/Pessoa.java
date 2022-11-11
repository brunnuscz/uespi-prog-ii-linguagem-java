package questao1;

public class Pessoa {
	
	private String nome;
	private int idade;
	private double altura;
	private double peso;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	
	public String getNovoNome() {
		return this.nome;
	}
	public int getNovaIdade() {
		return this.idade;
	}
	public double getNovaAltura() {
		return this.altura;
	}
	public double getNovoPeso() {
		return this.peso;
	}
	
	public double imcCalcular(double a, double p) {
		return p /  (a * a);
	}
	public void imprimirRes() {
		System.out.printf("\nNome: "+nome+"\nIdade: "+
							idade+"\nAltura: "+altura+
							"\nPeso: "+peso+"\nIMC: %.1f",imcCalcular(altura, peso));
	}
	
}
